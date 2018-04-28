import generated.MonkeyParser;
import generated.MonkeyParserBaseVisitor;

public class PrettyPrint extends MonkeyParserBaseVisitor {

    private int cont=0;

    private void printtab(int n)
    {
        for(int num=n; num != 0; num--)
            System.out.print("+++");
        System.out.print(">");
    }

    @Override
    public Object visitPrograma(MonkeyParser.ProgramaContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        for(int i = 0; i < ctx.statement().size(); i++){
            cont++;
            visit(ctx.statement(i));
            cont--;
        }

        return null;
    }/*
//statement: LET letStatement                                                    #statementLet
    @Override
    public Object visitStatementLet(MonkeyParser.StatementLetContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        if(ctx.letStatement() != null){
            cont++;
           visit(ctx.letStatement());
            cont--;
        }

        return null;
    }
//RETURN returnStatement                                        #statementReturn
    @Override
    public Object visitStatementReturn(MonkeyParser.StatementReturnContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        if(ctx.returnStatement() != null){
            cont++;
            visit(ctx.returnStatement());
        }
        cont--;
        return null;
    }
//expressionStatement                                           #statementExpr;
    @Override
    public Object visitStatementExpr(MonkeyParser.StatementExprContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        if(ctx.expressionStatement() != null){
            cont ++;
            visit(ctx.expressionStatement());
        }
        cont--;
        return null;

    }*/
//letStatement: ID EQUAL expression ( PyCOMA | WS )                              #letStatementId;
    @Override
    public Object visitLetStatementId(MonkeyParser.LetStatementIdContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        if(ctx.expression() != null){
            cont++;
            visit(ctx.expression());
            cont--;
        }
        return null;
    }
//returnStatement: expression (PyCOMA | WS)                                      #returnStatementa;
    @Override
    public Object visitReturnStatementa(MonkeyParser.ReturnStatementaContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        if(ctx.expression() != null){
            cont++;
            visit(ctx.expression());
            cont--;
        }
        return null;
    }

    @Override
    public Object visitExpressionStatementa(MonkeyParser.ExpressionStatementaContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        if(ctx.expression() != null){
            visit(ctx.expression());
        }
        cont--;


        return null;
    }
//expression: additionExpression comparison                                      #expressiona;
    @Override
    public Object visitExpressiona(MonkeyParser.ExpressionaContext ctx) {

        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());

        if(ctx.additionExpression() != null){
            cont++;
            visit(ctx.additionExpression());
            if(ctx.comparison() != null){
                visit(ctx.additionExpression());
            }
            cont--;
        }

        return null;
    }
//comparison: ((MAYORK
//                | MENORK
//                | MENORIGUALK
//                | MAYORIGUALK
//                | II ) additionExpression)*                                    #comparisonDesignator;
    @Override
    public Object visitComparisonDesignator(MonkeyParser.ComparisonDesignatorContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        for(int x = 0; x < ctx.additionExpression().size() ; x++){

            visit(ctx.additionExpression(x));

        }
        cont--;
        return null;
    }
    //additionExpression: multiplicationExpression additionFactor                    #additionExpressiona;
    @Override
    public Object visitAdditionExpressiona(MonkeyParser.AdditionExpressionaContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        if(ctx.multiplicationExpression() != null){
            visit(ctx.multiplicationExpression());
        }
        if(ctx.additionFactor() != null){
            visit(ctx.additionFactor());
        }
        cont--;
        return null;
    }
//additionFactor: (( SUMA | RESTA ) multiplicationExpression)*                   #additionFactorDesignator;
    @Override
    public Object visitAdditionFactorDesignator(MonkeyParser.AdditionFactorDesignatorContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;

        for(int y = 0; y < ctx.multiplicationExpression().size(); y++){
            visit(ctx.multiplicationExpression(y));
        }
        cont--;

        return null;
    }
//multiplicationExpression: elementExpression multiplicationFactor               #multiplicationExpressiona;
    @Override
    public Object visitMultiplicationExpressiona(MonkeyParser.MultiplicationExpressionaContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        if(ctx.elementExpression() != null){
            visit(ctx.elementExpression());
        }
        if(ctx.multiplicationFactor() != null){
            visit(ctx.multiplicationFactor());
        }
        cont--;
        return null;
    }
//multiplicationFactor: (( MUL | DIV ) elementExpression )*                      #multiplicationFactora;
    @Override
    public Object visitMultiplicationFactora(MonkeyParser.MultiplicationFactoraContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        for(int x = 0; x < ctx.elementExpression().size(); x++){
            visit(ctx.elementExpression(x));
        }
        cont--;

        return null;
    }

//        elementExpression: primitiveExpression (elementAccess | callExpression | WS)   #elementExpressiona;
    @Override
    public Object visitElementExpressiona(MonkeyParser.ElementExpressionaContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;

        visit(ctx.primitiveExpression());

        if (ctx.elementAccess() != null){
            visit(ctx.elementAccess());
        }
        if(ctx.callExpression() != null){
            visit(ctx.callExpression());
        }
        cont--;
        return null;
    }
