package ast;

import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

import java.util.ArrayList;

//class for parenthesis
public class ParenNode implements Node {
    private Node parbody ;

    public ParenNode(Node _parbody) {
        parbody = _parbody ;
    }

    public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting)  {
        ArrayList<SemanticError> errors = new ArrayList<SemanticError>();

        errors.addAll(parbody.checkSemantics(ST, _nesting));

        return errors;
    }

    public Type typeCheck(ArrayList<Type> t) {
        return parbody.typeCheck(t) ;
    }

    public String codeGeneration() {
        return	parbody.codeGeneration() ;
    }

    public String toPrint(String s) {
        return s+"Parenthesis\n" + parbody.toPrint(s+"  ") ;
    }


}