package co.edu.uniquindio.org.controlador;

import java.io.IOException;


import co.edu.uniquindio.org.aplicacion.MainApp;
import co.edu.uniquindio.org.clases.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ControladorEscenarios {

	private Stage stagePrincipla;
	private BorderPane borderPane;
	private Main miMain;

	public ControladorEscenarios(Stage stage) {
		this.stagePrincipla = stage;
		this.miMain = new Main();
		cargarPrincipal();

	}

	public void cargarPrincipal() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/vista/Principal.fxml"));
			borderPane = (BorderPane) loader.load();
			// Show the scene containing the root layout.
			Scene scene = new Scene(borderPane);
			stagePrincipla.setScene(scene);
			stagePrincipla.show();
			cargarAgregarSilogismo();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void cargarAgregarSilogismo() {
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/vista/AgregarSilogismo.fxml"));

			AnchorPane personOverview = (AnchorPane) loader.load();

			ControladorAgregarSilogismo c = loader.getController();
			c.init(listaTerminos(), this);

			// Set person overview into the center of root layout.
			borderPane.setCenter(personOverview);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void cargarAgregarTermino() {
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("/vista/AgregarTermino.fxml"));
			AnchorPane personOverview = (AnchorPane) loader.load();

			// Set person overview into the center of root layout.
			borderPane.setCenter(personOverview);

			ControladorAgregarTermino c = loader.getController();
			c.setControladorEscenarios(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void cargarValidezVenn() {
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("/vista/ValidezVenn.fxml"));
			AnchorPane personOverview = (AnchorPane) loader.load();

			// Set person overview into the center of root layout.
			borderPane.setCenter(personOverview);

			ControladorValidezVenn c = loader.getController();
			c.init(miMain.getMiSilogismo(), this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void agregarTermino(String nombre) {
		miMain.agragarTermino(nombre);
	}

	public ObservableList<String> listaTerminos() {
		ObservableList<String> items = FXCollections.observableArrayList();

		for (int i = 0; i < miMain.getMisTerminos().size(); i++) {
			items.add(miMain.getMisTerminos().get(i).toString());
		}
		return items;
	}

	public void crearSilogismo(int conector1, int conector2, int conector3, int termino1, int termino2, int termino3,
			int termino4, int termino5, int termino6) {
		miMain.crearSilogismo(conector1, conector2, conector3, termino1, termino2, termino3, termino4, termino5, termino6);
	}

}
