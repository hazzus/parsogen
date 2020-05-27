
package calc

import java.util.regex.Matcher
import java.util.regex.Pattern
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.lang.Exception

class LexingException(message: String) : Exception(message)

class CalcLexer {
    private val ignore: Pattern = Pattern.compile("([ \t]+)|([\n\r]+)")
    private val matcher: Matcher = Pattern.compile("").matcher("")
    private var text: String
    
    constructor(input: Path) {
        this.text = Files.readString(input, StandardCharsets.UTF_8)
    }
    
    constructor(text: String) {
        this.text = text
    }
    
    fun next(): Token {
        matcher.usePattern(ignore)
        matcher.reset(text)
        while (matcher.lookingAt()) {
            text = text.substring(matcher.end())
            matcher.reset(text)
        }
        val current = text;
        val valuableTokens = RawToken.values().filter { it != RawToken._END }
        val matched = valuableTokens.any {
            matcher.usePattern(it.regex)
            matcher.reset(current)
            return@any matcher.lookingAt()
        }
        if (!matched) {
            if (text.isEmpty()) {
                return Token(RawToken._END, "_END", "")
            } else {
               throw LexingException("Unknown input: $text")
            }
        } else {
            for (type in valuableTokens) {
                matcher.usePattern(type.regex)
                matcher.reset(text)
                if (matcher.lookingAt()) {
                    val match = text.substring(0, matcher.end())
                    text = text.substring(match.length)
                    return Token(type, type.name, match)
                }
            }
        }
        throw LexingException("Reached unreachable code")
    }
}
