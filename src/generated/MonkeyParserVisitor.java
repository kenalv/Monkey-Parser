// Generated from /home/ginko-san/Monkey-Parser-master/MonkeyParser.g4 by ANTLR 4.7
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MonkeyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MonkeyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programa}
	 * labeled alternative in {@link MonkeyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(MonkeyParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementLet}
	 * labeled alternative in {@link MonkeyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementLet(MonkeyParser.StatementLetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link MonkeyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturn(MonkeyParser.StatementReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementExpr}
	 * labeled alternative in {@link MonkeyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpr(MonkeyParser.StatementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letStatementId}
	 * labeled alternative in {@link MonkeyParser#letStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStatementId(MonkeyParser.LetStatementIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatementa}
	 * labeled alternative in {@link MonkeyParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatementa(MonkeyParser.ReturnStatementaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStatementa}
	 * labeled alternative in {@link MonkeyParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatementa(MonkeyParser.ExpressionStatementaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressiona}
	 * labeled alternative in {@link MonkeyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressiona(MonkeyParser.ExpressionaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonDesignator}
	 * labeled alternative in {@link MonkeyParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonDesignator(MonkeyParser.ComparisonDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionExpressiona}
	 * labeled alternative in {@link MonkeyParser#additionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpressiona(MonkeyParser.AdditionExpressionaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionFactorDesignator}
	 * labeled alternative in {@link MonkeyParser#additionFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionFactorDesignator(MonkeyParser.AdditionFactorDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpressiona}
	 * labeled alternative in {@link MonkeyParser#multiplicationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpressiona(MonkeyParser.MultiplicationExpressionaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationFactora}
	 * labeled alternative in {@link MonkeyParser#multiplicationFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationFactora(MonkeyParser.MultiplicationFactoraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementExpressiona}
	 * labeled alternative in {@link MonkeyParser#elementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementExpressiona(MonkeyParser.ElementExpressionaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementAccessa}
	 * labeled alternative in {@link MonkeyParser#elementAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAccessa(MonkeyParser.ElementAccessaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpressionExprL}
	 * labeled alternative in {@link MonkeyParser#callExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpressionExprL(MonkeyParser.CallExpressionExprLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionInt}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionInt(MonkeyParser.PrimitiveExpressionIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionStr}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionStr(MonkeyParser.PrimitiveExpressionStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionId}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionId(MonkeyParser.PrimitiveExpressionIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionTrue}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionTrue(MonkeyParser.PrimitiveExpressionTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionFalse}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionFalse(MonkeyParser.PrimitiveExpressionFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionExpr}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionExpr(MonkeyParser.PrimitiveExpressionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionArLiteral}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionArLiteral(MonkeyParser.PrimitiveExpressionArLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionArFunct}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionArFunct(MonkeyParser.PrimitiveExpressionArFunctContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionFuncLiteral}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionFuncLiteral(MonkeyParser.PrimitiveExpressionFuncLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionHashLiteral}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionHashLiteral(MonkeyParser.PrimitiveExpressionHashLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionPrint}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionPrint(MonkeyParser.PrimitiveExpressionPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionIfExpr}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionIfExpr(MonkeyParser.PrimitiveExpressionIfExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#arrayFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFunctions(MonkeyParser.ArrayFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLiterala}
	 * labeled alternative in {@link MonkeyParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiterala(MonkeyParser.ArrayLiteralaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionLiteralFn}
	 * labeled alternative in {@link MonkeyParser#functionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLiteralFn(MonkeyParser.FunctionLiteralFnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionParametersId}
	 * labeled alternative in {@link MonkeyParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParametersId(MonkeyParser.FunctionParametersIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreIdentifiersa}
	 * labeled alternative in {@link MonkeyParser#moreIdentifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreIdentifiersa(MonkeyParser.MoreIdentifiersaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hashLiterala}
	 * labeled alternative in {@link MonkeyParser#hashLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashLiterala(MonkeyParser.HashLiteralaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hashContenta}
	 * labeled alternative in {@link MonkeyParser#hashContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashContenta(MonkeyParser.HashContentaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreHashContenta}
	 * labeled alternative in {@link MonkeyParser#moreHashContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreHashContenta(MonkeyParser.MoreHashContentaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionLista}
	 * labeled alternative in {@link MonkeyParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLista(MonkeyParser.ExpressionListaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionListNada}
	 * labeled alternative in {@link MonkeyParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionListNada(MonkeyParser.ExpressionListNadaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreExpressionsa}
	 * labeled alternative in {@link MonkeyParser#moreExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreExpressionsa(MonkeyParser.MoreExpressionsaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpressiona}
	 * labeled alternative in {@link MonkeyParser#printExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpressiona(MonkeyParser.PrintExpressionaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifExpressiona}
	 * labeled alternative in {@link MonkeyParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpressiona(MonkeyParser.IfExpressionaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatementa}
	 * labeled alternative in {@link MonkeyParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatementa(MonkeyParser.BlockStatementaContext ctx);
}