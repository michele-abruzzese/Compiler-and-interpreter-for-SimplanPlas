import antlr.SVMLexer;
import antlr.SVMParser;
import antlr.simplanPlusLexer;
import antlr.simplanPlusParser;
import ast.*;
import evaluator.ExecuteVM;
import jdk.dynalink.StandardOperation;
import org.antlr.v4.runtime.*;
import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        //ex 1
        String fileName = "src/prova.simplanplus";

        FileInputStream is = new FileInputStream(fileName);
        ANTLRInputStream input = new ANTLRInputStream(is);
        simplanPlusLexer lexer = new simplanPlusLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        tokens.fill();

        List<Token> errorLexer = new ArrayList<>();
        for(Token t : tokens.getTokens()){
            if(t.getType() == simplanPlusLexer.ERR){
                errorLexer.add(t);
                System.out.print(t);

            }
        }


        File fErr = new File("out/errors.txt");
        if(!fErr.exists()){
            fErr.createNewFile();
        }else{
            fErr.delete();
            fErr.createNewFile();
        }

        for(int i=0; i<errorLexer.size();i++){

            int lineErr = errorLexer.get(i).getLine();
            String strErr = errorLexer.get(i).getText();
            int posErr =  errorLexer.get(i).getCharPositionInLine()+1;

            String write = "Errore "+i+1+" :linea "+lineErr+" carattere numero "+posErr+" = "+strErr+"\n";

            Files.write(Paths.get("out/errors.txt"), write.getBytes(), StandardOpenOption.APPEND);


        }

        //
        //booleano per fare pass sugli errori di inizializzazione
        boolean initError = false;

        //istanzio il listener per gli errori del parser
        ErrorListener listener = new ErrorListener();

        simplanPlusParser parser = new simplanPlusParser(tokens);
        //rimuovo il listener di default del parser
        parser.removeErrorListeners();
        //Aggiungo l'error listener per intercettare errori sintattici
        parser.addErrorListener(listener);
        simplanPlusVisitorImpl visitor = new simplanPlusVisitorImpl();

        Node ast;
        try {
            ast = visitor.visit(parser.prog());
        }catch (RuntimeException e){
            System.err.println(e.getMessage());
            return;
        }

        //se non ci sono errori lessicali
        if(errorLexer.isEmpty()){
            SymbolTable ST = new SymbolTable();
            ArrayList<SemanticError> errors = ast.checkSemantics(ST, 0);

            //se non voglio considerare gli errori di inizializzazione
            if(!initError) {
                //uso una lista ausiliaria dove inserisco tutti gli errori di inizializzazione
                ArrayList<SemanticError> errorsInit = new ArrayList<>();
                for (SemanticError err : errors) {
                    //se è un errore di inizializzazione
                    if (err.isInit()) {
                        //stamp l'errore
                        System.out.println(err);
                        /*aggiungo alla lista gli errori di inizializzazione
                        non toglo questo errore dalla lista err altimenti nel prossimo giro di for si blocca
                         */
                        errorsInit.add(err);

                    }
                }

                for (SemanticError errInit : errorsInit){
                    //lo tolgo dalla lista degli errori
                    errors.remove(errInit);
                }
            }

            if(errors.size()>0){
                System.out.println("You had: " + errors.size() + " errors:");
                for(SemanticError e : errors)
                    System.out.println("\t" + e);
            }else {
                System.out.println("Visualizing AST...");
                System.out.println(ast.toPrint(""));

                //ArrayList contenente i tipi, ci serve per vedere se ci sono errori di tipo
                ArrayList<Type> typeReturn  = new ArrayList<>();
                //flag errore di tipo
                Boolean errorTypeInCode = false;
                Node type = ast.typeCheck(typeReturn);




                for(Object t: typeReturn){
                    if(t instanceof ErrorType){
                        System.out.println("errore di tipo rilevato");
                        errorTypeInCode = true;
                    }
                }

                if (errorTypeInCode) {
                    System.out.println("Type checking is WRONG!");

                }else {
                    System.out.println(type.toPrint("Type checking ok! Type of the program is: "));

                    // CODE GENERATION  prova.SimpLan.asm
                    String code = ast.codeGeneration();
                    BufferedWriter out = new BufferedWriter(new FileWriter(fileName + ".asm"));
                    //System.out.println(code);
                    out.write(code);
                    out.close();
                    System.out.println("Code generated! Assembling and running generated code.");

                    FileInputStream isASM = new FileInputStream(fileName + ".asm");
                    ANTLRInputStream inputASM = new ANTLRInputStream(isASM);
                    SVMLexer lexerASM = new SVMLexer(inputASM);
                    CommonTokenStream tokensASM = new CommonTokenStream(lexerASM);
                    SVMParser parserASM = new SVMParser(tokensASM);

                    //parserASM.assembly();

                    SVMVisitorImpl visitorSVM = new SVMVisitorImpl();
                    visitorSVM.visit(parserASM.assembly());

                    //System.out.println("You had: "+lexerASM.lexicalErrors+" lexical errors and "+parserASM.getNumberOfSyntaxErrors()+" syntax errors.");
                    //if (lexerASM.lexicalErrors>0 || parserASM.getNumberOfSyntaxErrors()>0) System.exit(1);

                    System.out.println("Starting Virtual Machine...");
                    ExecuteVM vm = new ExecuteVM(visitorSVM.code);
                    vm.cpu();
                }
            }
            }
        }

}

