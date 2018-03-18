import generated.MonkeyScanner;
import org.antlr.v4.runtime.Token;

public class MiParser {

        private MonkeyScanner scanner;
        private Token actualToken = null;

        public MiParser(MonkeyScanner scan){
            this.scanner = scan;
        }


        public void parse(){
            accept();
            program();
        }


        private void accept(String actualToken){
            if (this.actualToken.getType() == scanner.getTokenType(actualToken)){
                accept();
            }
            else{
                System.out.println("Error: Se esperaba token de tipo "+actualToken+" y se recibio token de tipo "+ this.actualToken.getText());
            }
        }

        private void accept(){

            this.actualToken = scanner.nextToken();
        }

        private void program(){
            String cont = "+";

            for (Token x:scanner.getAllTokens()
                 ) {
                System.out.println(x.getText());

            }
        }

        private void statement(){
            if(this.actualToken.getType() == scanner.getTokenType("LET")){
                accept();//si es LET entonces aceptelo ( cambie al siguiente token)
                letStatement(); // llamada a letStatement()
            }else{// si no es LET entonces que imprima error.
                accept("LET");
            }
        }

        private void letStatement(){
            if(this.actualToken.getType() == scanner.getTokenType("ID")){
                accept("ID");
                if(this.actualToken.getType() == scanner.getTokenType("EQUAL")){
                    accept("EQUAL");
                    expression();
                    if(this.actualToken.getType() == scanner.getTokenType("PyCOMA")) {
                        accept("PyCOMA");
                    }
                }
            }else{
                accept("ID");
            }
        }

        private void returnStatement() {
            expression();
            if (this.actualToken.getType() == scanner.getTokenType("PyCOMA")) {
                accept("PyCOMA");
            }
        }

        private void expressionStatement(){
            expression();
        }

        private void comparison(){

            while(this.actualToken.getType() == scanner.getTokenType("MAYORK")
                    || this.actualToken.getType() == scanner.getTokenType("MENORK")
                    || this.actualToken.getType() == scanner.getTokenType("MENORIGUALK")
                    || this.actualToken.getType() == scanner.getTokenType("MAYORIGUALK")
                    || this.actualToken.getType() == scanner.getTokenType("II")){
                accept();
                additionExpression();
            }
        }
        private void additionFactor(){
            while(this.actualToken.getType() == scanner.getTokenType("SUMA")
                    || this.actualToken.getType() == scanner.getTokenType("RESTA")){
                if(this.actualToken.getType() == scanner.getTokenType("SUMA")){
                    accept();
                    multiplicationExpression();
                }else{
                    accept("SUMA");
                }
                if(this.actualToken.getType() == scanner.getTokenType("RESTA")){
                    accept();
                    multiplicationExpression();
                }else {
                    accept("RESTA");
                }
            }
        }

        private void multiplicationFactor(){
            while(this.actualToken.getType() == scanner.getTokenType("MUL")
                    || this.actualToken.getType() == scanner.getTokenType("DIV")){
                    if(this.actualToken.getType() == scanner.getTokenType("MUL")){
                        accept();
                        elementExpression();
                    }else{
                        accept("MUL");
                    }
                    if(this.actualToken.getType() == scanner.getTokenType("DIV")){
                            accept();
                        elementExpression();
                    }else{
                        accept("DIV");
                    }
            }
        }

        private void elementAccess(){
            if(this.actualToken.getType() == scanner.getTokenType("PCIZQ")){
                accept();
                expression();
                if(this.actualToken.getType() == scanner.getTokenType("PCDER")){
                    accept();
                }else{
                    accept("PCDER");
                }
            }else{
                accept("PCIZQ");
            }
        }

        private void callExpression(){
            if(this.actualToken.getType() == scanner.getTokenType("PIZQ")){
                accept();
                expressionList();
                if(this.actualToken.getType() == scanner.getTokenType("PDER")){
                    accept();
                }else {
                    accept("PDER");
                }
            }else {
                accept("PIZQ");
            }
        }

