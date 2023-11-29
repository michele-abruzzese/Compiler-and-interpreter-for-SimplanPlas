package ast;

import semanticanalysis.STentry;
import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

import java.util.ArrayList;
//class for assignment
public class AssNode implements Node{
    private String idString;
    private Node right;
    private Type tipo;

    private int asgNesting;
    private int varNesting;
    private String offset;
    private STentry entry;


    public AssNode(String idString, Node right) {

        this.idString= idString;
        this.right = right;


    }

    @Override
    public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting)  {

        asgNesting = _nesting;

        ArrayList<SemanticError> errors = new ArrayList<SemanticError>();
        errors.addAll(right.checkSemantics(ST,_nesting));
        entry = ST.lookup(idString);
        if (ST.lookup(idString) == null){
            errors.add(new SemanticError("Var id " + idString + " not declared"));
        }else{
            tipo = ST.lookup(idString).gettype();

            varNesting = ST.lookup(idString).getnesting();
            offset = String.valueOf(ST.lookup(idString).getoffset());

            //dico che id lo sto inizializzando
            if(!ST.lookup(idString).isInit()) {
                ST.lookup(idString).initVar();
            }
        }

        System.out.println("tabella dei simbolo dopo assegnamento"+ST.getSymbol_table().toString());
        return errors;
    }
    @Override
    public Type typeCheck(ArrayList<Type> t) {
        if (right.typeCheck(t).getClass().equals(tipo.getClass())) {
            return null;
        }else {
            System.out.println("Type Error: incompatible type of expression for variable "+idString) ;
            t.add(new ErrorType());
            return new ErrorType() ;
        }
    }

    @Override
    public String codeGeneration() {
        String getAR="";
        for (int i=0; i < asgNesting - varNesting; i++)
            getAR += "store T1 0(T1)\n";
        return right.codeGeneration()
                + "move AL T1\n"
                + getAR
                +"subi T1 " + entry.getoffset() + " \n" + //Offset in cui si trova l'identificatore
                "load A0 0(T1) \n";
    }

    @Override
    public String toPrint(String s) {
        return s + "Assign\n"+idString+" " + right.toPrint(s+"  ") ;
    }

}
