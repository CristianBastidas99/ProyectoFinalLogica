package co.edu.uniquindio.org.clases;

import java.util.ArrayList;

public class Conector {

	TipoConector tipoConector;
	ArrayList<Termino> clases;

	public Conector(TipoConector tipoConector) {
		super();
		this.tipoConector = tipoConector;
		this.clases = new ArrayList<>();
	}
	
	public Conector() {
		super();
		this.tipoConector = null;
		this.clases = new ArrayList<>();
	}

	public TipoConector getTipoConector() {
		return tipoConector;
	}

	public void setTipoConector(TipoConector tipoConector) {
		this.tipoConector = tipoConector;
	}

	public ArrayList<Termino> getClases() {
		return clases;
	}

	public void setClases(ArrayList<Termino> clases) {
		this.clases = clases;
	}

	@Override
	public String toString() {
		return "Conector [tipoConector=" + tipoConector + ", clases=" + clases + "]\n";
	}

}
