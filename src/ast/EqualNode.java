package ast;

import evaluator.SimpLanPluslib;
import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

import java.util.ArrayList;

//class for equal
public class EqualNode implements Node{
    private Node left;
    private Node right;
    public EqualNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting)  {
        ArrayList<SemanticError> errors = new ArrayList<SemanticError>();

        errors.addAll(left.checkSemantics(ST,_nesting));
        errors.addAll(right.checkSemantics(ST,_nesting));

        return errors;
    }
    @Override
    public Type typeCheck(ArrayList<Type> t)  {
        if (left.typeCheck(t).getClass().equals(right.typeCheck(t).getClass())) {
            return new BoolType();
        }else {
            System.out.println("Type Error: Different types in equality") ;
            t.add(new ErrorType());
            return new ErrorType() ;
        }
    }

    @Override
    public String codeGeneration() {
        String trueEq = SimpLanPluslib.freshLabel();
        String endEq = SimpLanPluslib.freshLabel();
        return	left.codeGeneration()
                + "pushr A0 \n"
                + right.codeGeneration()
                + "popr T1 \n"
                + "beq A0 T1 "+ trueEq +"\n"
                + "storei A0 0\n"
                + "b " + endEq + "\n"
                + trueEq + ":\n"
                + "storei A0 1\n"
                + endEq + ":\n";
    }

    @Override
    public String toPrint(String s) {
        return s+"Equal\n" + left.toPrint(s+"  ") + right.toPrint(s+"  ") ;
    }
}
