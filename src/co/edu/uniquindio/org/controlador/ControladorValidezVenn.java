/**
 * Sample Skeleton for 'ValidezVenn.fxml' Controller Class
 */

package co.edu.uniquindio.org.controlador;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


import co.edu.uniquindio.org.clases.Conector;
import co.edu.uniquindio.org.clases.Silogismo;
import co.edu.uniquindio.org.clases.Termino;
import co.edu.uniquindio.org.clases.TipoConector;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class ControladorValidezVenn {

	private ControladorEscenarios controladorEscenarios;

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="A"
	private Rectangle A; // Value injected by FXMLLoader

	@FXML // fx:id="AB"
	private Rectangle AB; // Value injected by FXMLLoader

	@FXML // fx:id="ABC"
	private Rectangle ABC; // Value injected by FXMLLoader

	@FXML // fx:id="AC"
	private Rectangle AC; // Value injected by FXMLLoader

	@FXML // fx:id="B"
	private Rectangle B; // Value injected by FXMLLoader

	@FXML // fx:id="BC"
	private Rectangle BC; // Value injected by FXMLLoader

	@FXML // fx:id="C"
	private Rectangle C; // Value injected by FXMLLoader

	@FXML // fx:id="Figura"
	private Label Figura; // Value injected by FXMLLoader

	@FXML // fx:id="Modo"
	private Label Modo; // Value injected by FXMLLoader

	@FXML // fx:id="ReglaCinco"
	private Label ReglaCinco; // Value injected by FXMLLoader

	@FXML // fx:id="ReglaCuatro"
	private Label ReglaCuatro; // Value injected by FXMLLoader

	@FXML // fx:id="ReglaCuatro_1"
	private Label ReglaCuatro_1; // Value injected by FXMLLoader

	@FXML // fx:id="ReglaDos"
	private Label ReglaDos; // Value injected by FXMLLoader

	@FXML // fx:id="ReglaOcho"
	private Label ReglaOcho; // Value injected by FXMLLoader

	@FXML // fx:id="ReglaSeis"
	private Label ReglaSeis; // Value injected by FXMLLoader

	@FXML // fx:id="ReglaSiete"
	private Label ReglaSiete; // Value injected by FXMLLoader

	@FXML // fx:id="ReglaSiete_1"
	private Label ReglaSiete_1; // Value injected by FXMLLoader

	@FXML // fx:id="ReglaTres"
	private Label ReglaTres; // Value injected by FXMLLoader

	@FXML // fx:id="ReglaTres_1"
	private Label ReglaTres_1; // Value injected by FXMLLoader

	@FXML // fx:id="ReglaUno"
	private Label ReglaUno; // Value injected by FXMLLoader

	@FXML // fx:id="TerminoA"
	private Label TerminoA; // Value injected by FXMLLoader

	@FXML // fx:id="TerminoB"
	private Label TerminoB; // Value injected by FXMLLoader

	@FXML // fx:id="TerminoC"
	private Label TerminoC; // Value injected by FXMLLoader

	@FXML // fx:id="XA"
	private Label XA; // Value injected by FXMLLoader

	@FXML // fx:id="XAB"
	private Label XAB; // Value injected by FXMLLoader

	@FXML // fx:id="XAC"
	private Label XAC; // Value injected by FXMLLoader

	@FXML // fx:id="XB"
	private Label XB; // Value injected by FXMLLoader

	@FXML // fx:id="XBC"
	private Label XBC; // Value injected by FXMLLoader

	@FXML // fx:id="XC"
	private Label XC; // Value injected by FXMLLoader

	@FXML // fx:id="validez"
	private Label validez; // Value injected by FXMLLoader

	@FXML
	void volver(ActionEvent event) {
		controladorEscenarios.cargarAgregarSilogismo();
	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert A != null : "fx:id=\"A\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert AB != null : "fx:id=\"AB\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert ABC != null : "fx:id=\"ABC\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert AC != null : "fx:id=\"AC\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert B != null : "fx:id=\"B\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert BC != null : "fx:id=\"BC\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert C != null : "fx:id=\"C\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert Figura != null : "fx:id=\"Figura\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert Modo != null : "fx:id=\"Modo\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert ReglaCinco != null : "fx:id=\"ReglaCinco\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert ReglaCuatro != null : "fx:id=\"ReglaCuatro\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert ReglaCuatro_1 != null
				: "fx:id=\"ReglaCuatro_1\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert ReglaDos != null : "fx:id=\"ReglaDos\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert ReglaOcho != null : "fx:id=\"ReglaOcho\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert ReglaSeis != null : "fx:id=\"ReglaSeis\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert ReglaSiete != null : "fx:id=\"ReglaSiete\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert ReglaSiete_1 != null
				: "fx:id=\"ReglaSiete_1\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert ReglaTres != null : "fx:id=\"ReglaTres\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert ReglaTres_1 != null : "fx:id=\"ReglaTres_1\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert ReglaUno != null : "fx:id=\"ReglaUno\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert TerminoA != null : "fx:id=\"TerminoA\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert TerminoB != null : "fx:id=\"TerminoB\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert TerminoC != null : "fx:id=\"TerminoC\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert XA != null : "fx:id=\"XA\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert XAB != null : "fx:id=\"XAB\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert XAC != null : "fx:id=\"XAC\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert XB != null : "fx:id=\"XB\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert XBC != null : "fx:id=\"XBC\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert XC != null : "fx:id=\"XC\" was not injected: check your FXML file 'ValidezVenn.fxml'.";
		assert validez != null : "fx:id=\"validez\" was not injected: check your FXML file 'ValidezVenn.fxml'.";

	}

	/**
	 * @return the controladorEscenarios
	 */
	public ControladorEscenarios getControladorEscenarios() {
		return controladorEscenarios;
	}

	/**
	 * @param controladorEscenarios the controladorEscenarios to set
	 */
	public void setControladorEscenarios(ControladorEscenarios controladorEscenarios) {
		this.controladorEscenarios = controladorEscenarios;
	}

	public void init(Silogismo miSilogismo, ControladorEscenarios controladorEscenarios2) {
		// TODO Auto-generated method stub
		controladorEscenarios = controladorEscenarios2;

		Figura.setText(miSilogismo.getFigura() + "");

		String modo = miSilogismo.getConectores().get(0).getTipoConector().toString();
		modo += miSilogismo.getConectores().get(1).getTipoConector().toString();
		modo += miSilogismo.getConectores().get(2).getTipoConector().toString();
		Modo.setText(modo);
		
		colorearValidez(miSilogismo.getValidez());
		
		colorearVenn(miSilogismo.getConectores());
		
		darNombre(miSilogismo.getFigura(), miSilogismo.getConectores());
		
		boolean validez = false;
		for (int i = 0; i < miSilogismo.getValidez().size(); i++) {
			validez = validez || miSilogismo.getValidez().get(i);
		}
		
		if(validez) {
			this.validez.setText("NO VALIDO");
		}else {
			this.validez.setText("VALIDO");
		}

	}

	public void colorearValidez(ArrayList<Boolean> validez) {

		if (validez.get(0) == true) {
			ReglaUno.setTextFill(Paint.valueOf("#b92d1d"));
		}
		if (validez.get(1) == true) {
			ReglaDos.setTextFill(Paint.valueOf("#b92d1d"));
		}
		if (validez.get(2) == true) {
			ReglaTres.setTextFill(Paint.valueOf("#b92d1d"));
			ReglaTres_1.setTextFill(Paint.valueOf("#b92d1d"));
		}
		if (validez.get(3) == true) {
			ReglaCuatro.setTextFill(Paint.valueOf("#b92d1d"));
			ReglaCuatro_1.setTextFill(Paint.valueOf("#b92d1d"));
		}
		if (validez.get(4) == true) {
			ReglaCinco.setTextFill(Paint.valueOf("#b92d1d"));
		}
		if (validez.get(5) == true) {
			ReglaSeis.setTextFill(Paint.valueOf("#b92d1d"));
		}
		if (validez.get(6) == true) {
			ReglaSiete.setTextFill(Paint.valueOf("#b92d1d"));
			ReglaSiete_1.setTextFill(Paint.valueOf("#b92d1d"));
		}
		if (validez.get(7) == true) {
			ReglaOcho.setTextFill(Paint.valueOf("#b92d1d"));
		}

	}

	public void darNombre(int figura, ArrayList<Conector> conectors) {

		TerminoA.setText(conectors.get(2).getClases().get(0).getNombre());
		TerminoB.setText(conectors.get(2).getClases().get(1).getNombre());

		switch (figura) {
		case 1:
			TerminoC.setText(conectors.get(0).getClases().get(0).getNombre());
			break;
		case 2:
			TerminoC.setText(conectors.get(0).getClases().get(1).getNombre());
			break;
		case 3:
			TerminoC.setText(conectors.get(0).getClases().get(0).getNombre());
			break;
		case 4:
			TerminoC.setText(conectors.get(0).getClases().get(1).getNombre());
			break;

		default:
			break;
		}

	}

	public void colorearVenn(ArrayList<Conector> conectores) {

		TipoConector tipoConector = conectores.get(0).getTipoConector();
		int termino = terminoVenn(conectores.get(0).getClases().get(0));

		switch (termino) {
		case 3:
			switch (tipoConector.toString()) {
			case "A":
				C.setFill(Paint.valueOf("#ffff4d"));
				AC.setFill(Paint.valueOf("#ffff4d"));
				break;
			case "E":
				BC.setFill(Paint.valueOf("#ffff4d"));
				ABC.setFill(Paint.valueOf("#ffff4d"));
				break;
			case "I":
				XBC.setVisible(true);
				break;
			case "O":
				XC.setVisible(true);
				break;

			default:
				break;
			}
			break;
		case 2:
			switch (tipoConector.toString()) {
			case "A":
				B.setFill(Paint.valueOf("#ffff4d"));
				AB.setFill(Paint.valueOf("#ffff4d"));
				break;
			case "E":
				BC.setFill(Paint.valueOf("#ffff4d"));
				ABC.setFill(Paint.valueOf("#ffff4d"));
				break;
			case "I":
				XBC.setVisible(true);
				break;
			case "O":
				XB.setVisible(true);
				break;

			default:
				break;
			}
			break;
		default:
			break;
		}

		tipoConector = conectores.get(1).getTipoConector();
		termino = terminoVenn(conectores.get(1).getClases().get(0));

		switch (termino) {
		case 3:
			switch (tipoConector.toString()) {
			case "A":
				C.setFill(Paint.valueOf("#ffff4d"));
				BC.setFill(Paint.valueOf("#ffff4d"));
				break;
			case "E":
				AC.setFill(Paint.valueOf("#ffff4d"));
				ABC.setFill(Paint.valueOf("#ffff4d"));
				break;
			case "I":
				XAC.setVisible(true);
				break;
			case "O":
				XC.setVisible(true);
				break;

			default:
				break;
			}
			break;
		case 1:
			switch (tipoConector.toString()) {
			case "A":
				A.setFill(Paint.valueOf("#ffff4d"));
				AB.setFill(Paint.valueOf("#ffff4d"));
				break;
			case "E":
				AC.setFill(Paint.valueOf("#ffff4d"));
				ABC.setFill(Paint.valueOf("#ffff4d"));
				break;
			case "I":
				XAC.setVisible(true);
				break;
			case "O":
				XA.setVisible(true);
				break;

			default:
				break;
			}
			break;
		default:
			break;
		}

		tipoConector = conectores.get(2).getTipoConector();

		switch (tipoConector.toString()) {
		case "A":
			A.setFill(Paint.valueOf("#ff6e79"));
			AC.setFill(Paint.valueOf("#ff6e79"));
			break;
		case "E":
			AB.setFill(Paint.valueOf("#ff6e79"));
			ABC.setFill(Paint.valueOf("#ff6e79"));
			break;
		case "I":
			XAB.setVisible(true);
			break;
		case "O":
			XA.setVisible(true);
			break;

		default:
			break;
		}

	}

	private int terminoVenn(Termino termino) {
		// TODO Auto-generated method stub
		int salida = 0;

		switch (termino.getTipoTermino().toString()) {
		case "S":
			salida = 1;
			break;
		case "P":
			salida = 2;
			break;
		case "M":
			salida = 3;
			break;
		default:
			break;
		}

		return salida;
	}

}
