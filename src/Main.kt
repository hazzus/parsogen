import generators.*
import grammar.Grammar
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.RecognitionException
import parser.*
import java.lang.Exception
import java.nio.file.*

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Expected at least 1 argument")
        println("Run with args: <grammar> [output path]")
        return
    }
    val input: Path
    val lexer: GrammarLexer
    try {
        input = Paths.get(args[0])
        lexer = GrammarLexer(CharStreams.fromPath(input))
    } catch (e: Exception) {
        e.printStackTrace();
        return;
    }
    val parser: GrammarParser
    val grammar: Grammar
    try {
        parser = GrammarParser(CommonTokenStream(lexer))
        grammar = parser.full().grammar
    } catch (e: RecognitionException) {
        e.printStackTrace()
        return;
    }
    try {
        var output : Path? = null
        if (args.size > 1) {
            output = Paths.get(args[1])
            Files.createDirectories(output!!)
        }
        val name = input.getName(input.nameCount - 1).toString().removeSuffix(".gr")
        generateLexer(output, name, grammar)
        generateParser(output, name, grammar)
    } catch (e: ParserBuildException) {
        e.printStackTrace()
    }
}