// Generated from Task4.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3;
	public static final int
		RULE_r = 0, RULE_s0 = 1, RULE_s11 = 2, RULE_s1 = 3, RULE_s2 = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "s0", "s11", "s1", "s2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", "'1'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS"
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
	public String getGrammarFileName() { return "Task4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Task4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RContext extends ParserRuleContext {
		public S1Context s1() {
			return getRuleContext(S1Context.class,0);
		}
		public S2Context s2() {
			return getRuleContext(S2Context.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task4Listener ) ((Task4Listener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task4Listener ) ((Task4Listener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			setState(12);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				s1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				s2();
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

	public static class S0Context extends ParserRuleContext {
		public S0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task4Listener ) ((Task4Listener)listener).enterS0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task4Listener ) ((Task4Listener)listener).exitS0(this);
		}
	}

	public final S0Context s0() throws RecognitionException {
		S0Context _localctx = new S0Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_s0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(14);
				match(T__0);
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			System.out.print("10");
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

	public static class S11Context extends ParserRuleContext {
		public S0Context s0() {
			return getRuleContext(S0Context.class,0);
		}
		public S1Context s1() {
			return getRuleContext(S1Context.class,0);
		}
		public S2Context s2() {
			return getRuleContext(S2Context.class,0);
		}
		public S11Context s11() {
			return getRuleContext(S11Context.class,0);
		}
		public S11Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s11; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task4Listener ) ((Task4Listener)listener).enterS11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task4Listener ) ((Task4Listener)listener).exitS11(this);
		}
	}

	public final S11Context s11() throws RecognitionException {
		S11Context _localctx = new S11Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_s11);
		int _la;
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(22);
					match(T__1);
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				System.out.print("01");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(29);
					match(T__1);
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(35);
				match(T__0);
				System.out.print("10");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(37);
					match(T__1);
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				match(T__0);
				setState(44);
				match(T__0);
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(45);
					s0();
					}
					break;
				case 2:
					{
					setState(46);
					s1();
					}
					break;
				case 3:
					{
					setState(47);
					s2();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(50);
					match(T__1);
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(56);
				match(T__0);
				setState(57);
				match(T__1);
				System.out.print("10");
				setState(59);
				s11();
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

	public static class S1Context extends ParserRuleContext {
		public S1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task4Listener ) ((Task4Listener)listener).enterS1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task4Listener ) ((Task4Listener)listener).exitS1(this);
		}
	}

	public final S1Context s1() throws RecognitionException {
		S1Context _localctx = new S1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_s1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(62);
				match(T__0);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				match(T__1);
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			System.out.println("01");
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

	public static class S2Context extends ParserRuleContext {
		public S0Context s0() {
			return getRuleContext(S0Context.class,0);
		}
		public S1Context s1() {
			return getRuleContext(S1Context.class,0);
		}
		public S2Context s2() {
			return getRuleContext(S2Context.class,0);
		}
		public S11Context s11() {
			return getRuleContext(S11Context.class,0);
		}
		public S2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task4Listener ) ((Task4Listener)listener).enterS2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task4Listener ) ((Task4Listener)listener).exitS2(this);
		}
	}

	public final S2Context s2() throws RecognitionException {
		S2Context _localctx = new S2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_s2);
		int _la;
		try {
			int _alt;
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(75);
					match(T__0);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(81);
					match(T__1);
					}
					}
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(86);
				match(T__0);
				System.out.print("10");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(88);
					match(T__0);
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(94);
					match(T__1);
					}
					}
					setState(97); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(99);
				match(T__0);
				setState(101); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(100);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(103); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(105);
					s0();
					}
					break;
				case 2:
					{
					setState(106);
					s1();
					}
					break;
				case 3:
					{
					setState(107);
					s2();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(110);
					match(T__0);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(116);
					match(T__1);
					}
					}
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(121);
				match(T__0);
				setState(122);
				match(T__1);
				System.out.print("10");
				setState(124);
				s11();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5\u0082\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\5\2\17\n\2\3\3\7\3\22\n\3\f\3\16"+
		"\3\25\13\3\3\3\3\3\3\4\7\4\32\n\4\f\4\16\4\35\13\4\3\4\3\4\7\4!\n\4\f"+
		"\4\16\4$\13\4\3\4\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\63\n\4\3\4\7\4\66\n\4\f\4\16\49\13\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5"+
		"\7\5B\n\5\f\5\16\5E\13\5\3\5\6\5H\n\5\r\5\16\5I\3\5\3\5\3\6\7\6O\n\6\f"+
		"\6\16\6R\13\6\3\6\6\6U\n\6\r\6\16\6V\3\6\3\6\3\6\7\6\\\n\6\f\6\16\6_\13"+
		"\6\3\6\6\6b\n\6\r\6\16\6c\3\6\3\6\6\6h\n\6\r\6\16\6i\3\6\3\6\3\6\5\6o"+
		"\n\6\3\6\7\6r\n\6\f\6\16\6u\13\6\3\6\6\6x\n\6\r\6\16\6y\3\6\3\6\3\6\3"+
		"\6\5\6\u0080\n\6\3\6\2\2\7\2\4\6\b\n\2\2\2\u0094\2\16\3\2\2\2\4\23\3\2"+
		"\2\2\6>\3\2\2\2\bC\3\2\2\2\n\177\3\2\2\2\f\17\5\b\5\2\r\17\5\n\6\2\16"+
		"\f\3\2\2\2\16\r\3\2\2\2\17\3\3\2\2\2\20\22\7\3\2\2\21\20\3\2\2\2\22\25"+
		"\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27"+
		"\b\3\1\2\27\5\3\2\2\2\30\32\7\4\2\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31"+
		"\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36?\b\4\1\2\37!\7\4"+
		"\2\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2"+
		"%&\7\3\2\2&?\b\4\1\2\')\7\4\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2"+
		"\2+-\3\2\2\2,*\3\2\2\2-.\7\3\2\2.\62\7\3\2\2/\63\5\4\3\2\60\63\5\b\5\2"+
		"\61\63\5\n\6\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63?\3\2\2\2\64"+
		"\66\7\4\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2"+
		"\2\29\67\3\2\2\2:;\7\3\2\2;<\7\4\2\2<=\b\4\1\2=?\5\6\4\2>\33\3\2\2\2>"+
		"\"\3\2\2\2>*\3\2\2\2>\67\3\2\2\2?\7\3\2\2\2@B\7\3\2\2A@\3\2\2\2BE\3\2"+
		"\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3\2\2\2FH\7\4\2\2GF\3\2\2\2HI\3\2"+
		"\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\b\5\1\2L\t\3\2\2\2MO\7\3\2\2NM\3"+
		"\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QT\3\2\2\2RP\3\2\2\2SU\7\4\2\2TS\3"+
		"\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\3\2\2Y\u0080\b\6\1"+
		"\2Z\\\7\3\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2"+
		"\2\2`b\7\4\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2eg\7\3"+
		"\2\2fh\7\3\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jn\3\2\2\2ko\5\4"+
		"\3\2lo\5\b\5\2mo\5\n\6\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\u0080\3\2\2\2"+
		"pr\7\3\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2\2\2"+
		"vx\7\4\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\3\2\2"+
		"|}\7\4\2\2}~\b\6\1\2~\u0080\5\6\4\2\177P\3\2\2\2\177]\3\2\2\2\177s\3\2"+
		"\2\2\u0080\13\3\2\2\2\25\16\23\33\"*\62\67>CIPV]cinsy\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}