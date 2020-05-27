package generated

import calc.*
import multicalc.*
import pascalLogic.*
import java.nio.file.Paths

fun main() {
    while (true) {
        val x = readLine() ?: return
        val lexer = CalcLexer(x)
        val parser = CalcParser(lexer)
        println(parser.parse())
    }
}