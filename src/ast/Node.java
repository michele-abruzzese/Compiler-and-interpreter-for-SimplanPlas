package ast;

import java.util.ArrayList;

import semanticanalysis.SemanticError ;
import semanticanalysis.SymbolTable ;

public interface Node {

	ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) ;
	Type typeCheck(ArrayList<Type> t);
	String codeGeneration();
	String toPrint(String s);


}  