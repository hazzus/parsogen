
package calc
import java.util.regex.Pattern

enum class RawToken(val regex: Pattern) {
    WS(Pattern.compile("[ \t]+")),
    NL(Pattern.compile("[\n\r]+")),
    NUM(Pattern.compile("[1-9][0-9]*")),
    ADD(Pattern.compile("\\+")),
    SUB(Pattern.compile("-")),
    MUL(Pattern.compile("\\*")),
    DIV(Pattern.compile("/")),
    LBR(Pattern.compile("\\(")),
    RBR(Pattern.compile("\\)")),
    _END(Pattern.compile(""))
}

data class Token(val type: RawToken, val name: String, val matched: String)