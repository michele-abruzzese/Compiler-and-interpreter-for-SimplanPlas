package ast;

import evaluator.SimpLanPluslib;
import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

import java.util.ArrayList;
//class for and operation
public class AndNode implements Node{
    private Node left;
    private Node right;
    public AndNode(Node left, Node right) {
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
    public Type typeCheck(ArrayList<Type> t) {

        if ((left.typeCheck(t) instanceof BoolType) && (right.typeCheck(t) instanceof BoolType) ) {
            return new BoolType();
        }else {
            System.out.println("Type Error: Non Boolean in And instruction") ;
            t.add(new ErrorType());
            return new ErrorType() ;

        }
    }

    @Override
    public String codeGeneration() {
        String falsel = SimpLanPluslib.freshLabel();
        String end = SimpLanPluslib.freshLabel();

        return left.codeGeneration()+
                "storei T1 0 \n" +
                "beq A0 T1 " + falsel + "\n" +
                "pushr A0 \n" +
                right.codeGeneration() +
                "popr T1 \n" +
                "beq A0 T1 " + falsel + "\n" +
                "storei A0 1 \n" +
                "b " + end + "\n" +
                falsel + ":\n" +
                "storei A0 0 \n" +
                end + ":\n";
    }

    @Override
    public String toPrint(String s) {
        return s + "And\n"+left.toPrint(s+"  ") + right.toPrint(s+"  ") ;
    }
}
