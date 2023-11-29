package ast;

import java.util.ArrayList;

import semanticanalysis.STentry;
import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

//class for parameters
public class ParNode implements Node {

  private String id;
  private Type type;
  private int nesting ;
  
  public ParNode (String _id, Type _type) {
   id = _id ;
   type = _type ;
  }
  
  public String getId(){
	  return id;
  }
  
  public Type getType(){
	  return type;
  }
  
  @Override
	public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
	  nesting = _nesting ;

	  return new ArrayList<SemanticError>();
	}
  
   //non utilizzato
  public Type typeCheck (ArrayList<Type> t) {
     return null;
  }
  
  //non utilizzato
  public String codeGeneration() {
		return "";
  }
  
  public String toPrint(String s) {
	  return s+"Par " + id + ":" + type.toPrint(s) ; 
  }
  

    
}  