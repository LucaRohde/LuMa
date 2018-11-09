package main.view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.start.code.map.Tile;

public class TestImageController implements Initializable {

	@FXML
	ImageView imageView;

	public TestImageController() {
//		imageView = new ImageView(new Image("/Users/Azubi/git/LuMa/LuMa/src/main/resources/JavaFX.png"));

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		imageView = new ImageView(new Image("JavaFX.png"));

	}

}
