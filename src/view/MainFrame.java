package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import generated.MonkeyParser;
import generated.MonkeyScanner;
import generated.NiceError;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class MainFrame extends JFrame{

    private File currentEditingFile = null;
    private int fontSize = 14;

    public MainFrame() {
        initComponents();

        //Filter Files to display
        //Set JFileChooser to accept only text files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        fileOpener.setFileFilter(filter);

        //Launch the application on the middle of Screen
        this.setLocationRelativeTo(null);
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
                int ans = JOptionPane.showConfirmDialog(rootPane, "Save Changes ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (ans == JOptionPane.YES_OPTION) {
                    saveChanges();
                }
            }

        });
        try {
            this.setIconImage(ImageIO.read(MainFrame.class.getResource("/view/genuine_coder_logo.png")));
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Show File Open dialouge here
                int status = fileOpener.showOpenDialog(rootPane);
                if (status == JFileChooser.APPROVE_OPTION) {
                    if (currentEditingFile != null) {
                        // A file is opened and is being edited. Open the new file in new window
                        MainFrame newWindow = new MainFrame(fileOpener.getSelectedFile());
                        newWindow.setVisible(true);
                        newWindow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                        newWindow.pack();
                        return;
                    }
                    currentEditingFile = fileOpener.getSelectedFile();
                    System.out.println("File chosen. File name = " + fileOpener.getSelectedFile().getName());

                    try {
                        //Now read the contents of file
                        Scanner scn = new Scanner(new FileInputStream(currentEditingFile));
                        String buffer = "";
                        while (scn.hasNext()) {
                            buffer += scn.nextLine() + "\n";
                        }
                        display.setText(buffer);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    System.out.println("No file selected");
                }
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setFont(new java.awt.Font("Monospaced", 0, ++fontSize));
            }
        });
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setFont(new java.awt.Font("Monospaced", 0, --fontSize));
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //If we are editing a file opened, then we have to save the contents on the same file, currentEditingFile
                if (currentEditingFile != null) {
                    try {
                        PrintWriter printWriter = new PrintWriter(currentEditingFile);
                        printWriter.write(display.getText());
                        printWriter.close();
                        JOptionPane.showMessageDialog(rootPane, "Saved to " + currentEditingFile.getName(), "Done", JOptionPane.INFORMATION_MESSAGE);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    int status = saveDialog.showOpenDialog(rootPane);
                    if (status == JFileChooser.APPROVE_OPTION) {
                        //We got directory. Now needs file name
                        String fileName = JOptionPane.showInputDialog("File Name", "Untitled.txt");
                        if (!fileName.contains(".txt")) {
                            fileName += ".txt";
                        }
                        File f = new File(saveDialog.getSelectedFile() + "\\" + fileName);
                        if (f.exists()) {
                            JOptionPane.showMessageDialog(rootPane, "File Already Exist.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        } else {
                            try {
                                f.createNewFile();
                                PrintWriter printWriter = new PrintWriter(f);
                                printWriter.write(display.getText());
                                printWriter.close();
                                JOptionPane.showMessageDialog(rootPane, "Saved", "Done", JOptionPane.INFORMATION_MESSAGE);
                            } catch (IOException ex) {
                                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Error Occured", "Cant Save", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });


        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Copia de MAIN PARA GENERAR EL ARBOL CON RUN
                MonkeyScanner scanner = null;
                MonkeyParser parser = null;
                List<String> errors = new ArrayList<>();


                try {
                    ANTLRInputStream input = new ANTLRInputStream(display.getText());
                    scanner = new MonkeyScanner(input);
                    CommonTokenStream tokens = new CommonTokenStream(scanner);
                    parser = new MonkeyParser(tokens);
                } catch(Exception x){
                    System.out.println("No hay código");
                }

                NiceError err = new NiceError(errors);

                scanner.removeErrorListeners();
                scanner.addErrorListener(err);

                parser.removeErrorListeners();
                parser.addErrorListener(err);

                ParseTree tree = parser.program(); //se ejecuta el parser
                //se habre el AST grafico
                java.util.concurrent.Future <JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree,parser);

                //Se obtienen los errores y se cocatenan en un solo string para enviarlo a la consola grafica.
                String cocatenateErrors = "";
                for (String s : errors)
                    cocatenateErrors += s + "\n";

                // se agregan los errores a la consola gráfica
                console.setText(cocatenateErrors);
            }
        });
    }
    public MainFrame(File file) {
        initComponents();
        this.setLocationRelativeTo(null);

        currentEditingFile = file;
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        fileOpener.setFileFilter(filter);
        readTheParamFile(file);
    }

    public void readTheParamFile(File file) {
        try {
            Scanner scn = new Scanner(file);
            String buffer = "";
            while (scn.hasNext()) {
                buffer += scn.nextLine() + "\n";
            }
            display.setText(buffer);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveChanges() {
        try {
            PrintWriter printWriter = new PrintWriter(currentEditingFile);
            printWriter.write(display.getText());
            printWriter.close();
            //JOptionPane.showMessageDialog(rootPane, "Saved", "Done", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private JPanel jPanel1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JTextArea display;
    private JToolBar jToolBar1;
    private JTextArea console;
    private JSeparator jSeparator1;
    private JFileChooser fileOpener;
    private JFileChooser saveDialog;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;

    private void initComponents() {
        /*
        fileOpener = new javax.swing.JFileChooser();
        saveDialog = new javax.swing.JFileChooser();
         */
        fileOpener = new JFileChooser();
        saveDialog = new JFileChooser();
        jScrollPane1 = new JScrollPane();
        jScrollPane2 = new JScrollPane();

        saveDialog.setDialogType(JFileChooser.SAVE_DIALOG);
        saveDialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Text Editor");

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        jButton1.setIcon(new ImageIcon(getClass().getResource("/view/open_new_file.png"))); // NOI18N
        jButton1.setText("Open");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jButton2.setIcon(new ImageIcon(getClass().getResource("/view/Save_icon.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jButton3.setIcon(new ImageIcon(getClass().getResource("/view/increase_font.png"))); // NOI18N
        jButton3.setText("Increase Font");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        jButton4.setIcon(new ImageIcon(getClass().getResource("/view/decrease_font.png"))); // NOI18N
        jButton4.setText("Decrease Font");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        jButton5.setIcon(new ImageIcon(getClass().getResource("/view/run_script.png"))); // NOI18N
        jButton5.setText("Run");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar1.add(jButton5);

        display.setColumns(20);
        display.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        display.setLineWrap(true);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        console.setColumns(20);
        console.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        console.setForeground(Color.RED);
        console.setLineWrap(true);
        console.setRows(5);
        console.setEnabled(true);
        console.setBackground(Color.LIGHT_GRAY);
        console.setText("Console!");
        jScrollPane2.setViewportView(console);

        //jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        //jLabel1.setText("Genuine Coder");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jToolBar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jToolBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new MainFrame().jPanel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
