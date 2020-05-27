
package pascalLogic
import java.lang.Exception

class ParsingException(message: String) : Exception(message)

class PascalLogicParser(private val lexer: PascalLogicLexer) {
    private lateinit var current: Token
    
    private fun consume(expected: RawToken) {
        if (current.type != expected) {
           throw ParsingException("Expected ${expected}, but found ${current.type}")
        }
        current = lexer.next()
    }
    
    fun parse(): Node {
        current = lexer.next()
        val result = parseS()
        if (current.type != RawToken._END) {
            throw ParsingException("Expected end of input, but found $current.name")
        }
        return result
    }
    
    private fun parseS(): Node {
        when (current.type) {
            RawToken.NOT, RawToken.VAR, RawToken.LBR -> {
                
                val parsogenVal1 = parseT()
                val parsogenVal2 = parseX(parsogenVal1)
                return parsogenVal2 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

    private fun parseX(left: Node): Node {
        when (current.type) {
            RawToken.OR -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.OR)
                val parsogenVal2 = parseT()
                val parsogenVal3 = parseX(OrNode(left, parsogenVal2))
                return parsogenVal3 
            }
            RawToken.XOR -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.XOR)
                val parsogenVal2 = parseT()
                val parsogenVal3 = parseX(XorNode(left, parsogenVal2))
                return parsogenVal3 
            }
            RawToken._END -> {
                
                return left 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

    private fun parseT(): Node {
        when (current.type) {
            RawToken.NOT, RawToken.VAR, RawToken.LBR -> {
                
                val parsogenVal1 = parseF()
                val parsogenVal2 = parseY(parsogenVal1)
                return parsogenVal2 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

    private fun parseY(left: Node): Node {
        when (current.type) {
            RawToken.AND -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.AND)
                val parsogenVal2 = parseF()
                val parsogenVal3 = parseY(AndNode(left, parsogenVal2))
                return parsogenVal3 
            }
            RawToken._END, RawToken.OR, RawToken.XOR -> {
                
                return left 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

    private fun parseF(): Node {
        when (current.type) {
            RawToken.NOT -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.NOT)
                val parsogenVal2 = parseF()
                return NotNode(parsogenVal2) 
            }
            RawToken.VAR -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.VAR)
                return VarNode(parsogenVal1) 
            }
            RawToken.LBR -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.LBR)
                val parsogenVal2 = parseF()
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