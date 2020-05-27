package grammar

import generators.ParserBuildException
import kotlin.collections.HashMap
import kotlin.collections.HashSet

data class Grammar(
    val header: String,
    val tokens: List<TokenRule>,
    val ignore: List<String>,
    val rules: List<ParserRule>,
    val start: String
) {

    private val first = HashMap<String, HashSet<String>>()
    private val follow = HashMap<String, HashSet<String>>()

    init {
        buildFirst()
        buildFollow()
        checkGrammar()
    }

    private fun getFirst(atoms: List<RuleAtom>): Set<String> {
        if (atoms.isEmpty()) {
            return setOf("EPS")
        }
        val begin = atoms[0]
        return if (begin is Terminal) {
            setOf(begin.name)
        } else {
            begin as NonTerminal
            first.putIfAbsent(begin.name, HashSet())
            val res = first[begin.name]!!
            if (res.contains("EPS")) {
                res.remove("EPS")
                res.addAll(getFirst(atoms.subList(1, atoms.size)))
            }
            res
        }
    }

    private fun getFirst(alt: RuleAlternative): Set<String> {
        if (alt is EpsilonAlternative) {
            return setOf("EPS")
        }
        return getFirst((alt as AtomAlternative).atoms)
    }

    fun getRuleTokens(rule: ParserRule, alt: RuleAlternative): Set<String> {
        val res: MutableSet<String> = HashSet(getFirst(alt))
        if (res.contains("EPS")) {
            res.addAll(follow[rule.name]!!)
        }
        res.remove("EPS")
        return res
    }

    private fun buildFirst() {
        var changed = true
        while (changed) {
            changed = false
            for (rule in this.rules) {
                for (alt in rule.alts) {
                    first.putIfAbsent(rule.name, HashSet())
                    val previous = first[rule.name]!!.size
                    first[rule.name]!!.addAll(getFirst(alt))
                    if (previous != first[rule.name]!!.size) {
                        changed = true
                    }
                }
            }
        }
    }

    private fun buildFollow() {
        follow[start] = HashSet()
        follow[start]!!.add("_END")
        var changed = true
        while (changed) {
            changed = false
            for (rule in rules) {
                for (alt in rule.alts) {
                    if (alt is EpsilonAlternative) {
                        continue
                    }
                    val atoms = (alt as AtomAlternative).atoms
                    for (i in atoms.indices) {
                        if (atoms[i] is Terminal) {
                            continue
                        }
                        val current = atoms[i] as NonTerminal
                        val tmp = getFirst(atoms.subList(i + 1, atoms.size))
                        val hadEps = tmp.contains("EPS")
                        follow.putIfAbsent(current.name, HashSet())
                        val previous = follow[current.name]!!.size
                        follow[current.name]!!.addAll(tmp)
                        follow[current.name]!!.remove("EPS")
                        if (hadEps) {
                            follow.putIfAbsent(rule.name, HashSet())
                            follow[current.name]!!.addAll(follow[rule.name]!!)
                        }
                        if (follow[current.name]!!.size != previous) {
                            changed = true
                        }
                    }
                }
            }
        }
    }

    private fun checkGrammar() {
        rules.map { rule ->
            for (alt1 in rule.alts) {
                for (alt2 in rule.alts) {
                    if (alt1 === alt2) continue
                    val first1 = getFirst(alt1)
                    val first2 = getFirst(alt2)
                    if (first1.intersect(first2).isNotEmpty()) {
                        throw ParserBuildException("Not LL1 grammar")
                    }
                    if (first1.contains("EPS")) {
                        if (follow[rule.name]!!.intersect(first1).isNotEmpty()) {
                            throw ParserBuildException("Not LL1 grammar")
                        }
                    }
                }
            }
        }
    }

}

data class TokenRule(val name: String, val regex: String)

data class ParserRule(
    val name: String,
    val args: List<RuleArgument>,
    val type: String,
    val alts: List<RuleAlternative>
)

data class RuleArgument(val name: String, val type: String)

abstract class RuleAlternative(val init: String?)

class EpsilonAlternative(init: String?, val code: String?) : RuleAlternative(init)

class AtomAlternative(init: String?, val atoms: List<RuleAtom>, val code: String?) : RuleAlternative(init)

abstract class RuleAtom(val name: String)

class Terminal(name: String) : RuleAtom(name)

class NonTerminal(name: String, val params: List<String>) : RuleAtom(name)