//elementAccess    : PCIZQ expression PCDER                                      #elementAccessa;
    @Override
    public Object visitElementAccessa(MonkeyParser.ElementAccessaContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;

        visit(ctx.expression());

        cont--;

        return null;
    }
   // callExpression: PIZQ expressionList PDER                                       #callExpressionExprL;
    @Override
    public Object visitCallExpressionExprL(MonkeyParser.CallExpressionExprLContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;

        visit(ctx.expressionList());

        cont--;

        return null;
    }

    @Override
    public Object visitPrimitiveExpressionInt(MonkeyParser.PrimitiveExpressionIntContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;

        System.out.println(" TokenINT -> " + ctx.INT().getSymbol().getText() + '\n');

        cont--;
        return null;
    }

    @Override
    public Object visitPrimitiveExpressionStr(MonkeyParser.PrimitiveExpressionStrContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        System.out.println(" TokenSTRING-> " + ctx.STRING().getSymbol().getText() + '\n');
        cont--;
        return null;
    }

    @Override
    public Object visitPrimitiveExpressionId(MonkeyParser.PrimitiveExpressionIdContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        System.out.println(" TokenID-> " + ctx.ID().getSymbol().getText() + '\n');
        cont--;

        return null;
    }

    @Override
    public Object visitPrimitiveExpressionTrue(MonkeyParser.PrimitiveExpressionTrueContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        System.out.println(" TokenTRUE-> " + ctx.TRUE().getSymbol().getText() + '\n');
        cont--;
        return null;
    }

    @Override
    public Object visitPrimitiveExpressionFalse(MonkeyParser.PrimitiveExpressionFalseContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        System.out.println(" TokenFALSE> " + ctx.FALSE().getSymbol().getText() + '\n');
        cont--;
        return null;
    }
//PIZQ expression PDER
    @Override
    public Object visitPrimitiveExpressionExpr(MonkeyParser.PrimitiveExpressionExprContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        cont--;
        return null;
    }

    @Override
    public Object visitPrimitiveExpressionArLiteral(MonkeyParser.PrimitiveExpressionArLiteralContext ctx) {
        return null;
    }

    @Override
    public Object visitPrimitiveExpressionArFunct(MonkeyParser.PrimitiveExpressionArFunctContext ctx) {
        return null;
    }

    @Override
    public Object visitPrimitiveExpressionFuncLiteral(MonkeyParser.PrimitiveExpressionFuncLiteralContext ctx) {
        return null;
    }

    @Override
    public Object visitPrimitiveExpressionHashLiteral(MonkeyParser.PrimitiveExpressionHashLiteralContext ctx) {
        return null;
    }

    @Override
    public Object visitPrimitiveExpressionPrint(MonkeyParser.PrimitiveExpressionPrintContext ctx) {
        return null;
    }

    @Override
    public Object visitPrimitiveExpressionIfExpr(MonkeyParser.PrimitiveExpressionIfExprContext ctx) {
        return null;
    }

    @Override
    public Object visitArrayFunctions(MonkeyParser.ArrayFunctionsContext ctx) {
        return null;
    }

    @Override
    public Object visitArrayLiterala(MonkeyParser.ArrayLiteralaContext ctx) {
        return null;
    }

    @Override
    public Object visitFunctionLiteralFn(MonkeyParser.FunctionLiteralFnContext ctx) {
        return null;
    }

    @Override
    public Object visitFunctionParametersId(MonkeyParser.FunctionParametersIdContext ctx) {
        return null;
    }

    @Override
    public Object visitMoreIdentifiersa(MonkeyParser.MoreIdentifiersaContext ctx) {
        return null;
    }

    @Override
    public Object visitHashLiterala(MonkeyParser.HashLiteralaContext ctx) {
        return null;
    }

    @Override
    public Object visitHashContenta(MonkeyParser.HashContentaContext ctx) {
        return null;
    }

    @Override
    public Object visitMoreHashContenta(MonkeyParser.MoreHashContentaContext ctx) {
        return null;
    }

    @Override
    public Object visitExpressionLista(MonkeyParser.ExpressionListaContext ctx) {
        return null;
    }

    @Override
    public Object visitExpressionListNada(MonkeyParser.ExpressionListNadaContext ctx) {
        return null;
    }

    @Override
    public Object visitMoreExpressionsa(MonkeyParser.MoreExpressionsaContext ctx) {
        return null;
    }

    @Override
    public Object visitPrintExpressiona(MonkeyParser.PrintExpressionaContext ctx) {
        return null;
    }

    @Override
    public Object visitIfExpressiona(MonkeyParser.IfExpressionaContext ctx) {
        return null;
    }

    @Override
    public Object visitBlockStatementa(MonkeyParser.BlockStatementaContext ctx) {
        return null;
    }
}
