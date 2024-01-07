// Generated from Website.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class WebsiteLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT=6, HEADER_TYPE=7, FOOTER_OPTION=8, 
		NAVIGATION_TYPE=9, THEME_TYPE=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "INT", "HEADER_TYPE", "FOOTER_OPTION", 
			"NAVIGATION_TYPE", "THEME_TYPE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'columns'", "'header'", "'footer'", "'navigation'", "'theme'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "INT", "HEADER_TYPE", "FOOTER_OPTION", 
			"NAVIGATION_TYPE", "THEME_TYPE", "WS"
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


	public WebsiteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Website.g4"; }

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
		"\u0004\u0000\u000bu\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005@\b\u0005\u000b\u0005"+
		"\f\u0005A\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006R\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007Y\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bb\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\tm\b\t\u0001\n\u0004\np\b\n\u000b\n\f\nq\u0001\n\u0001\n\u0000"+
		"\u0000\u000b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0001\u0000\u0002\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  {\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0001\u0017\u0001"+
		"\u0000\u0000\u0000\u0003\u001f\u0001\u0000\u0000\u0000\u0005&\u0001\u0000"+
		"\u0000\u0000\u0007-\u0001\u0000\u0000\u0000\t8\u0001\u0000\u0000\u0000"+
		"\u000b?\u0001\u0000\u0000\u0000\rQ\u0001\u0000\u0000\u0000\u000fX\u0001"+
		"\u0000\u0000\u0000\u0011a\u0001\u0000\u0000\u0000\u0013l\u0001\u0000\u0000"+
		"\u0000\u0015o\u0001\u0000\u0000\u0000\u0017\u0018\u0005c\u0000\u0000\u0018"+
		"\u0019\u0005o\u0000\u0000\u0019\u001a\u0005l\u0000\u0000\u001a\u001b\u0005"+
		"u\u0000\u0000\u001b\u001c\u0005m\u0000\u0000\u001c\u001d\u0005n\u0000"+
		"\u0000\u001d\u001e\u0005s\u0000\u0000\u001e\u0002\u0001\u0000\u0000\u0000"+
		"\u001f \u0005h\u0000\u0000 !\u0005e\u0000\u0000!\"\u0005a\u0000\u0000"+
		"\"#\u0005d\u0000\u0000#$\u0005e\u0000\u0000$%\u0005r\u0000\u0000%\u0004"+
		"\u0001\u0000\u0000\u0000&\'\u0005f\u0000\u0000\'(\u0005o\u0000\u0000("+
		")\u0005o\u0000\u0000)*\u0005t\u0000\u0000*+\u0005e\u0000\u0000+,\u0005"+
		"r\u0000\u0000,\u0006\u0001\u0000\u0000\u0000-.\u0005n\u0000\u0000./\u0005"+
		"a\u0000\u0000/0\u0005v\u0000\u000001\u0005i\u0000\u000012\u0005g\u0000"+
		"\u000023\u0005a\u0000\u000034\u0005t\u0000\u000045\u0005i\u0000\u0000"+
		"56\u0005o\u0000\u000067\u0005n\u0000\u00007\b\u0001\u0000\u0000\u0000"+
		"89\u0005t\u0000\u00009:\u0005h\u0000\u0000:;\u0005e\u0000\u0000;<\u0005"+
		"m\u0000\u0000<=\u0005e\u0000\u0000=\n\u0001\u0000\u0000\u0000>@\u0007"+
		"\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\f\u0001\u0000\u0000"+
		"\u0000CD\u0005n\u0000\u0000DE\u0005o\u0000\u0000EF\u0005n\u0000\u0000"+
		"FR\u0005e\u0000\u0000GH\u0005s\u0000\u0000HI\u0005m\u0000\u0000IJ\u0005"+
		"a\u0000\u0000JK\u0005l\u0000\u0000KR\u0005l\u0000\u0000LM\u0005l\u0000"+
		"\u0000MN\u0005a\u0000\u0000NO\u0005r\u0000\u0000OP\u0005g\u0000\u0000"+
		"PR\u0005e\u0000\u0000QC\u0001\u0000\u0000\u0000QG\u0001\u0000\u0000\u0000"+
		"QL\u0001\u0000\u0000\u0000R\u000e\u0001\u0000\u0000\u0000ST\u0005y\u0000"+
		"\u0000TU\u0005e\u0000\u0000UY\u0005s\u0000\u0000VW\u0005n\u0000\u0000"+
		"WY\u0005o\u0000\u0000XS\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"Y\u0010\u0001\u0000\u0000\u0000Z[\u0005t\u0000\u0000[\\\u0005o\u0000\u0000"+
		"\\b\u0005p\u0000\u0000]^\u0005s\u0000\u0000^_\u0005i\u0000\u0000_`\u0005"+
		"d\u0000\u0000`b\u0005e\u0000\u0000aZ\u0001\u0000\u0000\u0000a]\u0001\u0000"+
		"\u0000\u0000b\u0012\u0001\u0000\u0000\u0000cd\u0005l\u0000\u0000de\u0005"+
		"i\u0000\u0000ef\u0005g\u0000\u0000fg\u0005h\u0000\u0000gm\u0005t\u0000"+
		"\u0000hi\u0005d\u0000\u0000ij\u0005a\u0000\u0000jk\u0005r\u0000\u0000"+
		"km\u0005k\u0000\u0000lc\u0001\u0000\u0000\u0000lh\u0001\u0000\u0000\u0000"+
		"m\u0014\u0001\u0000\u0000\u0000np\u0007\u0001\u0000\u0000on\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0006\n\u0000\u0000t\u0016"+
		"\u0001\u0000\u0000\u0000\u0007\u0000AQXalq\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}