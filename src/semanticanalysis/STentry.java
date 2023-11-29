package semanticanalysis;

import ast.Type;

import java.util.Objects;

public class STentry {
	private Type type ;
	private int offset ;
	private int nesting ;
	private String label ;

	//mi dice se inizializzata
	private Boolean init;


	
	public STentry(Type _type, int _offset, int _nesting) {
		type = _type ;
		offset = _offset ;
		nesting = _nesting ;
	}
	
	public STentry(Type _type, int _offset, int _nesting, String  _label) {
		type = _type ;
		offset = _offset ;
		nesting = _nesting ;
		label = _label ;
		init = false;

	}

	public STentry(Type _type, int _offset, int _nesting, String  _label, Boolean _init) {
		type = _type ;
		offset = _offset ;
		nesting = _nesting ;
		label = _label ;
		init = _init;

	}
	
	public Type gettype() {
		return type ;
	}

	public Boolean getInit() {
		return init;
	}

	public int getoffset() {
		return offset ;
	}
	
	public int getnesting() {
		return nesting ;
	}
	
	public String getlabel() {
		return label ;
	}

	public void initVar() {
		init = true;
	}

	public  boolean isInit(){
		return init;
	}

	public void setInit(Boolean init) {
		this.init = init;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		STentry sTentry = (STentry) o;
		return offset == sTentry.offset && nesting == sTentry.nesting && Objects.equals(type, sTentry.type) && Objects.equals(label, sTentry.label) && Objects.equals(init, sTentry.init);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, offset, nesting, label, init);
	}

	@Override
	public String toString() {
		return "STentry{" +
				"type=" + type +
				", offset=" + offset +
				", nesting=" + nesting +
				", label='" + label + '\'' +
				", init=" + init +
				'}';
	}
}
