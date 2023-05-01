/**
 * 
 */
package co.edu.uniquindio.org.clases;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * @author Cristian
 *
 */
public class Main {

	private Silogismo miSilogismo;
	private ArrayList<Termino> misTerminos;
	

	/**
	 * @param miSilogismo
	 */
	public Main() {
		this.miSilogismo = new Silogismo();
		this.misTerminos = new ArrayList<Termino>();
		this.misTerminos.add(new Termino("leon"));
		this.misTerminos.add(new Termino("garras"));
		this.misTerminos.add(new Termino("carnivoro"));
	}

	/**
	 * @param args
	 */
	public void main() {
		// TODO Auto-generated method stub

		Silogismo silogismo = new Silogismo();

		Termino termino = new Termino("carnivoro");
		Termino termino2 = new Termino("leon");
		Termino termino3 = new Termino("colnillos");

		Conector conector = new Conector(TipoConector.A);
		conector.getClases().add(termino2);
		conector.getClases().add(termino);

		Conector conector2 = new Conector(TipoConector.I);
		conector2.getClases().add(termino2);
		conector2.getClases().add(termino3);

		Conector conector3 = new Conector(TipoConector.A);
		conector3.getClases().add(termino3);
		conector3.getClases().add(termino);

		silogismo.getConectores().add(conector);
		silogismo.getConectores().add(conector2);
		silogismo.getConectores().add(conector3);

		silogismo.verificarValidez();
	}

	public void agragarTermino(String nombre) {

		String nombreMin = nombre.toLowerCase();
		if (isTermino(nombreMin)) {
			Termino miTermino = new Termino(nombreMin);
			misTerminos.add(miTermino);
			JOptionPane.showMessageDialog(null, "Se agrego con exito");
		} else {
			JOptionPane.showMessageDialog(null, "El termino ya existe");
		}

	}

	public boolean isTermino(String nombre) {

		boolean bandera = true;
		for (int i = 0; i < misTerminos.size(); i++) {
			if (misTerminos.get(i).nombre.equals(nombre)) {
				bandera = false;
			}
		}
		return bandera;
	}

	/**
	 * @return the miSilogismo
	 */
	public Silogismo getMiSilogismo() {
		return miSilogismo;
	}

	/**
	 * @param miSilogismo the miSilogismo to set
	 */
	public void setMiSilogismo(Silogismo miSilogismo) {
		this.miSilogismo = miSilogismo;
	}

	public void crearSilogismo(int conector1, int conector2, int conector3, int termino1, int termino2, int termino3,
			int termino4, int termino5, int termino6) {

		miSilogismo = new Silogismo();

		ArrayList<TipoConector> tiposConector = new ArrayList<>();
		tiposConector.add(TipoConector.A);
		tiposConector.add(TipoConector.E);
		tiposConector.add(TipoConector.I);
		tiposConector.add(TipoConector.O);

		Conector cconector1 = new Conector(tiposConector.get(conector1));
		cconector1.getClases().add(misTerminos.get(termino1));
		cconector1.getClases().add(misTerminos.get(termino2));

		Conector cconector2 = new Conector(tiposConector.get(conector2));
		cconector2.getClases().add(misTerminos.get(termino3));
		cconector2.getClases().add(misTerminos.get(termino4));

		Conector cconector3 = new Conector(tiposConector.get(conector3));
		cconector3.getClases().add(misTerminos.get(termino5));
		cconector3.getClases().add(misTerminos.get(termino6));

		miSilogismo.getConectores().add(cconector1);
		miSilogismo.getConectores().add(cconector2);
		miSilogismo.getConectores().add(cconector3);
		
		miSilogismo.verificarValidez();
	}

	/**
	 * @return the misTerminos
	 */
	public ArrayList<Termino> getMisTerminos() {
		return misTerminos;
	}

	/**
	 * @param misTerminos the misTerminos to set
	 */
	public void setMisTerminos(ArrayList<Termino> misTerminos) {
		this.misTerminos = misTerminos;
	}

}
