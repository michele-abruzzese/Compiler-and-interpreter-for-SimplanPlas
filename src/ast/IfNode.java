package ast;

import java.util.ArrayList;
import java.util.HashMap;

import evaluator.SimpLanPluslib;
import semanticanalysis.STentry;
import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

//class for if
public class IfNode implements Node {
	private Node guard ;
	private ArrayList<Node> thenbranch ;
	private ArrayList<Node> elsebranch ;
	//mi serve per capire se sono nell'if dell'exp
	private boolean exp;
  
	public IfNode (Node _guard, ArrayList<Node> _thenbranch, ArrayList<Node> _elsebranch,boolean _exp) {
    	guard = _guard ;
    	thenbranch = _thenbranch ;
    	elsebranch = _elsebranch ;
    	exp = _exp;
  }
  
   @Override
  public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting)  {
	  ArrayList<SemanticError> errors = new ArrayList<SemanticError>();

	  errors.addAll(guard.checkSemantics(ST, _nesting));

	   SymbolTable thenST = new SymbolTable();
	   thenST.setSymbol_table(ST.getSymbol_table());
	   thenST.setOffset(ST.getOffset());



	   SymbolTable elseST = new SymbolTable();
	   elseST.setSymbol_table(ST.getSymbol_table());
	   elseST.setOffset(ST.getOffset());

	   System.out.println("tabella dei simboli prima di tutto: "+ST.getSymbol_table().toString());



	   for(Node th : thenbranch){
		   errors.addAll(th.checkSemantics(thenST, _nesting));
	   }



	   System.out.println("tabella dopo then: "+ thenST.getSymbol_table().toString());
	   for(Node el : elsebranch){

		   errors.addAll(el.checkSemantics(elseST, _nesting));
	   }
	   System.out.println("tabella dopo else: "+ elseST.getSymbol_table().toString());


	   // Se le tabelle sono uguali allora abbiamo iniziato
	   // solo ed esclusivamente le stesse variabili da entrambe le parti
	   // quindi dopo l'if le variabili devono risultare inizializzate
	   if(thenST.equals(elseST)){
		   System.out.println("abbiamo inizializzato le stesse variabili sia nel then che nell'else");

		   ST.setSymbol_table(thenST.getSymbol_table());
		   ST.setOffset(thenST.getOffset());


	   }else {

		   	System.out.println("tabelle diverse");

		   	// se hanno qualcosa in comune allora mi prendo le cose in comune
		    // e le metto nella ST principale
			if(thenST.common(elseST)!=null){

				System.out.println("qualcosa in comune");
				HashMap<String,STentry> common= new HashMap<>();

				//prendo l'arraylist delle entry in comune che sono init
				common= thenST.common(elseST);

				for (HashMap<String,STentry> hm : ST.getSymbol_table()){

					for(String s : hm.keySet()){
						for(String s1 : common.keySet()){
							if(s.equals(s1)){
								hm.get(s).setInit(true);
							}
						}
					}
				}

			}


	   }

	   System.out.println("tabella dei simboli dopo di tutto: "+ST.getSymbol_table().toString());
	   return errors;
  }

	@Override
	public Type typeCheck(ArrayList<Type> t) {

		if (guard.typeCheck(t) instanceof BoolType) {
			Type thenT = null;
			Type elseT = null;

			for(Node th : thenbranch){
				thenT = th.typeCheck(t);
			}

			for(Node el : elsebranch){
				elseT = el.typeCheck(t);
			}

			//se siamo in un if che ha exp
			if (exp) {
				if (thenT != null && elseT != null) {
					if (elseT.getClass().equals(thenT.getClass())) {
						return thenT;
					}
				}


					System.out.println("tipi diversi then e else");
					//System.out.println("tipo then: "+thenT.getClass());
					//System.out.println("tipo else: " + elseT.getClass());
					t.add(new ErrorType());
					return new ErrorType();

			}else{
				return null;
			}


		}else{
			System.out.println("Type Error: non boolean condition in if");
			t.add(new ErrorType());
			return new ErrorType() ;
		}

	}

	@Override
	public String codeGeneration() {
		String lthen = SimpLanPluslib.freshLabel();
		String lend = SimpLanPluslib.freshLabel();
		String thenCode = "";
		for(Node tb : thenbranch){
			thenCode += tb.codeGeneration();
		}
		String elseCode = "";
		for(Node eb : elsebranch){
			elseCode += eb.codeGeneration();
		}
		return  guard.codeGeneration()
				+ "storei T1 1 \n"
				+ "beq A0 T1 "+ lthen + "\n"
				+ elseCode
				+ "b " + lend + "\n"
				+ lthen + ":\n"
				+ thenCode
				+ lend + ":\n" ;
	}

	@Override
	public String toPrint(String s) {
		String thenb="";

		for(Node t : thenbranch){
			thenb += t.toPrint(s+"\n");

		}

		String elseb="";

		for (Node e : elsebranch){
			elseb += e.toPrint(s+"\n");
		}
		return s+"If\n" + guard.toPrint(s+"  ") + thenb  + elseb;
	}

	public boolean isExp() {
		return exp;
	}

	public void setExp(boolean exp) {
		this.exp = exp;
	}
}