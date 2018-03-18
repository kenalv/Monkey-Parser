
import generated.MonkeyScanner;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.FileReader;


public class Main {
    public static void main(String[] args){
        MonkeyScanner scanner = null;
        MiParser parser = null;

        try {
            ANTLRInputStream input = new ANTLRInputStream(new FileReader("text.txt"));
            scanner = new MonkeyScanner(input);

            parser = new MiParser(scanner);
            parser.parse();
        }
        catch(Exception e){
            System.out.println("No hay archivo");
        }
    }
}
