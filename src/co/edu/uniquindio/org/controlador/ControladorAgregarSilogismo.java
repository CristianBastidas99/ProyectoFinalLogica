/**
 * Sample Skeleton for 'AgregarSilogismo.fxml' Controller Class
 */

package co.edu.uniquindio.org.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class ControladorAgregarSilogismo {

	private ObservableList<String> items;

	private ControladorEscenarios controladorEscenarios;

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="cbxConector1"
	private ComboBox<String> cbxConector1; // Value injected by FXMLLoader

	@FXML // fx:id="cbxConector2"
	private ComboBox<String> cbxConector2; // Value injected by FXMLLoader

	@FXML // fx:id="cbxConector3"
	private ComboBox<String> cbxConector3; // Value injected by FXMLLoader

	@FXML // fx:id="cbxTermino1"
	private ComboBox<String> cbxTermino1; // Value injected by FXMLLoader

	@FXML // fx:id="cbxTermino2"
	private ComboBox<String> cbxTermino2; // Value injected by FXMLLoader

	@FXML // fx:id="cbxTermino3"
	private ComboBox<String> cbxTermino3; // Value injected by FXMLLoader

	@FXML // fx:id="cbxTermino4"
	private ComboBox<String> cbxTermino4; // Value injected by FXMLLoader

	@FXML // fx:id="cbxTermino5"
	private ComboBox<String> cbxTermino5; // Value injected by FXMLLoader

	@FXML // fx:id="cbxTermino6"
	private ComboBox<String> cbxTermino6; // Value injected by FXMLLoader

	@FXML
	void agregarTermino(ActionEvent event) {
		controladorEscenarios.cargarAgregarTermino();
	}

	@FXML
	void validar(ActionEvent event) {
		if(isVacio()) {
			
			int conector1 = cbxConector1.getSelectionModel().getSelectedIndex();
			int conector2 = cbxConector2.getSelectionModel().getSelectedIndex();
			int conector3 = cbxConector3.getSelectionModel().getSelectedIndex();
			int termino1 = cbxTermino1.getSelectionModel().getSelectedIndex();
			int termino2 = cbxTermino2.getSelectionModel().getSelectedIndex();
			int termino3 = cbxTermino3.getSelectionModel().getSelectedIndex();
			int termino4 = cbxTermino4.getSelectionModel().getSelectedIndex();
			int termino5 = cbxTermino5.getSelectionModel().getSelectedIndex();
			int termino6 = cbxTermino6.getSelectionModel().getSelectedIndex();
			controladorEscenarios.crearSilogismo(conector1, conector2, conector3, termino1, termino2, termino3, termino4, termino5, termino6);			
			
			controladorEscenarios.cargarValidezVenn();
			
		}else {
			JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
		}
	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert cbxConector1 != null
				: "fx:id=\"cbxConector1\" was not injected: check your FXML file 'AgregarSilogismo.fxml'.";
		assert cbxConector2 != null
				: "fx:id=\"cbxConector2\" was not injected: check your FXML file 'AgregarSilogismo.fxml'.";
		assert cbxConector3 != null
				: "fx:id=\"cbxConector3\" was not injected: check your FXML file 'AgregarSilogismo.fxml'.";
		assert cbxTermino1 != null
				: "fx:id=\"cbxTermino1\" was not injected: check your FXML file 'AgregarSilogismo.fxml'.";
		assert cbxTermino2 != null
				: "fx:id=\"cbxTermino2\" was not injected: check your FXML file 'AgregarSilogismo.fxml'.";
		assert cbxTermino3 != null
				: "fx:id=\"cbxTermino3\" was not injected: check your FXML file 'AgregarSilogismo.fxml'.";
		assert cbxTermino4 != null
				: "fx:id=\"cbxTermino4\" was not injected: check your FXML file 'AgregarSilogismo.fxml'.";
		assert cbxTermino5 != null
				: "fx:id=\"cbxTermino5\" was not injected: check your FXML file 'AgregarSilogismo.fxml'.";
		assert cbxTermino6 != null
				: "fx:id=\"cbxTermino6\" was not injected: check your FXML file 'AgregarSilogismo.fxml'.";

	}

	public void init(ObservableList<String> listaTerminos, ControladorEscenarios controladorEscenarios2) {
		// TODO Auto-generated method stub

		this.controladorEscenarios = controladorEscenarios2;
		this.items = listaTerminos;
		cbxTermino1.setItems(items);
		cbxTermino2.setItems(items);
		cbxTermino3.setItems(items);
		cbxTermino4.setItems(items);
		cbxTermino5.setItems(items);
		cbxTermino6.setItems(items);

		ObservableList<String> listaConectores = FXCollections.observableArrayList();
		listaConectores.add("Todo es:");
		listaConectores.add("Ninguno es:");
		listaConectores.add("Algun es:");
		listaConectores.add("Algun no es:");

		cbxConector1.setItems(listaConectores);
		cbxConector2.setItems(listaConectores);
		cbxConector3.setItems(listaConectores);

	}

	public boolean isVacio() {
		boolean bandera = true;

		if (cbxConector1.getSelectionModel().getSelectedIndex() == -1
				|| cbxConector2.getSelectionModel().getSelectedIndex() == -1
				|| cbxConector3.getSelectionModel().getSelectedIndex() == -1
				|| cbxTermino1.getSelectionModel().getSelectedIndex() == -1
				|| cbxTermino2.getSelectionModel().getSelectedIndex() == -1
				|| cbxTermino3.getSelectionModel().getSelectedIndex() == -1
				|| cbxTermino4.getSelectionModel().getSelectedIndex() == -1
				|| cbxTermino5.getSelectionModel().getSelectedIndex() == -1
				|| cbxTermino6.getSelectionModel().getSelectedIndex() == -1) {
			bandera = false;
		}

		return bandera;
	}

}
