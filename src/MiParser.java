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

        private void a

}
