package main.start;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

//Die Klasse Main erweitert die Klasse Application um JavaFX verwenden zu können
public class Main extends Application {
	//Die Methode start() wird überschrieben und gibt eine Stage als Parameter mit
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Parent root = FXMLLoader.load(getClass().getResource("../view/TestImage.fxml"));
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Die main-Methode ist das, was als aller erstes ausgeführt wird
	public static void main(String[] args) {
		//Über launch() wird über einen Umweg die start-Methode weiter oben im Code aufgerufen
		launch(args);
	}
}
