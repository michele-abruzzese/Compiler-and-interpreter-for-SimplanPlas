package ast;

import evaluator.SimpLanPluslib;
import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

import java.util.ArrayList;

//class for greater equals
public class GreatEqNode implements Node{
    private Node left;
    private Node right;
    public GreatEqNode(Node left, Node right) {
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
        if ((left.typeCheck(t) instanceof IntType) && (right.typeCheck(t) instanceof IntType) ) {
            return new BoolType();
        }else {
            System.out.println("Type Error: Non Integers in Greater Equal instruction") ;
            t.add(new ErrorType());
            return new ErrorType() ;
        }
    }

    @Override
    public String codeGeneration() {
        String trueGeq = SimpLanPluslib.freshLabel();
        String falseGeq = SimpLanPluslib.freshLabel();
        String endGeq = SimpLanPluslib.freshLabel();

        return	left.codeGeneration()
                + "pushr A0 \n"
                + right.codeGeneration()
                + "popr T1 \n"
                + "beq A0 T1 " + trueGeq + "\n"
                + "bleq A0 T1 "+ trueGeq +"\n"
                + "storei A0 0\n"
                + "b " + endGeq + "\n"
                + trueGeq + ":\n"
                + "storei A0 1\n"
                + "b " + endGeq + "\n"
                + endGeq + ":\n";

    }

    @Override
    public String toPrint(String s) {
        return s+"GreatEqual\n" + left.toPrint(s+"  ") + right.toPrint(s+"  ") ;
    }
}
