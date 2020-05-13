// Generated from a1.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class a1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, LEFTPAR=2, RIGHTPAR=3, PLUS=4, MINUS=5, MUL=6, DIV=7, ID=8, 
		WS=9;
	public static final int
		RULE_rohith = 0, RULE_e = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"rohith", "e"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "LEFTPAR", "RIGHTPAR", "PLUS", "MINUS", "MUL", "DIV", 
			"ID", "WS"
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
	public String getGrammarFileName() { return "a1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public a1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RohithContext extends ParserRuleContext {
		public Integer val;
		public EContext exp;
		public EContext e;
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public RohithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rohith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a1Listener ) ((a1Listener)listener).enterRohith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a1Listener ) ((a1Listener)listener).exitRohith(this);
		}
	}

	public final RohithContext rohith() throws RecognitionException {
		RohithContext _localctx = new RohithContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rohith);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			((RohithContext)_localctx).exp = ((RohithContext)_localctx).e = e(0);
			((RohithContext)_localctx).val = ((RohithContext)_localctx).e.val;
			   	if (_localctx.val==-1)
			   	{
			   	 System.out.println("UNKNOWN");	
			   	}
			   	else if (_localctx.val==1) 
			   	{
			   		System.out.println("TRUE");
			   	}
			   	else if (_localctx.val==0) 
			   	{
			   		System.out.println("FALSE");
			   	}
			   	
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

	public static class EContext extends ParserRuleContext {
		public Integer val;
		public EContext a;
		public Token NUMBER;
		public EContext b;
		public TerminalNode NUMBER() { return getToken(a1Parser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(a1Parser.ID, 0); }
		public TerminalNode LEFTPAR() { return getToken(a1Parser.LEFTPAR, 0); }
		public TerminalNode RIGHTPAR() { return getToken(a1Parser.RIGHTPAR, 0); }
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(a1Parser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(a1Parser.PLUS, 0); }
		public TerminalNode MUL() { return getToken(a1Parser.MUL, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a1Listener ) ((a1Listener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a1Listener ) ((a1Listener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_e, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(8);
				((EContext)_localctx).NUMBER = match(NUMBER);
				((EContext)_localctx).val = (Integer.parseInt((((EContext)_localctx).NUMBER!=null?((EContext)_localctx).NUMBER.getText():null)))%2;
				}
				break;
			case ID:
				{
				setState(10);
				match(ID);
				((EContext)_localctx).val = -1;
				}
				break;
			case LEFTPAR:
				{
				setState(12);
				match(LEFTPAR);
				setState(13);
				((EContext)_localctx).a = e(0);
				setState(14);
				match(RIGHTPAR);
				((EContext)_localctx).val = ((EContext)_localctx).a.val;
				}
				break;
			case MINUS:
				{
				setState(17);
				match(MINUS);
				setState(18);
				((EContext)_localctx).a = e(1);
				((EContext)_localctx).val = ((EContext)_localctx).a.val;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(33);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(23);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(24);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(25);
						((EContext)_localctx).b = e(5);
						 
						             	if((((EContext)_localctx).a.val==-1) || (((EContext)_localctx).b.val==-1))
						             	{   	
						             		((EContext)_localctx).val = -1;
						             	}
						             	else
						             	{
						             		   	((EContext)_localctx).val = ((((EContext)_localctx).a.val+((EContext)_localctx).b.val)%2);
						             	}
						             
						}
						break;
					case 2:
						{
						_localctx = new EContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(28);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(29);
						match(MUL);
						}
						setState(30);
						((EContext)_localctx).b = e(4);
						 
						             	if((((EContext)_localctx).a.val==-1) || (((EContext)_localctx).b.val==-1))
						             	{
						             		
						             	((EContext)_localctx).val = -1;
						             	
						             	}
						             	else if((((EContext)_localctx).a.val==0) || (((EContext)_localctx).b.val==0))
						             	{
						             		((EContext)_localctx).val = 0;
						             	}
						             	else
						             	{
						             		((EContext)_localctx).val = 1;
						             	}
						             	
						}
						break;
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return e_sempred((EContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13)\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\30\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3$\n\3\f\3\16\3"+
		"\'\13\3\3\3\2\3\4\4\2\4\2\3\3\2\6\7\2+\2\6\3\2\2\2\4\27\3\2\2\2\6\7\5"+
		"\4\3\2\7\b\b\2\1\2\b\3\3\2\2\2\t\n\b\3\1\2\n\13\7\3\2\2\13\30\b\3\1\2"+
		"\f\r\7\n\2\2\r\30\b\3\1\2\16\17\7\4\2\2\17\20\5\4\3\2\20\21\7\5\2\2\21"+
		"\22\b\3\1\2\22\30\3\2\2\2\23\24\7\7\2\2\24\25\5\4\3\3\25\26\b\3\1\2\26"+
		"\30\3\2\2\2\27\t\3\2\2\2\27\f\3\2\2\2\27\16\3\2\2\2\27\23\3\2\2\2\30%"+
		"\3\2\2\2\31\32\f\6\2\2\32\33\t\2\2\2\33\34\5\4\3\7\34\35\b\3\1\2\35$\3"+
		"\2\2\2\36\37\f\5\2\2\37 \7\b\2\2 !\5\4\3\6!\"\b\3\1\2\"$\3\2\2\2#\31\3"+
		"\2\2\2#\36\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'%\3\2\2"+
		"\2\5\27#%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}