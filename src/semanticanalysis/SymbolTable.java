package semanticanalysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

import ast.BoolType ;
import ast.IntType;
import ast.Type;

public class SymbolTable  {
	private ArrayList<HashMap<String,STentry>>  symbol_table ;
	private ArrayList<Integer> offset;


	public SymbolTable() {
		symbol_table = new ArrayList<HashMap<String,STentry>>() ;
		offset = new ArrayList<Integer>() ;
	}
	
	public Integer nesting() {
		return symbol_table.size() -1 ;
	}
	
	public STentry lookup(String id) {
		int n = symbol_table.size() - 1 ;
		boolean found = false ;
		STentry T = null ;
		while ((n >= 0) && !found) {
			HashMap<String,STentry> H = symbol_table.get(n) ;
			T = H.get(id) ;
			if (T != null) found = true ;
			else n = n-1 ;
		}
		return T ;
	}

	public Integer nslookup(String id) {
		int n = symbol_table.size() - 1 ;
		boolean found = false ;
		while ((n >= 0) && !found) {
			HashMap<String,STentry> H = symbol_table.get(n) ;
			if (H.get(id) != null) found = true ;
			else n = n-1 ;
		}
		return n ;
	}

	public void add(HashMap<String,STentry> H) {
		symbol_table.add(H) ;
		offset.add(1) ;		// si inizia da 2 perche` prima ci sonop FP e AL
	}
	
	public void remove() {
		int x = symbol_table.size() ;
		symbol_table.remove(x-1) ;
		offset.remove(x-1) ;
	}
	
	public boolean top_lookup(String id) {
		int n = symbol_table.size() - 1 ;
		STentry T = null ;
		HashMap<String,STentry> H = symbol_table.get(n) ;
		T = H.get(id) ;
		return (T != null) ;
	}
	
	public void insert(String id, Type type, int _nesting, String _label) {
		int n = symbol_table.size() - 1 ;
		HashMap<String,STentry> H = symbol_table.get(n) ;
		symbol_table.remove(n) ;
		int offs = offset.get(n) ;
		offset.remove(n) ;
		STentry idtype = new STentry(type,offs,_nesting, _label) ;
		H.put(id,idtype) ;
		symbol_table.add(H) ;
		if (type.getClass().equals((new BoolType()).getClass()))
			offs = offs + 1 ; // we always increment the offset by 1 otherwise we need ad-hoc
							  // bytecode operations
		else if (type.getClass().equals((new IntType()).getClass()))
			offs = offs + 1 ;
		else offs = offs + 1 ;
		offset.add(offs) ;	
	}

	public void increaseoffset() {
		int n = offset.size() - 1 ;
		int offs = offset.get(n) ;
		offset.remove(n) ;
		offs = offs + 1 ;
		offset.add(offs) ;	
	}


	@Override
	public boolean equals(Object o) {

		SymbolTable that = (SymbolTable) o;
		for (HashMap<String,STentry> ob : that.symbol_table ){
			if(!symbol_table.contains(ob)){
				return false;
			}
		}


		return true;
	}

	public HashMap<String,STentry> common(SymbolTable st){
		//qualcosa in comune?
		Boolean common=false;

		//creo un Arraylist di hashmap che mi rappresenta la st in comune
		ArrayList<HashMap<String,STentry>> stElem= new ArrayList<>();

		//lista delle STentry init in else
		HashMap<String,STentry>  entryInitElse = new HashMap<>();

		//lista delle STentry init in then
		HashMap<String,STentry> entryInitThen = new HashMap<>();

		//lista delle STentry in comune
		HashMap<String,STentry> entryCommon = new HashMap<>();

		for (HashMap<String,STentry> ob : st.symbol_table){
			//aggiungo nella lista delle entry tutte le entry init del ramo else
			for(String s : ob.keySet()){
				STentry copia = ob.get(s);
				if(copia.isInit()){

					entryInitElse.put(s,copia);
				}
			}
		}

		for (HashMap<String,STentry> ob : symbol_table){
			//aggiungo nella lista delle entry tutte le entry init del ramo then
			for(String s : ob.keySet()){
				STentry copia = ob.get(s);
				if(copia.isInit()){
					entryInitThen.put(s,copia);
				}
			}
		}

		//vedo se i due array list di STentry hanno qualcosa in comune
		for(String s : entryInitElse.keySet()) {
			if (entryInitThen.containsKey(s)) {
				common = true;

				entryCommon.put(s,entryInitElse.get(s));
			}
		}

		//se hanno qualcosa in comune ritorno l'array list di STentry
		if(common) {

			return entryCommon;
		}

		return null;

	}

	@Override
	public int hashCode() {
		return Objects.hash(symbol_table, offset);
	}

	public ArrayList<HashMap<String, STentry>> getSymbol_table() {
		return symbol_table;
	}

	public ArrayList<Integer> getOffset() {
		return offset;
	}

	public void setSymbol_table(ArrayList<HashMap<String, STentry>> symbol_table) {
		for(HashMap<String, STentry> t : symbol_table){
			HashMap<String, STentry> tmp = new HashMap<>();
			for(String s : t.keySet()){
				STentry copia = t.get(s);
				STentry other = new STentry(copia.gettype(),copia.getoffset(),copia.getnesting(), copia.getlabel(), copia.getInit());
				tmp.put(s,other);
			}

			this.symbol_table.add(tmp);
		}

	}

	public void setOffset(ArrayList<Integer> offset) {

		for(Integer i : offset){

			this.offset.add(i);
		}

	}
}
