package ast;

import java.util.ArrayList;
import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

//class for var declaration
public class DecNode implements Node {
	private String id;
	private Node type;
	private int nesting;
	
	public DecNode(String _id, Node _type) {
		id = _id ;
		type = _type ;

	}
  
	public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
   		ArrayList<SemanticError> errors = new ArrayList<SemanticError>();
  		nesting = _nesting ;

  		if(type instanceof VoidType){
			errors.add(new SemanticError("Var id " + id + " non può essere void"));
		}
        
        if (ST.top_lookup(id) == true) 
        	errors.add(new SemanticError("Var id " + id + " already declared"));
        else ST.insert(id, (Type) type, nesting,"") ;
 
        return errors ;
	}

	@Override
	public Type typeCheck(ArrayList<Type> t) {

		return null;
	}

	@Override
	public String codeGeneration() {
		String offset = "1"; // l'offset in ST viene sempre incrementato di 1
		return	"subi SP " + offset + "\n";
				//"popr SP\n";
	}

	@Override
	public String toPrint(String s) {
		return s + "Var:" + id + type.toPrint(" ") + "\n";
	}



}  