        private void arrayFunctions() {
            if (this.actualToken.getType() == scanner.getTokenType("LEN")) {
                accept();
            } else {
                accept("LEN");
            }
            if (this.actualToken.getType() == scanner.getTokenType("FIRST")) {
                accept();
            } else {
                accept("FIRST");
            }
            if(this.actualToken.getType() == scanner.getTokenType("LAST")){
                accept();
            }else {
                accept("LAST");
            }
            if(this.actualToken.getType() == scanner.getTokenType("REST")){
                accept();
            }else {
                accept("REST");
            }
            if(this.actualToken.getType() == scanner.getTokenType("PUSH")){
                accept();
            }else {
                accept("PUSH");
            }
        }

        private void arrayLiteral(){
            if(this.actualToken.getType() == scanner.getTokenType("PCIZQ")){
                accept();
                expressionList();
                if(this.actualToken.getType() == scanner.getTokenType("PCDER")){
                    accept();
                }else {
                    accept("PCDER");
                }
            }else {
                accept("PCIZQ");
            }
        }

        private void functionLiteral(){
            if(this.actualToken.getType() == scanner.getTokenType("FN")){
                accept();
                if(this.actualToken.getType() == scanner.getTokenType("PIZQ")){
                    accept();
                    functionParameters();
                    if(this.actualToken.getType() == scanner.getTokenType("PDER")){
                        accept();
                        blockStatement();
                    }else {
                        accept("PDER");
                    }
                }else {
                    accept("PIZQ");
                }
            }else {
                accept("FN");
            }
        }

        private void functionParameters(){
            if(this.actualToken.getType() == scanner.getTokenType("ID")){
                accept();
                moreIdentifiers();
            }else {
                accept("ID");
            }
        }

        private void moreIdentifiers(){

            while (this.actualToken.getType() == scanner.getTokenType("COMA")){
                if(this.actualToken.getType() == scanner.getTokenType("COMA")){
                    accept();
                    if(this.actualToken.getType() == scanner.getTokenType("ID")){
                        accept();
                    }else {
                        accept("ID");
                    }
                }else {
                    accept("COMA");
                }
            }
        }

        private void hashLiteral(){
            if(this.actualToken.getType() == scanner.getTokenType("LLAVEIZQ")){
                accept();
                hashContent();
                moreHashContent();
                if(this.actualToken.getType() == scanner.getTokenType("LLAVEDER")){
                    accept();
                }else {
                    accept("LLAVEDER");
                }
            }else {
                accept("LLAVEIZQ");
            }
        }

        private void moreHashContent(){
            while(this.actualToken.getType() == scanner.getTokenType("COMA")){
                if(this.actualToken.getType() == scanner.getTokenType("COMA")){
                    accept();
                    hashContent();
                }else {
                    accept("COMA");
                }
            }
        }

        private void moreExpressions(){
            while(this.actualToken.getType() == scanner.getTokenType("COMA")){
                if(this.actualToken.getType() == scanner.getTokenType("COMA")){
                    accept();
                    expression();
                }else {
                    accept("COMA");
                }
            }
        }

        private void printExpression(){
            if(this.actualToken.getType() == scanner.getTokenType("PUTS")){
                accept();
                if(this.actualToken.getType() == scanner.getTokenType("PIZQ")){
                    accept();
                    expression();
                    if(this.actualToken.getType() == scanner.getTokenType("PDER")){
                        accept();
                    }else {
                        accept("PDER");
                    }
                }else {
                    accept("PIZQ");
                }
            }else {
                accept("PUTS");
            }
        }

        private void ifExpression(){
            if(this.actualToken.getType() == scanner.getTokenType("IF")){
                accept();
                expression();
                blockStatement();

                if(this.actualToken.getType() == scanner.getTokenType("ELSE")){
                    accept("ELSE");
                    blockStatement();
                }
            }else {
                accept("IF");
            }
        }

        private void blockStatement(){
            if(this.actualToken.getType() == scanner.getTokenType("LLAVEIZQ")){
                accept();

            }else {
                accept("LLAVEIZQ");
            }
        }

}
