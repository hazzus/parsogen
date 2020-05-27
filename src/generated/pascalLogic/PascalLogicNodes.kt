package pascalLogic

abstract class Node

data class OrNode(val left: Node, val right: Node): Node()

data class XorNode(val left: Node, val right: Node): Node()

data class AndNode(val left: Node, val right: Node): Node()

data class NotNode(val sub: Node): Node()

data class VarNode(val value: String): Node()
