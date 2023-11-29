package ast;

import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

import java.util.ArrayList;

public class IfSNode implements Node{
    private ArrayList<Node> stm;

    public IfSNode(ArrayList<Node> stm) {
        this.stm = stm;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting)  {
        ArrayList<SemanticError> errors = new ArrayList<SemanticError>();

        for(Node n : stm){
            errors.addAll(n.checkSemantics(ST, _nesting));
        }
        return errors;
    }

    @Override
    public Type typeCheck(ArrayList<Type> t)  {
        for(Node s: stm) {
            s.typeCheck(t);
        }
        return null;
    }

    @Override
    public String codeGeneration() {
        String stmCode = "";
        for (Node s: stm)
            stmCode += s.codeGeneration();
        return stmCode;
    }

    @Override
    public String toPrint(String s) {
        String stmPrint = " ";

        for(Node st : stm){
            stmPrint += st.toPrint(s)+" ";
        }

        return "IfStm "+ stmPrint;
    }
}
