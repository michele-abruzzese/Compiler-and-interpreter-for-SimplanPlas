package semanticanalysis;

public class SemanticError {
	private String msg;

	//per capire se è l'errore di inizializzazione
	private boolean init;
	public SemanticError(String _msg) {
		msg = _msg;
	}
	
	public String toString() {		
		return msg;
	}

	public boolean isInit() {
		return init;
	}

	public void setInit(boolean init) {
		this.init = init;
	}
}
