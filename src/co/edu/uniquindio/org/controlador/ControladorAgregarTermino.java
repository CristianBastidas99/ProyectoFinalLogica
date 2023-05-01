package co.edu.uniquindio.org.controlador;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControladorAgregarTermino {

	private ControladorEscenarios controladorEscenarios;

	@FXML
	private TextField txtNombre;
	
	@FXML
	void volver() {
		controladorEscenarios.cargarAgregarSilogismo();
	}

	@FXML
	void agregar() {
		if (!txtNombre.getText().isEmpty()) {
			controladorEscenarios.agregarTermino(txtNombre.getText());
		} else {
			JOptionPane.showMessageDialog(null, "Rellene el campo primero");
		}
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

}
