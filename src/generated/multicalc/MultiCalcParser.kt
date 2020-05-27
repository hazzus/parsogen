
package multicalc
import java.util.*
import java.lang.Exception

class ParsingException(message: String) : Exception(message)

class MultiCalcParser(private val lexer: MultiCalcLexer) {
    private lateinit var current: Token
    
    private fun consume(expected: RawToken) {
        if (current.type != expected) {
           throw ParsingException("Expected ${expected}, but found ${current.type}")
        }
        current = lexer.next()
    }
    
    fun parse(): MutableList<Pair<String,Int>> {
        current = lexer.next()
        val result = parseStart()
        if (current.type != RawToken._END) {
            throw ParsingException("Expected end of input, but found $current.name")
        }
        return result
    }
    
    private fun parseStart(): MutableList<Pair<String,Int>> {
        when (current.type) {
            RawToken._END, RawToken.VAR -> {
                
                val parsogenVal1 = parseAsgList(HashMap<String,Int>())
                return parsogenVal1 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

    private fun parseAsgList(map: MutableMap<String,Int>): MutableList<Pair<String,Int>> {
        when (current.type) {
            RawToken.VAR -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.VAR)
                val parsogenVal2 = current.matched
                consume(RawToken.ASG)
                val parsogenVal3 = parseS(map)
                val parsogenVal4 = current.matched
                consume(RawToken.SEP)
                val parsogenVal5 = parseAsgList(map.apply { put(parsogenVal1, parsogenVal3) } )
               
                val tail = parsogenVal5
                tail.add(0, Pair(parsogenVal1, parsogenVal3))
                return tail
    
            }
            RawToken._END -> {
                
                return LinkedList<Pair<String, Int>>() 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

    private fun parseS(map: MutableMap<String,Int>): Int {
        when (current.type) {
            RawToken.SUB, RawToken.VAR, RawToken.NUM, RawToken.LBR -> {
                
                val parsogenVal1 = parseT(map)
                val parsogenVal2 = parseX(map, parsogenVal1)
                return parsogenVal2 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

    private fun parseX(map: MutableMap<String,Int>, acc: Int): Int {
        when (current.type) {
            RawToken.ADD -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.ADD)
                val parsogenVal2 = parseT(map)
                val parsogenVal3 = parseX(map, acc + parsogenVal2)
                return parsogenVal3 
            }
            RawToken.SUB -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.SUB)
                val parsogenVal2 = parseT(map)
                val parsogenVal3 = parseX(map, acc - parsogenVal2)
                return parsogenVal3 
            }
            RawToken.RBR, RawToken.SEP -> {
                
                return acc 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

    private fun parseT(map: MutableMap<String,Int>): Int {
        when (current.type) {
            RawToken.SUB, RawToken.VAR, RawToken.NUM, RawToken.LBR -> {
                
                val parsogenVal1 = parseF(map)
                val parsogenVal2 = parseY(map, parsogenVal1)
                return parsogenVal2 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

    private fun parseY(map: MutableMap<String,Int>, acc: Int): Int {
        when (current.type) {
            RawToken.MUL -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.MUL)
                val parsogenVal2 = parseF(map)
                val parsogenVal3 = parseY(map, acc * parsogenVal2)
                return parsogenVal3 
            }
            RawToken.ADD, RawToken.SUB, RawToken.RBR, RawToken.SEP -> {
                
                return acc 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

    private fun parseF(map: MutableMap<String,Int>): Int {
        when (current.type) {
            RawToken.SUB -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.SUB)
                val parsogenVal2 = parseF(map)
                return -parsogenVal2 
            }
            RawToken.NUM -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.NUM)
                return parsogenVal1.toInt() 
            }
            RawToken.LBR -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.LBR)
                val parsogenVal2 = parseS(map)
                val parsogenVal3 = current.matched
                consume(RawToken.RBR)
                return parsogenVal2 
            }
            RawToken.VAR -> {
                
                val parsogenVal1 = current.matched
                consume(RawToken.VAR)
                return map[parsogenVal1]!! 
            }
            else -> {
               throw ParsingException("Unexpected token: ${current.matched}")
            }
        }
    }

}