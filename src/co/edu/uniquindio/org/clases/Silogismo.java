package co.edu.uniquindio.org.clases;

import java.util.ArrayList;

import co.edu.uniquindio.org.exception.PrimeraReglaExption;
import co.edu.uniquindio.org.exception.ReglaTresExeption;

public class Silogismo {

	int figura;
	ArrayList<Boolean> validez;
	ArrayList<Conector> conectores;

	public Silogismo() {
		super();
		this.figura = 0;
		this.validez = new ArrayList<>();
		this.conectores = new ArrayList<>();
	}

	public void verificarValidez() {

		
		Termino[][] tabla = getMatrizTermino();

		try {
			validez.add(validarPrimeraRegla(tabla));
		} catch (PrimeraReglaExption e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		boolean tercera = false;
		try {
			tercera = validarTerceraRegla(tabla);
		} catch (ReglaTresExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		generarTipoTermino(tabla);

		generarFigura();

		System.out.println(this.figura);

		validez.add(validarSegundaRegla());

		validez.add(tercera);

		validez.add(validarCuartaRegla());

		validez.add(validarQuintaRegla());

		validez.add(validarSextaRegla());

		validez.add(validarSeptimaRegla());

		validez.add(validarOctavaRegla());

		System.out.println(validez.toString());

	}

	public boolean validarOctavaRegla() {

		Boolean bandera = false;
		TipoConector primerConector = conectores.get(0).tipoConector;
		TipoConector segundoConector = conectores.get(1).tipoConector;

		if ((primerConector.equals(TipoConector.O) || primerConector.equals(TipoConector.I))
				&& (segundoConector.equals(TipoConector.O) || segundoConector.equals(TipoConector.I))) {
			bandera = true;
		}

		return bandera;

	}

	public boolean validarSeptimaRegla() {

		TipoConector conectorDebil = masDebil(conectores.get(0).getTipoConector(), conectores.get(1).getTipoConector());
		boolean bandera = true;

		if (conectores.get(2).getTipoConector().equals(conectorDebil)) {
			bandera = false;
		}

		return bandera;

	}

	public TipoConector masDebil(TipoConector primerConector, TipoConector segundoConector) {

		TipoConector conector = null;

		switch (primerConector.toString()) {
		case "A":
			conector = segundoConector;
			break;
		case "E":
			switch (segundoConector.toString()) {
			case "A":
				conector = primerConector;
				break;
			case "E":
				conector = segundoConector;
				break;
			case "I":
				conector = TipoConector.O;
				break;
			case "O":
				conector = segundoConector;
				break;
			}
			break;
		case "I":
			switch (segundoConector.toString()) {
			case "A":
				conector = primerConector;
				break;
			case "E":
				conector = TipoConector.O;
				break;
			case "I":
				conector = segundoConector;
				break;
			case "O":
				conector = segundoConector;
				break;
			}
			break;

		case "O":
			conector = primerConector;
			break;
		}

		return conector;

	}

	public boolean validarSextaRegla() {

		Boolean bandera = false;
		TipoConector primerConector = conectores.get(0).tipoConector;
		TipoConector segundoConector = conectores.get(1).tipoConector;
		TipoConector tercerConector = conectores.get(2).tipoConector;

		if ((primerConector.equals(TipoConector.A) || primerConector.equals(TipoConector.I))
				&& (segundoConector.equals(TipoConector.A) || segundoConector.equals(TipoConector.I))
				&& (tercerConector.equals(TipoConector.E) || tercerConector.equals(TipoConector.O))) {
			bandera = true;
		}

		return bandera;

	}

	public boolean validarQuintaRegla() {

		Boolean bandera = false;
		TipoConector primerConector = conectores.get(0).tipoConector;
		TipoConector segundoConector = conectores.get(1).tipoConector;

		if ((primerConector.equals(TipoConector.E) || primerConector.equals(TipoConector.O))
				&& (segundoConector.equals(TipoConector.E) || segundoConector.equals(TipoConector.O))) {
			bandera = true;
		}

		return bandera;

	}

	public boolean validarCuartaRegla() {

		TipoSujetoPredicado[][] tablaSujeto = generarSujetoPredicado();
		Boolean bandera = true;

		switch (figura) {
		case 1:
			if (tablaSujeto[0][0] == TipoSujetoPredicado.U || tablaSujeto[1][1] == TipoSujetoPredicado.U) {
				bandera = false;
			}
			break;
		case 2:
			if (tablaSujeto[0][1] == TipoSujetoPredicado.U || tablaSujeto[1][1] == TipoSujetoPredicado.U) {
				bandera = false;
			}
			break;
		case 3:
			if (tablaSujeto[0][0] == TipoSujetoPredicado.U || tablaSujeto[1][0] == TipoSujetoPredicado.U) {
				bandera = false;
			}
			break;
		case 4:
			if (tablaSujeto[0][1] == TipoSujetoPredicado.U || tablaSujeto[1][0] == TipoSujetoPredicado.U) {
				bandera = false;
			}
			break;
		default:
			break;
		}

		return bandera;

	}

	public boolean validarSegundaRegla() {

		TipoSujetoPredicado[][] tablaSujeto = generarSujetoPredicado();
		Boolean bandera = false;

		switch (figura) {
		case 1:
			if ((tablaSujeto[0][1] == TipoSujetoPredicado.P && tablaSujeto[2][1] == TipoSujetoPredicado.U)
					|| (tablaSujeto[1][0] == TipoSujetoPredicado.P && tablaSujeto[2][0] == TipoSujetoPredicado.U)) {
				bandera = true;
			}
			break;
		case 2:
			if ((tablaSujeto[0][0] == TipoSujetoPredicado.P && tablaSujeto[2][1] == TipoSujetoPredicado.U)
					|| (tablaSujeto[1][0] == TipoSujetoPredicado.P && tablaSujeto[2][0] == TipoSujetoPredicado.U)) {
				bandera = true;
			}
			break;
		case 3:
			if ((tablaSujeto[0][1] == TipoSujetoPredicado.P && tablaSujeto[2][1] == TipoSujetoPredicado.U)
					|| (tablaSujeto[0][1] == TipoSujetoPredicado.P && tablaSujeto[2][0] == TipoSujetoPredicado.U)) {
				bandera = true;
			}
			break;
		case 4:
			if ((tablaSujeto[0][1] == TipoSujetoPredicado.P && tablaSujeto[2][1] == TipoSujetoPredicado.U)
					|| (tablaSujeto[1][1] == TipoSujetoPredicado.P && tablaSujeto[2][0] == TipoSujetoPredicado.U)) {
				bandera = true;
			}
			break;
		default:
			break;
		}

		return bandera;

	}

	public TipoSujetoPredicado[][] generarSujetoPredicado() {

		TipoSujetoPredicado[][] tabla = new TipoSujetoPredicado[3][2];
		TipoConector conector;

		for (int i = 0; i < tabla.length; i++) {
			conector = conectores.get(i).getTipoConector();
			if (conector.equals(TipoConector.A)) {
				tabla[i][0] = TipoSujetoPredicado.U;
				tabla[i][1] = TipoSujetoPredicado.P;
			} else if (conector.equals(TipoConector.E)) {
				tabla[i][0] = TipoSujetoPredicado.U;
				tabla[i][1] = TipoSujetoPredicado.U;
			} else if (conector.equals(TipoConector.I)) {
				tabla[i][0] = TipoSujetoPredicado.P;
				tabla[i][1] = TipoSujetoPredicado.P;
			} else if (conector.equals(TipoConector.O)) {
				tabla[i][0] = TipoSujetoPredicado.P;
				tabla[i][1] = TipoSujetoPredicado.U;
			}
		}

		return tabla;

	}

	public void generarFigura() {

		Termino[][] tabla = getMatrizTermino();

		if (tabla[0][0].tipoTermino.equals(TipoTermino.M) && tabla[0][1].tipoTermino.equals(TipoTermino.P)
				&& tabla[1][0].tipoTermino.equals(TipoTermino.S) && tabla[1][1].tipoTermino.equals(TipoTermino.M)) {
			this.figura = 1;
		} else if (tabla[0][0].tipoTermino.equals(TipoTermino.P) && tabla[0][1].tipoTermino.equals(TipoTermino.M)
				&& tabla[1][0].tipoTermino.equals(TipoTermino.S) && tabla[1][1].tipoTermino.equals(TipoTermino.M)) {
			this.figura = 2;
		} else if (tabla[0][0].tipoTermino.equals(TipoTermino.M) && tabla[0][1].tipoTermino.equals(TipoTermino.P)
				&& tabla[1][0].tipoTermino.equals(TipoTermino.M) && tabla[1][1].tipoTermino.equals(TipoTermino.S)) {
			this.figura = 3;
		} else if (tabla[0][0].tipoTermino.equals(TipoTermino.P) && tabla[0][1].tipoTermino.equals(TipoTermino.M)
				&& tabla[1][0].tipoTermino.equals(TipoTermino.M) && tabla[1][1].tipoTermino.equals(TipoTermino.S)) {
			this.figura = 4;
		}

	}

	public boolean validarPrimeraRegla(Termino[][] tabla) throws PrimeraReglaExption{

		boolean bandera = true;
		int i = cantidadTerminos(tabla);
		if (i == 3) {
			bandera = false;
		}else {
			throw new PrimeraReglaExption("No cumple la primera regla");
		}
		return bandera;
	}

	public void generarTipoTermino(Termino[][] tabla) {

		boolean voltear = false;

		if (tabla[2][0].equals(tabla[0][0])) {
			conectores.get(0).clases.get(0).setTipoTermino(TipoTermino.S);
			voltear = true;
			if (tabla[2][1].equals(tabla[1][0])) {
				conectores.get(1).clases.get(0).setTipoTermino(TipoTermino.P);
			} else if (tabla[2][1].equals(tabla[1][1])) {
				conectores.get(1).clases.get(1).setTipoTermino(TipoTermino.P);
			}
		} else if (tabla[2][0].equals(tabla[0][1])) {
			conectores.get(0).clases.get(1).setTipoTermino(TipoTermino.S);
			voltear = true;
			if (tabla[2][1].equals(tabla[1][0])) {
				conectores.get(1).clases.get(0).setTipoTermino(TipoTermino.P);
			} else if (tabla[2][1].equals(tabla[1][1])) {
				conectores.get(1).clases.get(1).setTipoTermino(TipoTermino.P);
			}
		} else if (tabla[2][1].equals(tabla[0][0])) {
			conectores.get(0).clases.get(0).setTipoTermino(TipoTermino.P);
			if (tabla[2][0].equals(tabla[1][0])) {
				conectores.get(1).clases.get(0).setTipoTermino(TipoTermino.S);
			} else if (tabla[2][0].equals(tabla[1][1])) {
				conectores.get(1).clases.get(1).setTipoTermino(TipoTermino.S);
			}
		} else if (tabla[2][1].equals(tabla[0][1])) {
			conectores.get(0).clases.get(1).setTipoTermino(TipoTermino.P);
			if (tabla[2][0].equals(tabla[1][0])) {
				conectores.get(1).clases.get(0).setTipoTermino(TipoTermino.S);
			} else if (tabla[2][0].equals(tabla[1][1])) {
				conectores.get(1).clases.get(1).setTipoTermino(TipoTermino.S);
			}
		}

		if (voltear == true) {
			ArrayList<Conector> arrayList = new ArrayList<Conector>();
			arrayList.add(conectores.get(1));
			arrayList.add(conectores.get(0));
			arrayList.add(conectores.get(2));
			conectores = arrayList;
		}

		System.out.print(conectores.toString());

	}

	public Termino[][] getMatrizTermino() {

		Termino[][] tabla = new Termino[3][2];

		tabla[0][0] = conectores.get(0).getClases().get(0);
		tabla[0][1] = conectores.get(0).getClases().get(1);
		tabla[1][0] = conectores.get(1).getClases().get(0);
		tabla[1][1] = conectores.get(1).getClases().get(1);
		tabla[2][0] = conectores.get(2).getClases().get(0);
		tabla[2][1] = conectores.get(2).getClases().get(1);
		return tabla;

	}

	public int cantidadTerminos(Termino[][] tabla) {

		ArrayList<Termino> contador = new ArrayList<Termino>();
		Termino miTermino;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				miTermino = tabla[i][j];
				if (isTermiino(contador, miTermino)) {
					contador.add(miTermino);
				}
			}
		}
		return contador.size();
	}

