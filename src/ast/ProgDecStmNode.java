package ast;

import evaluator.SimpLanPluslib;
import semanticanalysis.STentry;
import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;

//class for rule program complex
public class ProgDecStmNode implements Node{
    private ArrayList<Node> dec ;
    private ArrayList<Node> stm ;
    private Node exp;
    private int nesting ;

    public ProgDecStmNode(ArrayList<Node> dec, ArrayList<Node> stm, Node exp) {
        this.dec = dec;
        this.stm = stm;
        this.exp = exp;

    }

    @Override
    public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
        nesting = _nesting + 1 ;

        HashMap<String, STentry> H = new HashMap<String, STentry>();
        ST.add(H);

        //declare resulting list
        ArrayList<SemanticError> errors = new ArrayList<SemanticError>();

        for (Node d : dec) {
            errors.addAll(d.checkSemantics(ST, nesting)) ; // nella sintassi non ci sono annidamenti di dec
        }

        for (Node s : stm) {
            errors.addAll(s.checkSemantics(ST, nesting));
        }


        if (exp!=null){
            errors.addAll(exp.checkSemantics(ST, nesting));
        }

        ST.remove();

        return errors;
    }

    @Override
    public Type typeCheck(ArrayList<Type> t)  {
        for (Node d: dec)
            d.typeCheck(t);
        for (Node s: stm)
            s.typeCheck(t);
        if (exp != null) {
            return exp.typeCheck(t);
        } else {
            return new VoidType();
        }
    }

    @Override
    public String codeGeneration() {
        String decCode="";
        for (Node d: dec)
            decCode += d.codeGeneration();

        String stmCode = "";
        for (Node s: stm)
            stmCode += s.codeGeneration();

        String expCode="";
        if (exp != null) {
            expCode = exp.codeGeneration();
        }
        return  "pushr FP \n" +
                "pushr AL \n"
                + decCode
                + stmCode
                + expCode
                + "halt"
                + SimpLanPluslib.getCode();
    }

    @Override
    public String toPrint(String s) {
        String decList = "";

        for(Node d : dec){
            decList+= d.toPrint(s+"\t");
        }

        String stmList = "";
        for(Node st : stm){
            stmList+= st.toPrint(s+"\t");
        }

        String ex="";
        if(exp!=null){
            ex= exp.toPrint(s);
        }

        return s+"ProgComplex\n"+decList+stmList+ex;
    }
}
