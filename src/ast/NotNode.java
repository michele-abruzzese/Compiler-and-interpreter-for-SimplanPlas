package ast;

import evaluator.SimpLanPluslib;
import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

import java.util.ArrayList;

//class for not operation
public class NotNode implements Node{
    private Node right;

    public NotNode(Node right) {
        this.right = right;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting)  {
        ArrayList<SemanticError> errors = new ArrayList<SemanticError>();


        errors.addAll(right.checkSemantics(ST, _nesting));

        return errors;
    }

    @Override
    public Type typeCheck(ArrayList<Type> t)  {
        if (right.typeCheck(t) instanceof BoolType) {
            return new BoolType();
        }else {
            System.out.println("Type Error: Not a Boolean in Not instruction") ;
            t.add(new ErrorType());
            return new ErrorType() ;
        }
    }

    @Override
    public String codeGeneration() {
        String lNot = SimpLanPluslib.freshLabel();
        String exitNot = SimpLanPluslib.freshLabel();
        return	right.codeGeneration()
                + "storei T1 0"
                + "beq A0 T1 " + lNot + "\n"
                + "storei A0 0\n"
                + "b " + exitNot + "\n"
                + lNot + ":\n"
                + "storei A0 1\n"
                + exitNot + ":\n";
    }

    @Override
    public String toPrint(String s) {
        return s+"Not\n"  + right.toPrint(s+"  ") ;
    }
}
