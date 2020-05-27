
package calc
import java.lang.Exception

class ParsingException(message: String) : Exception(message)

class CalcParser(private val lexer: CalcLexer) {
    private lateinit var current: Token
    
    private fun consume(expected: RawToken) {
        if (current.type != expected) {
           throw ParsingException("Expected ${expected}, but found ${current.type}")
        }
        current = lexer.next()
    }
    
    fun parse(): Int {
        current = lexer.next()
        val result = parseS()
        if (current.type != RawToken._END) {
            throw ParsingException("Expected end of input, but found $current.name")
        }
        return result
    }
    
    private fun parseS(): Int {
        when (current.type) {
            RawToken.SUB, RawToken.NUM, RawToken.LBR -> {
                
                val parsogenVal1 = parseT()
                val parsogenVal2 = parseX(parsogenVal1)
                return parsogenVal2 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

    private fun parseX(acc: Int): Int {
        when (current.type) {
            RawToken.ADD -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.ADD)
                val parsogenVal2 = parseT()
                val parsogenVal3 = parseX(acc + parsogenVal2)
                return parsogenVal3 
            }
            RawToken.SUB -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.SUB)
                val parsogenVal2 = parseT()
                val parsogenVal3 = parseX(acc - parsogenVal2)
                return parsogenVal3 
            }
            RawToken._END, RawToken.RBR -> {
                
                return acc 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

    private fun parseT(): Int {
        when (current.type) {
            RawToken.SUB, RawToken.NUM, RawToken.LBR -> {
                
                val parsogenVal1 = parseF()
                val parsogenVal2 = parseY(parsogenVal1)
                return parsogenVal2 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

    private fun parseY(acc: Int): Int {
        when (current.type) {
            RawToken.MUL -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.MUL)
                val parsogenVal2 = parseF()
                val parsogenVal3 = parseY(acc * parsogenVal2)
                return parsogenVal3 
            }
            RawToken._END, RawToken.ADD, RawToken.SUB, RawToken.RBR -> {
                
                return acc 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

    private fun parseF(): Int {
        when (current.type) {
            RawToken.NUM -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.NUM)
                return parsogenVal1.toInt() 
            }
            RawToken.SUB -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.SUB)
                val parsogenVal2 = parseA()
                return -parsogenVal2 
            }
            RawToken.LBR -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.LBR)
                val parsogenVal2 = parseS()
                val parsogenVal3 = current.matched
                consume(RawToken.RBR)
                return parsogenVal2 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

    private fun parseA(): Int {
        when (current.type) {
            RawToken.NUM -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.NUM)
                return parsogenVal1.toInt() 
            }
            RawToken.LBR -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.LBR)
                val parsogenVal2 = parseS()
                val parsogenVal3 = current.matched
                consume(RawToken.RBR)
                return parsogenVal2 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

}