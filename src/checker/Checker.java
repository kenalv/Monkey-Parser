package checker;

import generated.Parser2;
import generated.Parser2BaseVisitor;

/**
 * Created by oviquez on 15/3/2018.
 */
public class Checker extends Parser2BaseVisitor{
    private SymbolTable tablaIDs = null;
    public Checker(){
        this.tablaIDs=new SymbolTable();
    }

    @Override
    public Object visitProgAST(Parser2.ProgASTContext ctx) {
        visit(ctx.singleCommand());
        return null;
    }

    @Override
    public Object visitCommAST(Parser2.CommASTContext ctx) {
        for( Parser2.SingleCommandContext ele : ctx.singleCommand())
            visit(ele);
        return null;
    }

    @Override
    public Object visitScAsignAST(Parser2.ScAsignASTContext ctx) {
        //verificar ID en Tabla
        SymbolTable.Ident i = this.tablaIDs.buscar(ctx.ID().getText());

        if(i.decl.getChild(0).getText().equals("const")){
            System.out.println("Error: La variable [" + i.tok.getText() + "] es constante.");
        }else{
            if (i != null) {
                //verificar tipo de Expr
                int te = (Integer) visit(ctx.expression());
                //comparar para verificar error de tipos
                if (i.type != te)
                    System.out.println("Error: Tipos incompatibles en asignación");
            }
            else
                System.out.println("Error: Variable "
                        + ctx.ID().getText() + " no declarada. Fila: "
                        + ctx.ID().getSymbol().getLine() + ","
                        + ctx.ID().getSymbol().getCharPositionInLine());
        }


        return null;
    }

    @Override
    public Object visitScMethCallAST(Parser2.ScMethCallASTContext ctx) {

        return null;
    }

    @Override
    public Object visitScIfAST(Parser2.ScIfASTContext ctx) {
        int te = (Integer) visit(ctx.expression());
        if (te != 0)
            System.out.println("Error de tipos en Expresión en ...");

        visit(ctx.singleCommand(0));
        visit(ctx.singleCommand(1));
        return null;
    }

    @Override
    public Object visitScWhileAST(Parser2.ScWhileASTContext ctx) {
        int te = (Integer) visit(ctx.expression());
        if (te != 0)
            System.out.println("Error de tipos en Expresión en ...");

        visit(ctx.singleCommand());
        return null;
    }

    @Override
    public Object visitScLetAST(Parser2.ScLetASTContext ctx) {
        this.tablaIDs.openScope();
        visit(ctx.declaration());
        visit(ctx.singleCommand());
        this.tablaIDs.closeScope();
        return null;
    }

    @Override
    public Object visitScBlockAST(Parser2.ScBlockASTContext ctx) {

        visit(ctx.command());
        return null;
    }

    @Override
    public Object visitDeclsAST(Parser2.DeclsASTContext ctx) {
        for( Parser2.SingleDeclarationContext ele : ctx.singleDeclaration())
            visit(ele);

        this.tablaIDs.imprimir();
        return null;
    }

    @Override
    public Object visitSdConstAST(Parser2.SdConstASTContext ctx) {
        //CONST ID VIR expression
        int res = -1;
        res = (Integer) visit(ctx.expression());
        tablaIDs.insertar(ctx.ID().getSymbol(),res,ctx);
        return null;
    }

    @Override
    public Object visitSdVarAST(Parser2.SdVarASTContext ctx) {
        int tipo=-1;
        tipo = (Integer) visit(ctx.typedenoter());
        tablaIDs.insertar(ctx.ID().getSymbol(),tipo,ctx);
        return null;
    }

    @Override
    public Object visitTypeDenIntAST(Parser2.TypeDenIntASTContext ctx) {
        if(ctx.INT().getText().equals("int")){

            return 0;
        }
        return null;
    }

    @Override
    public Object visitTypeDenCharAST(Parser2.TypeDenCharASTContext ctx) {
        if(ctx.CHAR().getText().equals("char")){

            return 1;
        }
        return null;
    }


    @Override
    public Object visitPExprCharAST(Parser2.PExprCharASTContext ctx) {
        return 1;
    }



    @Override
    public Object visitExprAST(Parser2.ExprASTContext ctx) {
        //expression : primaryExpression (operator primaryExpression)*
        int t1 = -1;
        int t2 = -2;
        t1 = (Integer) visit(ctx.primaryExpression(0));
        for (int i=0; i<= ctx.operator().size()-1; i++) {
            t2 = (Integer) visit(ctx.primaryExpression(i + 1));
            if (t1 != t2) {
                System.out.println("Tipos incompatibles al realizar la operación de "
                        + ctx.operator(i).getText() + " en ...");
                return -1;
            }
            t1= t2; //el tipo de la operación
        }

        return t1;
    }

    @Override
    public Object visitPExprNumAST(Parser2.PExprNumASTContext ctx) {

        return 0;
    }

    @Override
    public Object visitPExprIdAST(Parser2.PExprIdASTContext ctx) {
        SymbolTable.Ident res = tablaIDs.buscar(ctx.ID().getText());
        if (res != null)
            return res.type;
        else
            return -1;
    }

    @Override
    public Object visitPExprGroupAST(Parser2.PExprGroupASTContext ctx) {

        return (Integer) visit(ctx.expression());
    }

    @Override
    public Object visitOpSumAST(Parser2.OpSumASTContext ctx) {

        return null;
    }

    @Override
    public Object visitOpSubAST(Parser2.OpSubASTContext ctx) {

        return null;
    }

    @Override
    public Object visitOpMulAST(Parser2.OpMulASTContext ctx) {

        return null;
    }

    @Override
    public Object visitOpdIVAST(Parser2.OpdIVASTContext ctx) {

        return null;
    }
}
