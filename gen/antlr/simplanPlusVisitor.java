// Generated from C:/Users/Michele/IdeaProjects/progettoClp/src\simplanPlus.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simplanPlusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simplanPlusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code progSimple}
	 * labeled alternative in {@link simplanPlusParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgSimple(simplanPlusParser.ProgSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code progComplex}
	 * labeled alternative in {@link simplanPlusParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgComplex(simplanPlusParser.ProgComplexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decId}
	 * labeled alternative in {@link simplanPlusParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecId(simplanPlusParser.DecIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decFun}
	 * labeled alternative in {@link simplanPlusParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecFun(simplanPlusParser.DecFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplanPlusParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(simplanPlusParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplanPlusParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(simplanPlusParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplanPlusParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(simplanPlusParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmVar}
	 * labeled alternative in {@link simplanPlusParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmVar(simplanPlusParser.StmVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmFun}
	 * labeled alternative in {@link simplanPlusParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmFun(simplanPlusParser.StmFunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmIf}
	 * labeled alternative in {@link simplanPlusParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmIf(simplanPlusParser.StmIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPluMin}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPluMin(simplanPlusParser.ExpPluMinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expLogic}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLogic(simplanPlusParser.ExpLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expTrue}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpTrue(simplanPlusParser.ExpTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expCompar}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCompar(simplanPlusParser.ExpComparContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expFun}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFun(simplanPlusParser.ExpFunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPar(simplanPlusParser.ExpParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expif}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpif(simplanPlusParser.ExpifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expInteger}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpInteger(simplanPlusParser.ExpIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNot}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNot(simplanPlusParser.ExpNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expFalse}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFalse(simplanPlusParser.ExpFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expId}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpId(simplanPlusParser.ExpIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPerDiv}
	 * labeled alternative in {@link simplanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPerDiv(simplanPlusParser.ExpPerDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplanPlusParser#ifS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfS(simplanPlusParser.IfSContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplanPlusParser#ifE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfE(simplanPlusParser.IfEContext ctx);
}