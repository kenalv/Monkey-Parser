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

        }
//
}
