// Generated from src/parser/Grammar.g4 by ANTLR 4.7.2

package parser;
import grammar.*;
import java.util.LinkedList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WHITESPACE=10, EPS=11, TOKENS=12, IGNORE=13, START=14, RULES=15, CODE=16, 
		NAME=17, REGEX=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"WHITESPACE", "EPS", "TOKENS", "IGNORE", "START", "RULES", "CODE", "NAME", 
			"REGEX"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\6\13;\n\13\r\13\16\13<\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\6\21a\n\21"+
		"\r\21\16\21b\3\21\5\21f\n\21\7\21h\n\21\f\21\16\21k\13\21\3\21\3\21\3"+
		"\22\3\22\7\22q\n\22\f\22\16\22t\13\22\3\23\3\23\6\23x\n\23\r\23\16\23"+
		"y\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\7\5\2\13\f\17\17\"\"\4\2}}\177"+
		"\177\4\2C\\c|\t\2..\62;>>@@C\\aac|\3\2$$\2\u0082\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3"+
		"\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\63"+
		"\3\2\2\2\21\65\3\2\2\2\23\67\3\2\2\2\25:\3\2\2\2\27@\3\2\2\2\31B\3\2\2"+
		"\2\33J\3\2\2\2\35P\3\2\2\2\37W\3\2\2\2!^\3\2\2\2#n\3\2\2\2%u\3\2\2\2\'"+
		"(\7]\2\2(\4\3\2\2\2)*\7_\2\2*\6\3\2\2\2+,\7?\2\2,\b\3\2\2\2-.\7=\2\2."+
		"\n\3\2\2\2/\60\7*\2\2\60\f\3\2\2\2\61\62\7+\2\2\62\16\3\2\2\2\63\64\7"+
		"<\2\2\64\20\3\2\2\2\65\66\7.\2\2\66\22\3\2\2\2\678\7~\2\28\24\3\2\2\2"+
		"9;\t\2\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\b\13\2"+
		"\2?\26\3\2\2\2@A\7&\2\2A\30\3\2\2\2BC\7B\2\2CD\7v\2\2DE\7q\2\2EF\7m\2"+
		"\2FG\7g\2\2GH\7p\2\2HI\7u\2\2I\32\3\2\2\2JK\7B\2\2KL\7u\2\2LM\7m\2\2M"+
		"N\7k\2\2NO\7r\2\2O\34\3\2\2\2PQ\7B\2\2QR\7u\2\2RS\7v\2\2ST\7c\2\2TU\7"+
		"t\2\2UV\7v\2\2V\36\3\2\2\2WX\7B\2\2XY\7t\2\2YZ\7w\2\2Z[\7n\2\2[\\\7g\2"+
		"\2\\]\7u\2\2] \3\2\2\2^i\7}\2\2_a\n\3\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2"+
		"\2bc\3\2\2\2ce\3\2\2\2df\5!\21\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2g`\3\2\2"+
		"\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\177\2\2m\"\3"+
		"\2\2\2nr\t\4\2\2oq\t\5\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s$\3"+
		"\2\2\2tr\3\2\2\2uw\7$\2\2vx\n\6\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3"+
		"\2\2\2z{\3\2\2\2{|\7$\2\2|&\3\2\2\2\t\2<beiry\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}