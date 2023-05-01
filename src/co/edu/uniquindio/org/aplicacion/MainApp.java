package co.edu.uniquindio.org.aplicacion;

import co.edu.uniquindio.org.controlador.ControladorEscenarios;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage)  {
		// TODO Auto-generated method stub
		new ControladorEscenarios(primaryStage);
	}

}