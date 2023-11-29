package ast;

import evaluator.SimpLanPluslib;
import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

import java.util.ArrayList;

//class for greater
public class GreaterNode implements Node{
    private Node left;
    private Node right;

    public GreaterNode (Node _left, Node _right) {
        left = _left ;
        right = _right ;
    }
    @Override
    public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
        ArrayList<SemanticError> errors = new ArrayList<SemanticError>();

        errors.addAll(left.checkSemantics(ST, _nesting));
        errors.addAll(right.checkSemantics(ST, _nesting));

        return errors;
    }

    @Override
    public Type typeCheck(ArrayList<Type> t)  {
        if ((left.typeCheck(t) instanceof IntType) && (right.typeCheck(t) instanceof IntType) ) {
            return new BoolType();

        }else {
            System.out.println("Type Error: Non Integers in Greater instruction") ;
            t.add(new ErrorType());
            return new ErrorType() ;
        }
    }

    @Override
    public String codeGeneration() {
        String falseGt = SimpLanPluslib.freshLabel();
        String trueGt = SimpLanPluslib.freshLabel();
        String endGt = SimpLanPluslib.freshLabel();
        return	left.codeGeneration()
                + "pushr A0 \n"
                + right.codeGeneration()
                + "popr T1 \n"
                + "beq A0 T1 " + falseGt + "\n"
                + "bleq A0 T1 "+ trueGt +"\n"
                + "b " + falseGt + "\n"
                + trueGt + ":\n"
                + "storei A0 1\n"
                + "b " + endGt + "\n"
                + falseGt +":\n"
                + "storei A0 0\n"
                + endGt + ":\n";

    }

    @Override
    public String toPrint(String s) {
        return s+"Greater\n" + left.toPrint(s+"  ") + right.toPrint(s+"  ") ;
    }
}
