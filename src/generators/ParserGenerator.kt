package generators

import grammar.*
import util.*
import util.resolvePath
import java.nio.file.Files
import java.nio.file.Path

class ParserBuildException(message: String) : Exception(message)

private fun generateAtom(atom: RuleAtom, index: Int): String {
    return if (atom is Terminal) {
        """
        |                val parsogenVal${index} = current.matched
        |                consume(RawToken.${atom.name})
        """.trimMargin()
    } else {
        atom as NonTerminal
        """
        |                val parsogenVal${index} = parse${atom.name}(${buildParameters(atom.params)})
        """.trimMargin()
    }
}

private fun generateAlternative(alt: RuleAlternative, rule: ParserRule, grammar: Grammar): String {
    val markers = grammar.getRuleTokens(rule, alt)
    return """
    |            ${markers.joinToString(", ") {"RawToken.${it}"}} -> {
    |                ${alt.init?.substring(1, alt.init.length - 1) ?: ""}
    |${ { 
             if (alt is EpsilonAlternative) { 
                 "               " + alt.code?.substring(1, alt.code.length - 1) ?: ""
             } else {
                 alt as AtomAlternative
                 var res = ""
                 for (i in 1..alt.atoms.size) {
                    res += generateAtom(alt.atoms[i - 1], i) + "\n"
                 }
                 res + "               " + formatCode(alt.code)
             }
         }() }
    |            }
    """.trimMargin()
}

private fun generateRuleFunction(rule: ParserRule, grammar: Grammar): String {
    return """
    |    private fun parse${rule.name}(${buildArguments(rule.args)}): ${rule.type} {
    |        when (current.type) {
    |${rule.alts.joinToString("\n") { alt -> generateAlternative(alt, rule, grammar)}}
    |            else -> {
    |               throw ParsingException("Unexpected token: ${'$'}{current.matched}")
    |            }
    |        }
    |    }
    """.trimMargin()
}

fun generateParser(folder: Path?, name: String, grammar: Grammar) {
    val parserPath = resolvePath(folder, name, "Parser")
    Files.newBufferedWriter(parserPath).use { writer ->
        writer.write(grammar.header.substring(1, grammar.header.length - 1))
        val start = grammar.rules.find { rule -> rule.name == grammar.start } ?: throw ParserBuildException("No start rule")
        writer.write(
            """
                |import java.lang.Exception
                |
                |class ParsingException(message: String) : Exception(message)
                |
                |class ${name}Parser(private val lexer: ${name}Lexer) {
                |    private lateinit var current: Token
                |    
                |    private fun consume(expected: RawToken) {
                |        if (current.type != expected) {
                |           throw ParsingException("Expected ${'$'}{expected}, but found ${'$'}{current.type}")
                |        }
                |        current = lexer.next()
                |    }
                |    
                |    fun parse(${buildArguments(start.args)}): ${start.type} {
                |        current = lexer.next()
                |        val result = parse${grammar.start}(${buildArgumentsNoType(start.args)})
                |        if (current.type != RawToken._END) {
                |            throw ParsingException("Expected end of input, but found ${'$'}current.name")
                |        }
                |        return result
                |    }
                |    
                |${grammar.rules.joinToString("\n\n") { generateRuleFunction(it, grammar) }}
                |
                |}
            """.trimMargin())
    }
}