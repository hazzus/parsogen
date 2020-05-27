
package pascalLogic
import java.util.regex.Pattern

enum class RawToken(val regex: Pattern) {
    WS(Pattern.compile("[ \t]+")),
    NL(Pattern.compile("[\n\r]+")),
    AND(Pattern.compile("and")),
    OR(Pattern.compile("or")),
    XOR(Pattern.compile("xor")),
    NOT(Pattern.compile("not")),
    LBR(Pattern.compile("\\(")),
    RBR(Pattern.compile("\\)")),
    VAR(Pattern.compile("[a-zA-Z][a-zA-Z0-9_]*")),
    _END(Pattern.compile(""))
}

data class Token(val type: RawToken, val name: String, val matched: String)