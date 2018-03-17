// Generated from C:/Users/Kenneth/IdeaProjects/MonkeyParser\MonkeyParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MonkeyParser}.
 */
public interface MonkeyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programa}
	 * labeled alternative in {@link MonkeyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MonkeyParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programa}
	 * labeled alternative in {@link MonkeyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MonkeyParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementLet}
	 * labeled alternative in {@link MonkeyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementLet(MonkeyParser.StatementLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementLet}
	 * labeled alternative in {@link MonkeyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementLet(MonkeyParser.StatementLetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link MonkeyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementReturn(MonkeyParser.StatementReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link MonkeyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementReturn(MonkeyParser.StatementReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementExpr}
	 * labeled alternative in {@link MonkeyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpr(MonkeyParser.StatementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementExpr}
	 * labeled alternative in {@link MonkeyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpr(MonkeyParser.StatementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letStatementId}
	 * labeled alternative in {@link MonkeyParser#letStatement}.
	 * @param ctx the parse tree
	 */
	void enterLetStatementId(MonkeyParser.LetStatementIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letStatementId}
	 * labeled alternative in {@link MonkeyParser#letStatement}.
	 * @param ctx the parse tree
	 */
	void exitLetStatementId(MonkeyParser.LetStatementIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatementa}
	 * labeled alternative in {@link MonkeyParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatementa(MonkeyParser.ReturnStatementaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatementa}
	 * labeled alternative in {@link MonkeyParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatementa(MonkeyParser.ReturnStatementaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStatementa}
	 * labeled alternative in {@link MonkeyParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatementa(MonkeyParser.ExpressionStatementaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStatementa}
	 * labeled alternative in {@link MonkeyParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatementa(MonkeyParser.ExpressionStatementaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressiona}
	 * labeled alternative in {@link MonkeyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressiona(MonkeyParser.ExpressionaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressiona}
	 * labeled alternative in {@link MonkeyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressiona(MonkeyParser.ExpressionaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonDesignator}
	 * labeled alternative in {@link MonkeyParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparisonDesignator(MonkeyParser.ComparisonDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonDesignator}
	 * labeled alternative in {@link MonkeyParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparisonDesignator(MonkeyParser.ComparisonDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionExpressiona}
	 * labeled alternative in {@link MonkeyParser#additionExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpressiona(MonkeyParser.AdditionExpressionaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionExpressiona}
	 * labeled alternative in {@link MonkeyParser#additionExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpressiona(MonkeyParser.AdditionExpressionaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionFactorDesignator}
	 * labeled alternative in {@link MonkeyParser#additionFactor}.
	 * @param ctx the parse tree
	 */
	void enterAdditionFactorDesignator(MonkeyParser.AdditionFactorDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionFactorDesignator}
	 * labeled alternative in {@link MonkeyParser#additionFactor}.
	 * @param ctx the parse tree
	 */
	void exitAdditionFactorDesignator(MonkeyParser.AdditionFactorDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpressiona}
	 * labeled alternative in {@link MonkeyParser#multiplicationExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpressiona(MonkeyParser.MultiplicationExpressionaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpressiona}
	 * labeled alternative in {@link MonkeyParser#multiplicationExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpressiona(MonkeyParser.MultiplicationExpressionaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MonkeyParser#multiplicationFactor}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationFactor(MonkeyParser.MultiplicationFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonkeyParser#multiplicationFactor}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationFactor(MonkeyParser.MultiplicationFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementExpressiona}
	 * labeled alternative in {@link MonkeyParser#elementExpression}.
	 * @param ctx the parse tree
	 */
	void enterElementExpressiona(MonkeyParser.ElementExpressionaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementExpressiona}
	 * labeled alternative in {@link MonkeyParser#elementExpression}.
	 * @param ctx the parse tree
	 */
	void exitElementExpressiona(MonkeyParser.ElementExpressionaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementAccessa}
	 * labeled alternative in {@link MonkeyParser#elementAccess}.
	 * @param ctx the parse tree
	 */
	void enterElementAccessa(MonkeyParser.ElementAccessaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementAccessa}
	 * labeled alternative in {@link MonkeyParser#elementAccess}.
	 * @param ctx the parse tree
	 */
	void exitElementAccessa(MonkeyParser.ElementAccessaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpressionExprL}
	 * labeled alternative in {@link MonkeyParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpressionExprL(MonkeyParser.CallExpressionExprLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpressionExprL}
	 * labeled alternative in {@link MonkeyParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpressionExprL(MonkeyParser.CallExpressionExprLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveExpressionInt}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExpressionInt(MonkeyParser.PrimitiveExpressionIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveExpressionInt}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExpressionInt(MonkeyParser.PrimitiveExpressionIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveExpressionStr}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExpressionStr(MonkeyParser.PrimitiveExpressionStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveExpressionStr}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExpressionStr(MonkeyParser.PrimitiveExpressionStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveExpressionId}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExpressionId(MonkeyParser.PrimitiveExpressionIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveExpressionId}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExpressionId(MonkeyParser.PrimitiveExpressionIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveExpressionTrue}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExpressionTrue(MonkeyParser.PrimitiveExpressionTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveExpressionTrue}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExpressionTrue(MonkeyParser.PrimitiveExpressionTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveExpressionFalse}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExpressionFalse(MonkeyParser.PrimitiveExpressionFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveExpressionFalse}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExpressionFalse(MonkeyParser.PrimitiveExpressionFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveExpressionExpr}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExpressionExpr(MonkeyParser.PrimitiveExpressionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveExpressionExpr}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExpressionExpr(MonkeyParser.PrimitiveExpressionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveExpressionArLiteral}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExpressionArLiteral(MonkeyParser.PrimitiveExpressionArLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveExpressionArLiteral}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExpressionArLiteral(MonkeyParser.PrimitiveExpressionArLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveExpressionArFunct}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExpressionArFunct(MonkeyParser.PrimitiveExpressionArFunctContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveExpressionArFunct}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExpressionArFunct(MonkeyParser.PrimitiveExpressionArFunctContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveExpressionFuncLiteral}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExpressionFuncLiteral(MonkeyParser.PrimitiveExpressionFuncLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveExpressionFuncLiteral}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExpressionFuncLiteral(MonkeyParser.PrimitiveExpressionFuncLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveExpressionHashLiteral}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExpressionHashLiteral(MonkeyParser.PrimitiveExpressionHashLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveExpressionHashLiteral}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExpressionHashLiteral(MonkeyParser.PrimitiveExpressionHashLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveExpressionPrint}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExpressionPrint(MonkeyParser.PrimitiveExpressionPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveExpressionPrint}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExpressionPrint(MonkeyParser.PrimitiveExpressionPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveExpressionIfExpr}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExpressionIfExpr(MonkeyParser.PrimitiveExpressionIfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveExpressionIfExpr}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExpressionIfExpr(MonkeyParser.PrimitiveExpressionIfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MonkeyParser#arrayFunctions}.
	 * @param ctx the parse tree
	 */
	void enterArrayFunctions(MonkeyParser.ArrayFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonkeyParser#arrayFunctions}.
	 * @param ctx the parse tree
	 */
	void exitArrayFunctions(MonkeyParser.ArrayFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLiterala}
	 * labeled alternative in {@link MonkeyParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiterala(MonkeyParser.ArrayLiteralaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLiterala}
	 * labeled alternative in {@link MonkeyParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiterala(MonkeyParser.ArrayLiteralaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionLiteralFn}
	 * labeled alternative in {@link MonkeyParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLiteralFn(MonkeyParser.FunctionLiteralFnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionLiteralFn}
	 * labeled alternative in {@link MonkeyParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLiteralFn(MonkeyParser.FunctionLiteralFnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionParametersId}
	 * labeled alternative in {@link MonkeyParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParametersId(MonkeyParser.FunctionParametersIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionParametersId}
	 * labeled alternative in {@link MonkeyParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParametersId(MonkeyParser.FunctionParametersIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moreIdentifiersa}
	 * labeled alternative in {@link MonkeyParser#moreIdentifiers}.
	 * @param ctx the parse tree
	 */
	void enterMoreIdentifiersa(MonkeyParser.MoreIdentifiersaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moreIdentifiersa}
	 * labeled alternative in {@link MonkeyParser#moreIdentifiers}.
	 * @param ctx the parse tree
	 */
	void exitMoreIdentifiersa(MonkeyParser.MoreIdentifiersaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashLiterala}
	 * labeled alternative in {@link MonkeyParser#hashLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHashLiterala(MonkeyParser.HashLiteralaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashLiterala}
	 * labeled alternative in {@link MonkeyParser#hashLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHashLiterala(MonkeyParser.HashLiteralaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashContenta}
	 * labeled alternative in {@link MonkeyParser#hashContent}.
	 * @param ctx the parse tree
	 */
	void enterHashContenta(MonkeyParser.HashContentaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashContenta}
	 * labeled alternative in {@link MonkeyParser#hashContent}.
	 * @param ctx the parse tree
	 */
	void exitHashContenta(MonkeyParser.HashContentaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moreHashContenta}
	 * labeled alternative in {@link MonkeyParser#moreHashContent}.
	 * @param ctx the parse tree
	 */
	void enterMoreHashContenta(MonkeyParser.MoreHashContentaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moreHashContenta}
	 * labeled alternative in {@link MonkeyParser#moreHashContent}.
	 * @param ctx the parse tree
	 */
	void exitMoreHashContenta(MonkeyParser.MoreHashContentaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionLista}
	 * labeled alternative in {@link MonkeyParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLista(MonkeyParser.ExpressionListaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionLista}
	 * labeled alternative in {@link MonkeyParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLista(MonkeyParser.ExpressionListaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionListNada}
	 * labeled alternative in {@link MonkeyParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionListNada(MonkeyParser.ExpressionListNadaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionListNada}
	 * labeled alternative in {@link MonkeyParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionListNada(MonkeyParser.ExpressionListNadaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moreExpressionsa}
	 * labeled alternative in {@link MonkeyParser#moreExpressions}.
	 * @param ctx the parse tree
	 */
	void enterMoreExpressionsa(MonkeyParser.MoreExpressionsaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moreExpressionsa}
	 * labeled alternative in {@link MonkeyParser#moreExpressions}.
	 * @param ctx the parse tree
	 */
	void exitMoreExpressionsa(MonkeyParser.MoreExpressionsaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpressiona}
	 * labeled alternative in {@link MonkeyParser#printExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpressiona(MonkeyParser.PrintExpressionaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpressiona}
	 * labeled alternative in {@link MonkeyParser#printExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpressiona(MonkeyParser.PrintExpressionaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifExpressiona}
	 * labeled alternative in {@link MonkeyParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpressiona(MonkeyParser.IfExpressionaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifExpressiona}
	 * labeled alternative in {@link MonkeyParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpressiona(MonkeyParser.IfExpressionaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatementa}
	 * labeled alternative in {@link MonkeyParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatementa(MonkeyParser.BlockStatementaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatementa}
	 * labeled alternative in {@link MonkeyParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatementa(MonkeyParser.BlockStatementaContext ctx);
}