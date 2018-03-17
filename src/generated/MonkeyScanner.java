// Generated from C:/Users/Kenneth/IdeaProjects/MonkeyParser\MonkeyScanner.g4 by ANTLR 4.7
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MonkeyScanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PCIZQ=1, PCDER=2, PyCOMA=3, PIZQ=4, PDER=5, LLAVEDER=6, LLAVEIZQ=7, DOSPUN=8, 
		EQUAL=9, SUMA=10, RESTA=11, MUL=12, DIV=13, MAYORK=14, MENORK=15, MENORIGUALK=16, 
		MAYORIGUALK=17, II=18, LET=19, RETURN=20, IF=21, THEN=22, ELSE=23, WHILE=24, 
		BEGIN=25, END=26, TRUE=27, FALSE=28, FIRST=29, LAST=30, FN=31, PUTS=32, 
		COMA=33, LEN=34, REST=35, PUSH=36, ID=37, STRING=38, INT=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PCIZQ", "PCDER", "PyCOMA", "PIZQ", "PDER", "LLAVEDER", "LLAVEIZQ", "DOSPUN", 
		"EQUAL", "SUMA", "RESTA", "MUL", "DIV", "MAYORK", "MENORK", "MENORIGUALK", 
		"MAYORIGUALK", "II", "LET", "RETURN", "IF", "THEN", "ELSE", "WHILE", "BEGIN", 
		"END", "TRUE", "FALSE", "FIRST", "LAST", "FN", "PUTS", "COMA", "LEN", 
		"REST", "PUSH", "ID", "STRING", "INT", "LETTER", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "';'", "'('", "')'", "'}'", "'{'", "':'", "'='", "'+'", 
		"'-'", "'*'", "'/'", "'>'", "'<'", "'<='", "'=>'", "'=='", "'let'", "'return'", 
		"'if'", "'then'", "'else'", "'while'", "'begin'", "'end'", "'true'", "'false'", 
		"'first'", "'last'", "'fn'", "'puts'", "','", "'len'", "'rest'", "'push'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PCIZQ", "PCDER", "PyCOMA", "PIZQ", "PDER", "LLAVEDER", "LLAVEIZQ", 
		"DOSPUN", "EQUAL", "SUMA", "RESTA", "MUL", "DIV", "MAYORK", "MENORK", 
		"MENORIGUALK", "MAYORIGUALK", "II", "LET", "RETURN", "IF", "THEN", "ELSE", 
		"WHILE", "BEGIN", "END", "TRUE", "FALSE", "FIRST", "LAST", "FN", "PUTS", 
		"COMA", "LEN", "REST", "PUSH", "ID", "STRING", "INT", "WS"
	};
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


	public MonkeyScanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MonkeyScanner.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\7&\u00d8\n&\f&\16&\u00db\13&\3\'\3\'\3\'\7\'\u00e0\n\'\f\'\16\'\u00e3"+
		"\13\'\3\'\3\'\3(\3(\7(\u00e9\n(\f(\16(\u00ec\13(\3)\3)\3*\3*\3+\6+\u00f3"+
		"\n+\r+\16+\u00f4\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q\2S\2U*\3\2\3\5\2\13"+
		"\f\17\17\"\"\2\u00fa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2U"+
		"\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3"+
		"\2\2\2\17c\3\2\2\2\21e\3\2\2\2\23g\3\2\2\2\25i\3\2\2\2\27k\3\2\2\2\31"+
		"m\3\2\2\2\33o\3\2\2\2\35q\3\2\2\2\37s\3\2\2\2!u\3\2\2\2#x\3\2\2\2%{\3"+
		"\2\2\2\'~\3\2\2\2)\u0082\3\2\2\2+\u0089\3\2\2\2-\u008c\3\2\2\2/\u0091"+
		"\3\2\2\2\61\u0096\3\2\2\2\63\u009c\3\2\2\2\65\u00a2\3\2\2\2\67\u00a6\3"+
		"\2\2\29\u00ab\3\2\2\2;\u00b1\3\2\2\2=\u00b7\3\2\2\2?\u00bc\3\2\2\2A\u00bf"+
		"\3\2\2\2C\u00c4\3\2\2\2E\u00c6\3\2\2\2G\u00ca\3\2\2\2I\u00cf\3\2\2\2K"+
		"\u00d4\3\2\2\2M\u00dc\3\2\2\2O\u00e6\3\2\2\2Q\u00ed\3\2\2\2S\u00ef\3\2"+
		"\2\2U\u00f2\3\2\2\2WX\7]\2\2X\4\3\2\2\2YZ\7_\2\2Z\6\3\2\2\2[\\\7=\2\2"+
		"\\\b\3\2\2\2]^\7*\2\2^\n\3\2\2\2_`\7+\2\2`\f\3\2\2\2ab\7\177\2\2b\16\3"+
		"\2\2\2cd\7}\2\2d\20\3\2\2\2ef\7<\2\2f\22\3\2\2\2gh\7?\2\2h\24\3\2\2\2"+
		"ij\7-\2\2j\26\3\2\2\2kl\7/\2\2l\30\3\2\2\2mn\7,\2\2n\32\3\2\2\2op\7\61"+
		"\2\2p\34\3\2\2\2qr\7@\2\2r\36\3\2\2\2st\7>\2\2t \3\2\2\2uv\7>\2\2vw\7"+
		"?\2\2w\"\3\2\2\2xy\7?\2\2yz\7@\2\2z$\3\2\2\2{|\7?\2\2|}\7?\2\2}&\3\2\2"+
		"\2~\177\7n\2\2\177\u0080\7g\2\2\u0080\u0081\7v\2\2\u0081(\3\2\2\2\u0082"+
		"\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7v\2\2\u0085\u0086\7w\2\2"+
		"\u0086\u0087\7t\2\2\u0087\u0088\7p\2\2\u0088*\3\2\2\2\u0089\u008a\7k\2"+
		"\2\u008a\u008b\7h\2\2\u008b,\3\2\2\2\u008c\u008d\7v\2\2\u008d\u008e\7"+
		"j\2\2\u008e\u008f\7g\2\2\u008f\u0090\7p\2\2\u0090.\3\2\2\2\u0091\u0092"+
		"\7g\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095"+
		"\60\3\2\2\2\u0096\u0097\7y\2\2\u0097\u0098\7j\2\2\u0098\u0099\7k\2\2\u0099"+
		"\u009a\7n\2\2\u009a\u009b\7g\2\2\u009b\62\3\2\2\2\u009c\u009d\7d\2\2\u009d"+
		"\u009e\7g\2\2\u009e\u009f\7i\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2"+
		"\u00a1\64\3\2\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7"+
		"f\2\2\u00a5\66\3\2\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9"+
		"\7w\2\2\u00a9\u00aa\7g\2\2\u00aa8\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad"+
		"\7c\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7g\2\2\u00b0"+
		":\3\2\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7t\2\2\u00b4"+
		"\u00b5\7u\2\2\u00b5\u00b6\7v\2\2\u00b6<\3\2\2\2\u00b7\u00b8\7n\2\2\u00b8"+
		"\u00b9\7c\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7v\2\2\u00bb>\3\2\2\2\u00bc"+
		"\u00bd\7h\2\2\u00bd\u00be\7p\2\2\u00be@\3\2\2\2\u00bf\u00c0\7r\2\2\u00c0"+
		"\u00c1\7w\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7u\2\2\u00c3B\3\2\2\2\u00c4"+
		"\u00c5\7.\2\2\u00c5D\3\2\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7g\2\2\u00c8"+
		"\u00c9\7p\2\2\u00c9F\3\2\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7g\2\2\u00cc"+
		"\u00cd\7u\2\2\u00cd\u00ce\7v\2\2\u00ceH\3\2\2\2\u00cf\u00d0\7r\2\2\u00d0"+
		"\u00d1\7w\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7j\2\2\u00d3J\3\2\2\2\u00d4"+
		"\u00d9\5Q)\2\u00d5\u00d8\5Q)\2\u00d6\u00d8\5S*\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00daL\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7$\2\2\u00dd\u00e1"+
		"\5Q)\2\u00de\u00e0\5Q)\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e4\u00e5\7$\2\2\u00e5N\3\2\2\2\u00e6\u00ea\5S*\2\u00e7\u00e9\5"+
		"S*\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00ebP\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\4c|\2\u00ee"+
		"R\3\2\2\2\u00ef\u00f0\4\62;\2\u00f0T\3\2\2\2\u00f1\u00f3\t\2\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b+\2\2\u00f7V\3\2\2\2\b\2\u00d7\u00d9"+
		"\u00e1\u00ea\u00f4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}