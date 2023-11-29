// Generated from C:/Users/Michele/IdeaProjects/progettoClp/src\simplanPlus.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class simplanPlusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, INTEGER=27, ID=28, WS=29, LINECOMENTS=30, BLOCKCOMENTS=31, 
		ERR=32;
	public static final int
		RULE_prog = 0, RULE_dec = 1, RULE_param = 2, RULE_body = 3, RULE_type = 4, 
		RULE_stm = 5, RULE_exp = 6, RULE_ifS = 7, RULE_ifE = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "dec", "param", "body", "type", "stm", "exp", "ifS", "ifE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "','", "')'", "'{'", "'}'", "'int'", "'bool'", "'void'", 
			"'='", "'if'", "'else'", "'true'", "'false'", "'!'", "'*'", "'/'", "'+'", 
			"'-'", "'>'", "'<'", "'>='", "'<='", "'=='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INTEGER", "ID", "WS", "LINECOMENTS", "BLOCKCOMENTS", 
			"ERR"
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
	public String getGrammarFileName() { return "simplanPlus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simplanPlusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgSimpleContext extends ProgContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProgSimpleContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterProgSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitProgSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitProgSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgComplexContext extends ProgContext {
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProgComplexContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterProgComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitProgComplex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitProgComplex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case INTEGER:
			case ID:
				_localctx = new ProgSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				exp(0);
				}
				break;
			case T__6:
			case T__7:
			case T__8:
				_localctx = new ProgComplexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(19);
					dec();
					}
					}
					setState(22); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0) );
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(24);
						stm();
						}
						} 
					}
					setState(29);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 402712580L) != 0)) {
					{
					setState(30);
					exp(0);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class DecContext extends ParserRuleContext {
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	 
		public DecContext() { }
		public void copyFrom(DecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecFunContext extends DecContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(simplanPlusParser.ID, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public DecFunContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterDecFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitDecFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitDecFun(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecIdContext extends DecContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(simplanPlusParser.ID, 0); }
		public DecIdContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterDecId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitDecId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitDecId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec);
		int _la;
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DecIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				type();
				setState(36);
				match(ID);
				setState(37);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new DecFunContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				type();
				setState(40);
				match(ID);
				setState(41);
				match(T__1);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) {
					{
					setState(42);
					param();
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(43);
						match(T__2);
						setState(44);
						param();
						}
						}
						setState(49);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(52);
				match(T__3);
				setState(53);
				match(T__4);
				setState(54);
				body();
				setState(55);
				match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(simplanPlusParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			type();
			setState(60);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) {
				{
				{
				setState(62);
				dec();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					stm();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 402712580L) != 0)) {
				{
				setState(74);
				exp(0);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmContext extends ParserRuleContext {
		public StmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm; }
	 
		public StmContext() { }
		public void copyFrom(StmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmFunContext extends StmContext {
		public TerminalNode ID() { return getToken(simplanPlusParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public StmFunContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterStmFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitStmFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitStmFun(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmIfContext extends StmContext {
		public ExpContext cond;
		public IfSContext thenBranch;
		public IfSContext elseBranch;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<IfSContext> ifS() {
			return getRuleContexts(IfSContext.class);
		}
		public IfSContext ifS(int i) {
			return getRuleContext(IfSContext.class,i);
		}
		public StmIfContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterStmIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitStmIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitStmIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmVarContext extends StmContext {
		public TerminalNode ID() { return getToken(simplanPlusParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StmVarContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterStmVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitStmVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitStmVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmContext stm() throws RecognitionException {
		StmContext _localctx = new StmContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stm);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new StmVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(ID);
				setState(80);
				match(T__9);
				setState(81);
				exp(0);
				setState(82);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new StmFunContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(ID);
				setState(85);
				match(T__1);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 402712580L) != 0)) {
					{
					setState(86);
					exp(0);
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(87);
						match(T__2);
						setState(88);
						exp(0);
						}
						}
						setState(93);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(96);
				match(T__3);
				setState(97);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new StmIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(T__10);
				setState(99);
				match(T__1);
				setState(100);
				((StmIfContext)_localctx).cond = exp(0);
				setState(101);
				match(T__3);
				setState(102);
				((StmIfContext)_localctx).thenBranch = ifS();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(103);
					match(T__11);
					setState(104);
					((StmIfContext)_localctx).elseBranch = ifS();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpPluMinContext extends ExpContext {
		public ExpContext left;
		public Token plus;
		public Token min;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpPluMinContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterExpPluMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitExpPluMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitExpPluMin(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpLogicContext extends ExpContext {
		public ExpContext left;
		public Token and;
		public Token or;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpLogicContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterExpLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitExpLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitExpLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpTrueContext extends ExpContext {
		public ExpTrueContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterExpTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitExpTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitExpTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpComparContext extends ExpContext {
		public ExpContext left;
		public Token mag;
		public Token min;
		public Token magUg;
		public Token minUg;
		public Token ug;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpComparContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterExpCompar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitExpCompar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitExpCompar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpFunContext extends ExpContext {
		public TerminalNode ID() { return getToken(simplanPlusParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpFunContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterExpFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitExpFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitExpFun(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpParContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpParContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterExpPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitExpPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitExpPar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpifContext extends ExpContext {
		public ExpContext cond;
		public IfEContext thenBranch;
		public IfEContext elseBranch;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<IfEContext> ifE() {
			return getRuleContexts(IfEContext.class);
		}
		public IfEContext ifE(int i) {
			return getRuleContext(IfEContext.class,i);
		}
		public ExpifContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterExpif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitExpif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitExpif(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpIntegerContext extends ExpContext {
		public TerminalNode INTEGER() { return getToken(simplanPlusParser.INTEGER, 0); }
		public ExpIntegerContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterExpInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitExpInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitExpInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpNotContext extends ExpContext {
		public Token not;
		public ExpContext right;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpNotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterExpNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitExpNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitExpNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpFalseContext extends ExpContext {
		public ExpFalseContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterExpFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitExpFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitExpFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpIdContext extends ExpContext {
		public TerminalNode ID() { return getToken(simplanPlusParser.ID, 0); }
		public ExpIdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterExpId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitExpId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitExpId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpPerDivContext extends ExpContext {
		public ExpContext left;
		public Token per;
		public Token div;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpPerDivContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterExpPerDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitExpPerDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitExpPerDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new ExpIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(110);
				match(INTEGER);
				}
				break;
			case 2:
				{
				_localctx = new ExpTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(T__12);
				}
				break;
			case 3:
				{
				_localctx = new ExpFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(T__13);
				}
				break;
			case 4:
				{
				_localctx = new ExpIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new ExpNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				((ExpNotContext)_localctx).not = match(T__14);
				setState(115);
				((ExpNotContext)_localctx).right = exp(8);
				}
				break;
			case 6:
				{
				_localctx = new ExpifContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(T__10);
				setState(117);
				match(T__1);
				setState(118);
				((ExpifContext)_localctx).cond = exp(0);
				setState(119);
				match(T__3);
				setState(120);
				((ExpifContext)_localctx).thenBranch = ifE();
				setState(121);
				match(T__11);
				setState(122);
				((ExpifContext)_localctx).elseBranch = ifE();
				}
				break;
			case 7:
				{
				_localctx = new ExpParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(T__1);
				setState(125);
				exp(0);
				setState(126);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new ExpFunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(ID);
				setState(129);
				match(T__1);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 402712580L) != 0)) {
					{
					setState(130);
					exp(0);
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(131);
						match(T__2);
						setState(132);
						exp(0);
						}
						}
						setState(137);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(140);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpPerDivContext(new ExpContext(_parentctx, _parentState));
						((ExpPerDivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(143);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(146);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__15:
							{
							setState(144);
							((ExpPerDivContext)_localctx).per = match(T__15);
							}
							break;
						case T__16:
							{
							setState(145);
							((ExpPerDivContext)_localctx).div = match(T__16);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(148);
						((ExpPerDivContext)_localctx).right = exp(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpPluMinContext(new ExpContext(_parentctx, _parentState));
						((ExpPluMinContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(149);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(152);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__17:
							{
							setState(150);
							((ExpPluMinContext)_localctx).plus = match(T__17);
							}
							break;
						case T__18:
							{
							setState(151);
							((ExpPluMinContext)_localctx).min = match(T__18);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(154);
						((ExpPluMinContext)_localctx).right = exp(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpComparContext(new ExpContext(_parentctx, _parentState));
						((ExpComparContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(155);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(161);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__19:
							{
							setState(156);
							((ExpComparContext)_localctx).mag = match(T__19);
							}
							break;
						case T__20:
							{
							setState(157);
							((ExpComparContext)_localctx).min = match(T__20);
							}
							break;
						case T__21:
							{
							setState(158);
							((ExpComparContext)_localctx).magUg = match(T__21);
							}
							break;
						case T__22:
							{
							setState(159);
							((ExpComparContext)_localctx).minUg = match(T__22);
							}
							break;
						case T__23:
							{
							setState(160);
							((ExpComparContext)_localctx).ug = match(T__23);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(163);
						((ExpComparContext)_localctx).right = exp(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpLogicContext(new ExpContext(_parentctx, _parentState));
						((ExpLogicContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(164);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(167);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__24:
							{
							setState(165);
							((ExpLogicContext)_localctx).and = match(T__24);
							}
							break;
						case T__25:
							{
							setState(166);
							((ExpLogicContext)_localctx).or = match(T__25);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(169);
						((ExpLogicContext)_localctx).right = exp(5);
						}
						break;
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfSContext extends ParserRuleContext {
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public IfSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterIfS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitIfS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitIfS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfSContext ifS() throws RecognitionException {
		IfSContext _localctx = new IfSContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__4);
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(176);
				stm();
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 || _la==ID );
			setState(181);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfEContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public IfEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).enterIfE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simplanPlusListener ) ((simplanPlusListener)listener).exitIfE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simplanPlusVisitor ) return ((simplanPlusVisitor<? extends T>)visitor).visitIfE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfEContext ifE() throws RecognitionException {
		IfEContext _localctx = new IfEContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifE);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__4);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					stm();
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(190);
			exp(0);
			setState(191);
			match(T__5);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001 \u00c2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0004\u0000\u0015\b\u0000\u000b\u0000"+
		"\f\u0000\u0016\u0001\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d"+
		"\t\u0000\u0001\u0000\u0003\u0000 \b\u0000\u0003\u0000\"\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001.\b\u0001\n\u0001"+
		"\f\u00011\t\u0001\u0003\u00013\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001:\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0005\u0003@\b\u0003\n\u0003\f\u0003C\t\u0003"+
		"\u0001\u0003\u0005\u0003F\b\u0003\n\u0003\f\u0003I\t\u0003\u0001\u0003"+
		"\u0003\u0003L\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005Z\b\u0005\n\u0005\f\u0005]\t\u0005"+
		"\u0003\u0005_\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"j\b\u0005\u0003\u0005l\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0086\b\u0006\n\u0006\f\u0006"+
		"\u0089\t\u0006\u0003\u0006\u008b\b\u0006\u0001\u0006\u0003\u0006\u008e"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0093\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0099\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00a2\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00a8\b\u0006\u0001\u0006\u0005\u0006\u00ab\b"+
		"\u0006\n\u0006\f\u0006\u00ae\t\u0006\u0001\u0007\u0001\u0007\u0004\u0007"+
		"\u00b2\b\u0007\u000b\u0007\f\u0007\u00b3\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0005\b\u00ba\b\b\n\b\f\b\u00bd\t\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0000\u0001\f\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000"+
		"\u0001\u0001\u0000\u0007\t\u00dd\u0000!\u0001\u0000\u0000\u0000\u0002"+
		"9\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000\u0006A\u0001"+
		"\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000\u0000"+
		"\f\u008d\u0001\u0000\u0000\u0000\u000e\u00af\u0001\u0000\u0000\u0000\u0010"+
		"\u00b7\u0001\u0000\u0000\u0000\u0012\"\u0003\f\u0006\u0000\u0013\u0015"+
		"\u0003\u0002\u0001\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0001\u0000\u0000\u0000\u0017\u001b\u0001\u0000\u0000\u0000\u0018\u001a"+
		"\u0003\n\u0005\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001e \u0003\f\u0006\u0000\u001f\u001e\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000"+
		"!\u0012\u0001\u0000\u0000\u0000!\u0014\u0001\u0000\u0000\u0000\"\u0001"+
		"\u0001\u0000\u0000\u0000#$\u0003\b\u0004\u0000$%\u0005\u001c\u0000\u0000"+
		"%&\u0005\u0001\u0000\u0000&:\u0001\u0000\u0000\u0000\'(\u0003\b\u0004"+
		"\u0000()\u0005\u001c\u0000\u0000)2\u0005\u0002\u0000\u0000*/\u0003\u0004"+
		"\u0002\u0000+,\u0005\u0003\u0000\u0000,.\u0003\u0004\u0002\u0000-+\u0001"+
		"\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u00002*\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000045\u0005\u0004\u0000\u000056\u0005\u0005\u0000\u000067\u0003"+
		"\u0006\u0003\u000078\u0005\u0006\u0000\u00008:\u0001\u0000\u0000\u0000"+
		"9#\u0001\u0000\u0000\u00009\'\u0001\u0000\u0000\u0000:\u0003\u0001\u0000"+
		"\u0000\u0000;<\u0003\b\u0004\u0000<=\u0005\u001c\u0000\u0000=\u0005\u0001"+
		"\u0000\u0000\u0000>@\u0003\u0002\u0001\u0000?>\u0001\u0000\u0000\u0000"+
		"@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000BG\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DF\u0003\n\u0005"+
		"\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000JL\u0003\f\u0006\u0000KJ\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000L\u0007\u0001\u0000\u0000\u0000MN\u0007\u0000\u0000"+
		"\u0000N\t\u0001\u0000\u0000\u0000OP\u0005\u001c\u0000\u0000PQ\u0005\n"+
		"\u0000\u0000QR\u0003\f\u0006\u0000RS\u0005\u0001\u0000\u0000Sl\u0001\u0000"+
		"\u0000\u0000TU\u0005\u001c\u0000\u0000U^\u0005\u0002\u0000\u0000V[\u0003"+
		"\f\u0006\u0000WX\u0005\u0003\u0000\u0000XZ\u0003\f\u0006\u0000YW\u0001"+
		"\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000^V\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`a\u0005\u0004\u0000\u0000al\u0005\u0001\u0000\u0000bc\u0005"+
		"\u000b\u0000\u0000cd\u0005\u0002\u0000\u0000de\u0003\f\u0006\u0000ef\u0005"+
		"\u0004\u0000\u0000fi\u0003\u000e\u0007\u0000gh\u0005\f\u0000\u0000hj\u0003"+
		"\u000e\u0007\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jl\u0001\u0000\u0000\u0000kO\u0001\u0000\u0000\u0000kT\u0001\u0000\u0000"+
		"\u0000kb\u0001\u0000\u0000\u0000l\u000b\u0001\u0000\u0000\u0000mn\u0006"+
		"\u0006\uffff\uffff\u0000n\u008e\u0005\u001b\u0000\u0000o\u008e\u0005\r"+
		"\u0000\u0000p\u008e\u0005\u000e\u0000\u0000q\u008e\u0005\u001c\u0000\u0000"+
		"rs\u0005\u000f\u0000\u0000s\u008e\u0003\f\u0006\btu\u0005\u000b\u0000"+
		"\u0000uv\u0005\u0002\u0000\u0000vw\u0003\f\u0006\u0000wx\u0005\u0004\u0000"+
		"\u0000xy\u0003\u0010\b\u0000yz\u0005\f\u0000\u0000z{\u0003\u0010\b\u0000"+
		"{\u008e\u0001\u0000\u0000\u0000|}\u0005\u0002\u0000\u0000}~\u0003\f\u0006"+
		"\u0000~\u007f\u0005\u0004\u0000\u0000\u007f\u008e\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\u001c\u0000\u0000\u0081\u008a\u0005\u0002\u0000\u0000"+
		"\u0082\u0087\u0003\f\u0006\u0000\u0083\u0084\u0005\u0003\u0000\u0000\u0084"+
		"\u0086\u0003\f\u0006\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0089"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u008a\u0082\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e"+
		"\u0005\u0004\u0000\u0000\u008dm\u0001\u0000\u0000\u0000\u008do\u0001\u0000"+
		"\u0000\u0000\u008dp\u0001\u0000\u0000\u0000\u008dq\u0001\u0000\u0000\u0000"+
		"\u008dr\u0001\u0000\u0000\u0000\u008dt\u0001\u0000\u0000\u0000\u008d|"+
		"\u0001\u0000\u0000\u0000\u008d\u0080\u0001\u0000\u0000\u0000\u008e\u00ac"+
		"\u0001\u0000\u0000\u0000\u008f\u0092\n\u0007\u0000\u0000\u0090\u0093\u0005"+
		"\u0010\u0000\u0000\u0091\u0093\u0005\u0011\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u00ab\u0003\f\u0006\b\u0095\u0098\n\u0006\u0000"+
		"\u0000\u0096\u0099\u0005\u0012\u0000\u0000\u0097\u0099\u0005\u0013\u0000"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u00ab\u0003\f\u0006\u0007"+
		"\u009b\u00a1\n\u0005\u0000\u0000\u009c\u00a2\u0005\u0014\u0000\u0000\u009d"+
		"\u00a2\u0005\u0015\u0000\u0000\u009e\u00a2\u0005\u0016\u0000\u0000\u009f"+
		"\u00a2\u0005\u0017\u0000\u0000\u00a0\u00a2\u0005\u0018\u0000\u0000\u00a1"+
		"\u009c\u0001\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1"+
		"\u009e\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3"+
		"\u00ab\u0003\f\u0006\u0006\u00a4\u00a7\n\u0004\u0000\u0000\u00a5\u00a8"+
		"\u0005\u0019\u0000\u0000\u00a6\u00a8\u0005\u001a\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003\f\u0006\u0005\u00aa\u008f\u0001"+
		"\u0000\u0000\u0000\u00aa\u0095\u0001\u0000\u0000\u0000\u00aa\u009b\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a4\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ad\r\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00af\u00b1\u0005\u0005\u0000\u0000\u00b0\u00b2\u0003\n\u0005"+
		"\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0006\u0000"+
		"\u0000\u00b6\u000f\u0001\u0000\u0000\u0000\u00b7\u00bb\u0005\u0005\u0000"+
		"\u0000\u00b8\u00ba\u0003\n\u0005\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00bf\u0003\f\u0006\u0000\u00bf"+
		"\u00c0\u0005\u0006\u0000\u0000\u00c0\u0011\u0001\u0000\u0000\u0000\u0019"+
		"\u0016\u001b\u001f!/29AGK[^ik\u0087\u008a\u008d\u0092\u0098\u00a1\u00a7"+
		"\u00aa\u00ac\u00b3\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}