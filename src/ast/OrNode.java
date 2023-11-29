package ast;

import evaluator.SimpLanPluslib;
import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

import java.util.ArrayList;

public class OrNode implements Node{
    private Node left;
    private Node right;
    public OrNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
        ArrayList<SemanticError> errors = new ArrayList<SemanticError>();

        errors.addAll(left.checkSemantics(ST,_nesting));
        errors.addAll(right.checkSemantics(ST,_nesting));

        return errors;
    }
    @Override
    public Type typeCheck(ArrayList<Type> t)  {
        if ((left.typeCheck(t) instanceof BoolType) && (right.typeCheck(t) instanceof BoolType) ){
            return new BoolType() ;
        }
        else {
            System.out.println("Type Error: Non Boolean in Or instruction") ;
            t.add(new ErrorType());
            return new ErrorType() ;
        }
    }

    @Override
    public String codeGeneration() {
        String lazytrue = SimpLanPluslib.freshLabel();
        String exitOr = SimpLanPluslib.freshLabel();
        return	left.codeGeneration()
                + "storei T1 1\n"
                + "beq A0 T1 " + lazytrue + "\n"
                + right.codeGeneration()
                + "storei T1 1\n"
                + "beq A0 T1 "+ lazytrue +"\n"
                + "storei A0 0\n"
                + "b " + exitOr + "\n"
                + lazytrue + ":\n"
                + "storei A0 1\n"
                + exitOr + ":\n";
    }

    @Override
    public String toPrint(String s) {
        return s+"Or\n" + left.toPrint(s+"  ") + right.toPrint(s+"  ") ;
    }
}
