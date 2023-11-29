package ast;

import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

import java.util.ArrayList;

public class IfENode implements Node{
    private ArrayList<Node> stm;
    private Node exp;

    public IfENode(ArrayList<Node> stm, Node exp) {
        this.stm = stm;
        this.exp = exp;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting)  {
        ArrayList<SemanticError> errors = new ArrayList<SemanticError>();

        for(Node n : stm){
            errors.addAll(n.checkSemantics(ST, _nesting));
        }

        errors.addAll(exp.checkSemantics(ST,_nesting));


        return errors;
    }

    @Override
    public Type typeCheck(ArrayList<Type> t) {
        for(Node s: stm)
        {
            s.typeCheck(t);
        }
        return exp.typeCheck(t);
    }

    @Override
    public String codeGeneration() {
        String stmCode = "";
        for (Node s: stm)
            stmCode += s.codeGeneration();
        String expCode="";
        if (exp != null) {
            expCode = exp.codeGeneration();
        }
        return stmCode + expCode;
    }

    @Override
    public String toPrint(String s) {
        String stmPrint = " ";

        for(Node st : stm){
            stmPrint += st.toPrint(s)+" ";
        }

        String expPrint= " ";

        if(exp!=null){
            expPrint= exp.toPrint(s);
        }

        return "ifExp "+stmPrint+expPrint;
    }
}
