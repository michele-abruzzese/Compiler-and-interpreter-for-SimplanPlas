// Generated from C:/Users/Michele/IdeaProjects/progettoClp/src\simplanPlus.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simplanPlusParser}.
 */
public interface simplanPlusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code progSimple}
	 * labeled alternative in {@link simplanPlusParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgSimple(simplanPlusParser.ProgSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code progSimple}
	 * labeled alternative in {@link simplanPlusParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgSimple(simplanPlusParser.ProgSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code progComplex}
	 * labeled alternative in {@link simplanPlusParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgComplex(simplanPlusParser.ProgComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code progComplex}
	 * labeled alternative in {@link simplanPlusParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgComplex(simplanPlusParser.ProgComplexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decId}
	 * labeled alternative in {@link simplanPlusParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDecId(simplanPlusParser.DecIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decId}
	 * labeled alternative in {@link simplanPlusParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDecId(simplanPlusParser.DecIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decFun}
	 * labeled alternative in {@link simplanPlusParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDecFun(simplanPlusParser.DecFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decFun}
	 * labeled alternative in {@link simplanPlusParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDecFun(simplanPlusParser.DecFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplanPlusParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(simplanPlusParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplanPlusParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(simplanPlusParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplanPlusParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(simplanPlusParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplanPlusParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(simplanPlusParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplanPlusParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(simplanPlusParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplanPlusParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(simplanPlusParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmVar}
	 * labeled alternative in {@link simplanPlusParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterStmVar(simplanPlusParser.StmVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmVar}
	 * labeled alternative in {@link simplanPlusParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitStmVar(simplanPlusParser.StmVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmFun}
	 * labeled alternative in {@link simplanPlusParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterStmFun(simplanPlusParser.StmFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmFun}
	 * labeled alternative in {@link simplanPlusParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitStmFun(simplanPlusParser.StmFunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmIf}
	 * labeled alternative in {@link simplanPlusParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterStmIf(simplanPlusParser.StmIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmIf}
	 * labeled alternative in {@link simplanPlusParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitStmIf(simplanPlusParser.StmIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPluMin}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpPluMin(simplanPlusParser.ExpPluMinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPluMin}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpPluMin(simplanPlusParser.ExpPluMinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expLogic}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpLogic(simplanPlusParser.ExpLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expLogic}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpLogic(simplanPlusParser.ExpLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expTrue}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpTrue(simplanPlusParser.ExpTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expTrue}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpTrue(simplanPlusParser.ExpTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expCompar}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpCompar(simplanPlusParser.ExpComparContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expCompar}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpCompar(simplanPlusParser.ExpComparContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expFun}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpFun(simplanPlusParser.ExpFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expFun}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpFun(simplanPlusParser.ExpFunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpPar(simplanPlusParser.ExpParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpPar(simplanPlusParser.ExpParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expif}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpif(simplanPlusParser.ExpifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expif}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpif(simplanPlusParser.ExpifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expInteger}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpInteger(simplanPlusParser.ExpIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expInteger}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpInteger(simplanPlusParser.ExpIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNot}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpNot(simplanPlusParser.ExpNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNot}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpNot(simplanPlusParser.ExpNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expFalse}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpFalse(simplanPlusParser.ExpFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expFalse}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpFalse(simplanPlusParser.ExpFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expId}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpId(simplanPlusParser.ExpIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expId}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpId(simplanPlusParser.ExpIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPerDiv}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpPerDiv(simplanPlusParser.ExpPerDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPerDiv}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpPerDiv(simplanPlusParser.ExpPerDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplanPlusParser#ifS}.
	 * @param ctx the parse tree
	 */
	void enterIfS(simplanPlusParser.IfSContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplanPlusParser#ifS}.
	 * @param ctx the parse tree
	 */
	void exitIfS(simplanPlusParser.IfSContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplanPlusParser#ifE}.
	 * @param ctx the parse tree
	 */
	void enterIfE(simplanPlusParser.IfEContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplanPlusParser#ifE}.
	 * @param ctx the parse tree
	 */
	void exitIfE(simplanPlusParser.IfEContext ctx);
}