	public boolean validarTerceraRegla(Termino[][] tabla) throws ReglaTresExeption{

		boolean bandera = false;
		Termino[][] sinConclucion = new Termino[2][2];

		for (int i = 0; i < tabla.length - 1; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				sinConclucion[i][j] = tabla[i][j];
			}
		}

		int numero = cantidadTerminos(sinConclucion);

		if (numero == 3) {
			Termino terminoMedio = masRepetidoV2(tabla);

			if (terminoMedio.equals(tabla[2][0]) || terminoMedio.equals(tabla[2][1])) {
				bandera = true;
			}
		} else {
			throw new ReglaTresExeption("Hay menos de tres terminos en las dos primeras premisas, por favor revise");
		}

		return bandera;
	}

	public Termino masRepetido(ArrayList<Termino> listaTerminos) {
		Termino miTermino = new Termino(null);
		int contador = 0;
		for (int i = 0; i < listaTerminos.size(); i++) {
			miTermino = listaTerminos.get(i);
			for (int j = 0; j < listaTerminos.size(); j++) {
				if (miTermino.equals(listaTerminos.get(i))) {
					contador++;
				}
			}
			if (contador == 2) {
				return miTermino;
			}
			contador = 0;
		}
		return miTermino;
	}

	public Termino masRepetidoV2(Termino[][] tabla) {
		Termino miTermino = new Termino(null);

		if (tabla[0][0].equals(tabla[1][0])) {
			miTermino = tabla[0][0];
			conectores.get(0).clases.get(0).setTipoTermino(TipoTermino.M);
		} else if (tabla[0][1].equals(tabla[1][1])) {
			miTermino = tabla[0][1];
			conectores.get(0).clases.get(1).setTipoTermino(TipoTermino.M);
		} else if (tabla[0][0].equals(tabla[1][1])) {
			miTermino = tabla[0][0];
			conectores.get(0).clases.get(0).setTipoTermino(TipoTermino.M);
		} else if (tabla[0][1].equals(tabla[1][0])) {
			miTermino = tabla[0][1];
			conectores.get(0).clases.get(1).setTipoTermino(TipoTermino.M);
		} else {
			System.out.println("Uno de los dos primeros silogismos esta mal escrito.");
		}

		return miTermino;
	}

	public boolean isTermiino(ArrayList<Termino> contador, Termino miTermino) {
		for (int i = 0; i < contador.size(); i++) {
			if (contador.get(i).equals(miTermino)) {
				return false;
			}
		}
		return true;
	}
	
	public int getFigura() {
		return figura;
	}

	public void setFigura(int figura) {
		this.figura = figura;
	}

	/**
	 * @return the validez
	 */
	public ArrayList<Boolean> getValidez() {
		return validez;
	}

	/**
	 * @param validez the validez to set
	 */
	public void setValidez(ArrayList<Boolean> validez) {
		this.validez = validez;
	}

	public ArrayList<Conector> getConectores() {
		return conectores;
	}

	public void setConectores(ArrayList<Conector> conectores) {
		this.conectores = conectores;
	}

}
