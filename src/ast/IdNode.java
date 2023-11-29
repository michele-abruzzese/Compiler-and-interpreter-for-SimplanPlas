package ast;

import java.util.ArrayList;

import semanticanalysis.STentry;
import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

//class for id expression
public class IdNode implements Node {
	private String id ;
	private STentry type ;
	private int nesting ;

	private String offset;

	public IdNode (String _id) {
		id = _id ;
	}
  
	public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
		nesting = _nesting ;

		System.out.println("tabella dei simboli exp: "+ST);
		ArrayList<SemanticError> errors = new ArrayList<SemanticError>();
		nesting = _nesting ;
		
		STentry st_type = ST.lookup(id) ;

		if (st_type != null) {
			//se id non è inizializzata
			if (!ST.lookup(id).isInit()) {
				SemanticError errorInit = new SemanticError("+++++++++ Attenzione +++++++++ Id " + id + " non inizializzata");
				//dico che è un errore di inizializzazione
				errorInit.setInit(true);
				errors.add(errorInit);
			}
			type = st_type;
			offset = String.valueOf(type.getoffset());
		}else {
			errors.add(new SemanticError("Id " + id + " not declared"));
		}


		return errors;
	}
  
	public Type typeCheck (ArrayList<Type> t)  {
		if (type.gettype() instanceof ArrowType) { //nel caso sia una funzione
			System.out.println("Wrong usage of function identifier");
			t.add(new ErrorType());
			return new ErrorType() ;
		} else{
			return type.gettype() ;
		}
	}
  
	public String codeGeneration() {
		String getAR = "";

		for (int i = 0; i < nesting - type.getnesting(); i++)
			getAR += "store T1 0(T1) \n";

		return "move AL T1 \n" +
				getAR +
				"subi T1 " + type.getoffset() + " \n" +	//Offset in cui si trova l'identificatore
				"store A0 0(T1) \n";
	}

	public String toPrint(String s) {
		return s+"Id:" + id + " at nestlev " + type.getnesting() +"\n" ;  
	}
  
}  