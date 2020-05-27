// Generated from src/parser/Grammar.g4 by ANTLR 4.7.2

package parser;
import grammar.*;
import java.util.LinkedList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WHITESPACE=10, EPS=11, TOKENS=12, IGNORE=13, START=14, RULES=15, CODE=16, 
		NAME=17, REGEX=18;
	public static final int
		RULE_full = 0, RULE_toks = 1, RULE_tokensList = 2, RULE_singleToken = 3, 
		RULE_ignore = 4, RULE_ignoreList = 5, RULE_rules = 6, RULE_ruleList = 7, 
		RULE_singleRule = 8, RULE_arguments = 9, RULE_argument = 10, RULE_alternatives = 11, 
		RULE_ruleBody = 12, RULE_atoms = 13, RULE_atom = 14, RULE_terminal = 15, 
		RULE_nonTerminal = 16, RULE_parameters = 17, RULE_start = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"full", "toks", "tokensList", "singleToken", "ignore", "ignoreList", 
			"rules", "ruleList", "singleRule", "arguments", "argument", "alternatives", 
			"ruleBody", "atoms", "atom", "terminal", "nonTerminal", "parameters", 
			"start"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'='", "';'", "'('", "')'", "':'", "','", "'|'", 
			null, "'$'", "'@tokens'", "'@skip'", "'@start'", "'@rules'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "WHITESPACE", 
			"EPS", "TOKENS", "IGNORE", "START", "RULES", "CODE", "NAME", "REGEX"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FullContext extends ParserRuleContext {
		public Grammar grammar;
		public Token h;
		public ToksContext t;
		public IgnoreContext i;
		public RulesContext r;
		public StartContext s;
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public ToksContext toks() {
			return getRuleContext(ToksContext.class,0);
		}
		public IgnoreContext ignore() {
			return getRuleContext(IgnoreContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public FullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFull(this);
		}
	}

	public final FullContext full() throws RecognitionException {
		FullContext _localctx = new FullContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_full);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			((FullContext)_localctx).h = match(CODE);
			setState(39);
			((FullContext)_localctx).t = toks();
			setState(40);
			((FullContext)_localctx).i = ignore();
			setState(41);
			((FullContext)_localctx).r = rules();
			setState(42);
			((FullContext)_localctx).s = start();

			        ((FullContext)_localctx).grammar =  new Grammar((((FullContext)_localctx).h!=null?((FullContext)_localctx).h.getText():null), ((FullContext)_localctx).t.val, ((FullContext)_localctx).i.val, ((FullContext)_localctx).r.val, ((FullContext)_localctx).s.val);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToksContext extends ParserRuleContext {
		public List<TokenRule> val;
		public TokensListContext t;
		public TerminalNode TOKENS() { return getToken(GrammarParser.TOKENS, 0); }
		public TokensListContext tokensList() {
			return getRuleContext(TokensListContext.class,0);
		}
		public ToksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToks(this);
		}
	}

	public final ToksContext toks() throws RecognitionException {
		ToksContext _localctx = new ToksContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_toks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(TOKENS);
			setState(46);
			match(T__0);
			setState(47);
			((ToksContext)_localctx).t = tokensList();
			setState(48);
			match(T__1);

			        ((ToksContext)_localctx).val =  ((ToksContext)_localctx).t.val;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokensListContext extends ParserRuleContext {
		public List<TokenRule> val;
		public SingleTokenContext head;
		public TokensListContext tail;
		public SingleTokenContext singleToken() {
			return getRuleContext(SingleTokenContext.class,0);
		}
		public TokensListContext tokensList() {
			return getRuleContext(TokensListContext.class,0);
		}
		public TokensListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokensList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTokensList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTokensList(this);
		}
	}

	public final TokensListContext tokensList() throws RecognitionException {
		TokensListContext _localctx = new TokensListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tokensList);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((TokensListContext)_localctx).head = singleToken();
				setState(52);
				((TokensListContext)_localctx).tail = tokensList();

				        ((TokensListContext)_localctx).val =  ((TokensListContext)_localctx).tail.val;
				        _localctx.val.add(0, ((TokensListContext)_localctx).head.val);
				    
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				 ((TokensListContext)_localctx).val =  new LinkedList<TokenRule>(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTokenContext extends ParserRuleContext {
		public TokenRule val;
		public Token id;
		public Token regex;
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode REGEX() { return getToken(GrammarParser.REGEX, 0); }
		public SingleTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSingleToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSingleToken(this);
		}
	}

	public final SingleTokenContext singleToken() throws RecognitionException {
		SingleTokenContext _localctx = new SingleTokenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((SingleTokenContext)_localctx).id = match(NAME);
			setState(59);
			match(T__2);
			setState(60);
			((SingleTokenContext)_localctx).regex = match(REGEX);
			setState(61);
			match(T__3);

			        ((SingleTokenContext)_localctx).val =  new TokenRule((((SingleTokenContext)_localctx).id!=null?((SingleTokenContext)_localctx).id.getText():null), (((SingleTokenContext)_localctx).regex!=null?((SingleTokenContext)_localctx).regex.getText():null));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgnoreContext extends ParserRuleContext {
		public List<String> val;
		public IgnoreListContext ignores;
		public TerminalNode IGNORE() { return getToken(GrammarParser.IGNORE, 0); }
		public IgnoreListContext ignoreList() {
			return getRuleContext(IgnoreListContext.class,0);
		}
		public IgnoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIgnore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIgnore(this);
		}
	}

	public final IgnoreContext ignore() throws RecognitionException {
		IgnoreContext _localctx = new IgnoreContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ignore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IGNORE);
			setState(65);
			match(T__0);
			setState(66);
			((IgnoreContext)_localctx).ignores = ignoreList();
			setState(67);
			match(T__1);

			        ((IgnoreContext)_localctx).val =  ((IgnoreContext)_localctx).ignores.val;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgnoreListContext extends ParserRuleContext {
		public List<String> val;
		public Token head;
		public IgnoreListContext tail;
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public IgnoreListContext ignoreList() {
			return getRuleContext(IgnoreListContext.class,0);
		}
		public IgnoreListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoreList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIgnoreList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIgnoreList(this);
		}
	}

	public final IgnoreListContext ignoreList() throws RecognitionException {
		IgnoreListContext _localctx = new IgnoreListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ignoreList);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				((IgnoreListContext)_localctx).head = match(NAME);
				setState(71);
				match(T__3);
				setState(72);
				((IgnoreListContext)_localctx).tail = ignoreList();

				        ((IgnoreListContext)_localctx).val =  ((IgnoreListContext)_localctx).tail.val;
				        _localctx.val.add(0, (((IgnoreListContext)_localctx).head!=null?((IgnoreListContext)_localctx).head.getText():null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				((IgnoreListContext)_localctx).head = match(NAME);

				        ((IgnoreListContext)_localctx).val =  new LinkedList<String>();
				        _localctx.val.add(0, (((IgnoreListContext)_localctx).head!=null?((IgnoreListContext)_localctx).head.getText():null));
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 ((IgnoreListContext)_localctx).val =  new LinkedList<String>(); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesContext extends ParserRuleContext {
		public List<ParserRule> val;
		public RuleListContext r;
		public TerminalNode RULES() { return getToken(GrammarParser.RULES, 0); }
		public RuleListContext ruleList() {
			return getRuleContext(RuleListContext.class,0);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRules(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rules);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(RULES);
			setState(81);
			match(T__0);
			setState(82);
			((RulesContext)_localctx).r = ruleList();
			setState(83);
			match(T__1);

			        ((RulesContext)_localctx).val =  ((RulesContext)_localctx).r.val;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleListContext extends ParserRuleContext {
		public List<ParserRule> val;
		public SingleRuleContext head;
		public RuleListContext tail;
		public SingleRuleContext singleRule() {
			return getRuleContext(SingleRuleContext.class,0);
		}
		public RuleListContext ruleList() {
			return getRuleContext(RuleListContext.class,0);
		}
		public RuleListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRuleList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRuleList(this);
		}
	}

	public final RuleListContext ruleList() throws RecognitionException {
		RuleListContext _localctx = new RuleListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ruleList);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((RuleListContext)_localctx).head = singleRule();
				setState(87);
				((RuleListContext)_localctx).tail = ruleList();

				        ((RuleListContext)_localctx).val =  ((RuleListContext)_localctx).tail.val;
				        _localctx.val.add(0, ((RuleListContext)_localctx).head.val);
				    
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				 ((RuleListContext)_localctx).val =  new LinkedList<ParserRule>(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleRuleContext extends ParserRuleContext {
		public ParserRule val;
		public Token name;
		public ArgumentsContext args;
		public Token type;
		public AlternativesContext alts;
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public AlternativesContext alternatives() {
			return getRuleContext(AlternativesContext.class,0);
		}
		public SingleRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSingleRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSingleRule(this);
		}
	}

	public final SingleRuleContext singleRule() throws RecognitionException {
		SingleRuleContext _localctx = new SingleRuleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_singleRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((SingleRuleContext)_localctx).name = match(NAME);
			setState(94);
			match(T__4);
			setState(95);
			((SingleRuleContext)_localctx).args = arguments();
			setState(96);
			match(T__5);
			setState(97);
			match(T__6);
			setState(98);
			((SingleRuleContext)_localctx).type = match(NAME);
			setState(99);
			match(T__2);
			setState(100);
			((SingleRuleContext)_localctx).alts = alternatives();
			setState(101);
			match(T__3);

			        ((SingleRuleContext)_localctx).val =  new ParserRule((((SingleRuleContext)_localctx).name!=null?((SingleRuleContext)_localctx).name.getText():null), ((SingleRuleContext)_localctx).args.val, (((SingleRuleContext)_localctx).type!=null?((SingleRuleContext)_localctx).type.getText():null), ((SingleRuleContext)_localctx).alts.val);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<RuleArgument> val;
		public ArgumentContext head;
		public ArgumentsContext tail;
		public ArgumentContext x;
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arguments);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				((ArgumentsContext)_localctx).head = argument();
				setState(105);
				match(T__7);
				setState(106);
				((ArgumentsContext)_localctx).tail = arguments();

				        ((ArgumentsContext)_localctx).val =  ((ArgumentsContext)_localctx).tail.val;
				        _localctx.val.add(0, ((ArgumentsContext)_localctx).head.val);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				((ArgumentsContext)_localctx).x = argument();

				        ((ArgumentsContext)_localctx).val =  new LinkedList<RuleArgument>();
				        _localctx.val.add(0, ((ArgumentsContext)_localctx).x.val);
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 ((ArgumentsContext)_localctx).val =  new LinkedList<RuleArgument>(); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public RuleArgument val;
		public Token name;
		public Token type;
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((ArgumentContext)_localctx).name = match(NAME);
			setState(116);
			match(T__6);
			setState(117);
			((ArgumentContext)_localctx).type = match(NAME);

			        ((ArgumentContext)_localctx).val =  new RuleArgument((((ArgumentContext)_localctx).name!=null?((ArgumentContext)_localctx).name.getText():null), (((ArgumentContext)_localctx).type!=null?((ArgumentContext)_localctx).type.getText():null));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlternativesContext extends ParserRuleContext {
		public List<RuleAlternative> val;
		public RuleBodyContext head;
		public AlternativesContext tail;
		public RuleBodyContext ruleBody() {
			return getRuleContext(RuleBodyContext.class,0);
		}
		public AlternativesContext alternatives() {
			return getRuleContext(AlternativesContext.class,0);
		}
		public AlternativesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternatives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAlternatives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAlternatives(this);
		}
	}

	public final AlternativesContext alternatives() throws RecognitionException {
		AlternativesContext _localctx = new AlternativesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alternatives);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				((AlternativesContext)_localctx).head = ruleBody();
				setState(121);
				match(T__8);
				setState(122);
				((AlternativesContext)_localctx).tail = alternatives();

				        ((AlternativesContext)_localctx).val =  ((AlternativesContext)_localctx).tail.val;
				        _localctx.val.add(0, ((AlternativesContext)_localctx).head.val);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				((AlternativesContext)_localctx).head = ruleBody();

				        ((AlternativesContext)_localctx).val =  new LinkedList<RuleAlternative>();
				        _localctx.val.add(0, ((AlternativesContext)_localctx).head.val);
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 ((AlternativesContext)_localctx).val =  new LinkedList<RuleAlternative>(); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleBodyContext extends ParserRuleContext {
		public RuleAlternative val;
		public Token init;
		public Token code;
		public AtomsContext bodies;
		public AtomsContext atoms;
		public TerminalNode EPS() { return getToken(GrammarParser.EPS, 0); }
		public List<TerminalNode> CODE() { return getTokens(GrammarParser.CODE); }
		public TerminalNode CODE(int i) {
			return getToken(GrammarParser.CODE, i);
		}
		public AtomsContext atoms() {
			return getRuleContext(AtomsContext.class,0);
		}
		public RuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRuleBody(this);
		}
	}

	public final RuleBodyContext ruleBody() throws RecognitionException {
		RuleBodyContext _localctx = new RuleBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ruleBody);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(131);
					((RuleBodyContext)_localctx).init = match(CODE);
					}
				}

				setState(134);
				match(EPS);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(135);
					((RuleBodyContext)_localctx).code = match(CODE);
					}
				}


				        ((RuleBodyContext)_localctx).val =  new EpsilonAlternative((((RuleBodyContext)_localctx).init!=null?((RuleBodyContext)_localctx).init.getText():null), (((RuleBodyContext)_localctx).code!=null?((RuleBodyContext)_localctx).code.getText():null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(139);
					((RuleBodyContext)_localctx).init = match(CODE);
					}
					break;
				}
				setState(142);
				((RuleBodyContext)_localctx).bodies = ((RuleBodyContext)_localctx).atoms = atoms();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(143);
					((RuleBodyContext)_localctx).code = match(CODE);
					}
				}


				        ((RuleBodyContext)_localctx).val =  new AtomAlternative((((RuleBodyContext)_localctx).init!=null?((RuleBodyContext)_localctx).init.getText():null), ((RuleBodyContext)_localctx).atoms.val, (((RuleBodyContext)_localctx).code!=null?((RuleBodyContext)_localctx).code.getText():null));
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomsContext extends ParserRuleContext {
		public List<RuleAtom> val;
		public AtomContext head;
		public AtomsContext tail;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomsContext atoms() {
			return getRuleContext(AtomsContext.class,0);
		}
		public AtomsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atoms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAtoms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAtoms(this);
		}
	}

	public final AtomsContext atoms() throws RecognitionException {
		AtomsContext _localctx = new AtomsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atoms);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				((AtomsContext)_localctx).head = atom();
				setState(151);
				((AtomsContext)_localctx).tail = atoms();

				        ((AtomsContext)_localctx).val =  ((AtomsContext)_localctx).tail.val;
				        _localctx.val.add(0, ((AtomsContext)_localctx).head.val);
				    
				}
				break;
			case T__3:
			case T__8:
			case CODE:
				enterOuterAlt(_localctx, 2);
				{
				 ((AtomsContext)_localctx).val =  new LinkedList<RuleAtom>(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public RuleAtom val;
		public TerminalContext term;
		public NonTerminalContext nonTerm;
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public NonTerminalContext nonTerminal() {
			return getRuleContext(NonTerminalContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atom);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((AtomContext)_localctx).term = terminal();
				 ((AtomContext)_localctx).val =  ((AtomContext)_localctx).term.val; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				((AtomContext)_localctx).nonTerm = nonTerminal();
				 ((AtomContext)_localctx).val =  ((AtomContext)_localctx).nonTerm.val; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalContext extends ParserRuleContext {
		public RuleAtom val;
		public Token id;
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerminal(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_terminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((TerminalContext)_localctx).id = match(NAME);

			        ((TerminalContext)_localctx).val =  new Terminal((((TerminalContext)_localctx).id!=null?((TerminalContext)_localctx).id.getText():null));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonTerminalContext extends ParserRuleContext {
		public RuleAtom val;
		public Token id;
		public ParametersContext params;
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public NonTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNonTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNonTerminal(this);
		}
	}

	public final NonTerminalContext nonTerminal() throws RecognitionException {
		NonTerminalContext _localctx = new NonTerminalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nonTerminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			((NonTerminalContext)_localctx).id = match(NAME);
			setState(169);
			match(T__4);
			setState(170);
			((NonTerminalContext)_localctx).params = parameters();
			setState(171);
			match(T__5);

			        ((NonTerminalContext)_localctx).val =  new NonTerminal((((NonTerminalContext)_localctx).id!=null?((NonTerminalContext)_localctx).id.getText():null), ((NonTerminalContext)_localctx).params.val);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<String> val;
		public Token head;
		public ParametersContext tail;
		public Token x;
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameters);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				((ParametersContext)_localctx).head = match(CODE);
				setState(175);
				match(T__7);
				setState(176);
				((ParametersContext)_localctx).tail = parameters();

				        ((ParametersContext)_localctx).val =  ((ParametersContext)_localctx).tail.val;
				        _localctx.val.add(0, (((ParametersContext)_localctx).head!=null?((ParametersContext)_localctx).head.getText():null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				((ParametersContext)_localctx).x = match(CODE);

				        ((ParametersContext)_localctx).val =  new LinkedList<String>();
				        _localctx.val.add(0, (((ParametersContext)_localctx).x!=null?((ParametersContext)_localctx).x.getText():null));
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 ((ParametersContext)_localctx).val =  new LinkedList<String>(); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public String val;
		public Token name;
		public TerminalNode START() { return getToken(GrammarParser.START, 0); }
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(START);
			setState(185);
			match(T__2);
			setState(186);
			((StartContext)_localctx).name = match(NAME);
			setState(187);
			match(T__3);

			        ((StartContext)_localctx).val =  (((StartContext)_localctx).name!=null?((StartContext)_localctx).name.getText():null);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u00c1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13t\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0084\n\r\3\16"+
		"\5\16\u0087\n\16\3\16\3\16\5\16\u008b\n\16\3\16\3\16\5\16\u008f\n\16\3"+
		"\16\3\16\5\16\u0093\n\16\3\16\3\16\5\16\u0097\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u009e\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a6\n\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u00b9\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\2\2\25"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\2\u00be\2(\3\2\2\2\4"+
		"/\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\nB\3\2\2\2\fP\3\2\2\2\16R\3\2\2\2\20]"+
		"\3\2\2\2\22_\3\2\2\2\24s\3\2\2\2\26u\3\2\2\2\30\u0083\3\2\2\2\32\u0096"+
		"\3\2\2\2\34\u009d\3\2\2\2\36\u00a5\3\2\2\2 \u00a7\3\2\2\2\"\u00aa\3\2"+
		"\2\2$\u00b8\3\2\2\2&\u00ba\3\2\2\2()\7\22\2\2)*\5\4\3\2*+\5\n\6\2+,\5"+
		"\16\b\2,-\5&\24\2-.\b\2\1\2.\3\3\2\2\2/\60\7\16\2\2\60\61\7\3\2\2\61\62"+
		"\5\6\4\2\62\63\7\4\2\2\63\64\b\3\1\2\64\5\3\2\2\2\65\66\5\b\5\2\66\67"+
		"\5\6\4\2\678\b\4\1\28;\3\2\2\29;\b\4\1\2:\65\3\2\2\2:9\3\2\2\2;\7\3\2"+
		"\2\2<=\7\23\2\2=>\7\5\2\2>?\7\24\2\2?@\7\6\2\2@A\b\5\1\2A\t\3\2\2\2BC"+
		"\7\17\2\2CD\7\3\2\2DE\5\f\7\2EF\7\4\2\2FG\b\6\1\2G\13\3\2\2\2HI\7\23\2"+
		"\2IJ\7\6\2\2JK\5\f\7\2KL\b\7\1\2LQ\3\2\2\2MN\7\23\2\2NQ\b\7\1\2OQ\b\7"+
		"\1\2PH\3\2\2\2PM\3\2\2\2PO\3\2\2\2Q\r\3\2\2\2RS\7\21\2\2ST\7\3\2\2TU\5"+
		"\20\t\2UV\7\4\2\2VW\b\b\1\2W\17\3\2\2\2XY\5\22\n\2YZ\5\20\t\2Z[\b\t\1"+
		"\2[^\3\2\2\2\\^\b\t\1\2]X\3\2\2\2]\\\3\2\2\2^\21\3\2\2\2_`\7\23\2\2`a"+
		"\7\7\2\2ab\5\24\13\2bc\7\b\2\2cd\7\t\2\2de\7\23\2\2ef\7\5\2\2fg\5\30\r"+
		"\2gh\7\6\2\2hi\b\n\1\2i\23\3\2\2\2jk\5\26\f\2kl\7\n\2\2lm\5\24\13\2mn"+
		"\b\13\1\2nt\3\2\2\2op\5\26\f\2pq\b\13\1\2qt\3\2\2\2rt\b\13\1\2sj\3\2\2"+
		"\2so\3\2\2\2sr\3\2\2\2t\25\3\2\2\2uv\7\23\2\2vw\7\t\2\2wx\7\23\2\2xy\b"+
		"\f\1\2y\27\3\2\2\2z{\5\32\16\2{|\7\13\2\2|}\5\30\r\2}~\b\r\1\2~\u0084"+
		"\3\2\2\2\177\u0080\5\32\16\2\u0080\u0081\b\r\1\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0084\b\r\1\2\u0083z\3\2\2\2\u0083\177\3\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\31\3\2\2\2\u0085\u0087\7\22\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2"+
		"\2\u0087\u0088\3\2\2\2\u0088\u008a\7\r\2\2\u0089\u008b\7\22\2\2\u008a"+
		"\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0097\b\16"+
		"\1\2\u008d\u008f\7\22\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0092\5\34\17\2\u0091\u0093\7\22\2\2\u0092\u0091"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\16\1\2"+
		"\u0095\u0097\3\2\2\2\u0096\u0086\3\2\2\2\u0096\u008e\3\2\2\2\u0097\33"+
		"\3\2\2\2\u0098\u0099\5\36\20\2\u0099\u009a\5\34\17\2\u009a\u009b\b\17"+
		"\1\2\u009b\u009e\3\2\2\2\u009c\u009e\b\17\1\2\u009d\u0098\3\2\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\35\3\2\2\2\u009f\u00a0\5 \21\2\u00a0\u00a1\b\20\1"+
		"\2\u00a1\u00a6\3\2\2\2\u00a2\u00a3\5\"\22\2\u00a3\u00a4\b\20\1\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6\37\3\2\2"+
		"\2\u00a7\u00a8\7\23\2\2\u00a8\u00a9\b\21\1\2\u00a9!\3\2\2\2\u00aa\u00ab"+
		"\7\23\2\2\u00ab\u00ac\7\7\2\2\u00ac\u00ad\5$\23\2\u00ad\u00ae\7\b\2\2"+
		"\u00ae\u00af\b\22\1\2\u00af#\3\2\2\2\u00b0\u00b1\7\22\2\2\u00b1\u00b2"+
		"\7\n\2\2\u00b2\u00b3\5$\23\2\u00b3\u00b4\b\23\1\2\u00b4\u00b9\3\2\2\2"+
		"\u00b5\u00b6\7\22\2\2\u00b6\u00b9\b\23\1\2\u00b7\u00b9\b\23\1\2\u00b8"+
		"\u00b0\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9%\3\2\2\2"+
		"\u00ba\u00bb\7\20\2\2\u00bb\u00bc\7\5\2\2\u00bc\u00bd\7\23\2\2\u00bd\u00be"+
		"\7\6\2\2\u00be\u00bf\b\24\1\2\u00bf\'\3\2\2\2\17:P]s\u0083\u0086\u008a"+
		"\u008e\u0092\u0096\u009d\u00a5\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}