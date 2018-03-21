
import generated.MonkeyParser;
import generated.MonkeyScanner;
import generated.NiceError;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;


import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public abstract class Main {



    public static void main(String[] args){
        MonkeyScanner scanner = null;
        MonkeyParser parser = null;
        List<String> errors = new ArrayList<>();


        try {
            ANTLRInputStream input = new ANTLRInputStream(new FileReader("text.txt"));
            scanner = new MonkeyScanner(input);
            CommonTokenStream tokens = new CommonTokenStream(scanner);
            parser = new MonkeyParser(tokens);

            NiceError err = new NiceError(errors);

            scanner.removeErrorListeners();
            scanner.addErrorListener(err);

            parser.removeErrorListeners();
            parser.addErrorListener(err);



        }
        catch(Exception e){
            System.out.println("No hay archivo");
        }
        List<Token> lista = (List<Token>) scanner.getAllTokens();

    /*    for (Token t : lista)
            System.out.println(t.getType() + ":" + t.getText() + "\n");
*/
        scanner.reset();

        try {
            ParseTree tree = parser.program();


            for (String s : errors)
                System.out.println(s);

            System.out.println("Compilación Exitosa!!\n");
            System.out.println(tree.toStringTree(parser));

         //   PrettyPrint printVisitor = new PrettyPrint();
        //    printVisitor.visit(tree);


            java.util.concurrent.Future <JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree,parser);

        }
        catch(RecognitionException e){
            System.out.println("Compilación Fallida!!");
        }



    }
}
