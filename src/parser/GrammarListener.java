// Generated from src/parser/Grammar.g4 by ANTLR 4.7.2

package parser;
import grammar.*;
import java.util.LinkedList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#full}.
	 * @param ctx the parse tree
	 */
	void enterFull(GrammarParser.FullContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#full}.
	 * @param ctx the parse tree
	 */
	void exitFull(GrammarParser.FullContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#toks}.
	 * @param ctx the parse tree
	 */
	void enterToks(GrammarParser.ToksContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#toks}.
	 * @param ctx the parse tree
	 */
	void exitToks(GrammarParser.ToksContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tokensList}.
	 * @param ctx the parse tree
	 */
	void enterTokensList(GrammarParser.TokensListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tokensList}.
	 * @param ctx the parse tree
	 */
	void exitTokensList(GrammarParser.TokensListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#singleToken}.
	 * @param ctx the parse tree
	 */
	void enterSingleToken(GrammarParser.SingleTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#singleToken}.
	 * @param ctx the parse tree
	 */
	void exitSingleToken(GrammarParser.SingleTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ignore}.
	 * @param ctx the parse tree
	 */
	void enterIgnore(GrammarParser.IgnoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ignore}.
	 * @param ctx the parse tree
	 */
	void exitIgnore(GrammarParser.IgnoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ignoreList}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreList(GrammarParser.IgnoreListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ignoreList}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreList(GrammarParser.IgnoreListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(GrammarParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(GrammarParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ruleList}.
	 * @param ctx the parse tree
	 */
	void enterRuleList(GrammarParser.RuleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ruleList}.
	 * @param ctx the parse tree
	 */
	void exitRuleList(GrammarParser.RuleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#singleRule}.
	 * @param ctx the parse tree
	 */
	void enterSingleRule(GrammarParser.SingleRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#singleRule}.
	 * @param ctx the parse tree
	 */
	void exitSingleRule(GrammarParser.SingleRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(GrammarParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(GrammarParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#alternatives}.
	 * @param ctx the parse tree
	 */
	void enterAlternatives(GrammarParser.AlternativesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#alternatives}.
	 * @param ctx the parse tree
	 */
	void exitAlternatives(GrammarParser.AlternativesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ruleBody}.
	 * @param ctx the parse tree
	 */
	void enterRuleBody(GrammarParser.RuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ruleBody}.
	 * @param ctx the parse tree
	 */
	void exitRuleBody(GrammarParser.RuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#atoms}.
	 * @param ctx the parse tree
	 */
	void enterAtoms(GrammarParser.AtomsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#atoms}.
	 * @param ctx the parse tree
	 */
	void exitAtoms(GrammarParser.AtomsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(GrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(GrammarParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(GrammarParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(GrammarParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nonTerminal}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminal(GrammarParser.NonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nonTerminal}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminal(GrammarParser.NonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(GrammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(GrammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
}