package main.start;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

//Die Klasse Main erweitert die Klasse Application um JavaFX verwenden zu k�nnen
public class Main extends Application {
	//Die Methode start() wird �berschrieben und gibt eine Stage als Parameter mit
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Die main-Methode ist das, was als aller erstes ausgef�hrt wird
	public static void main(String[] args) {
		//�ber launch() wird �ber einen Umweg die start-Methode weiter oben im Code aufgerufen
		launch(args);
	}
}
