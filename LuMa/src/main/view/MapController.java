package main.view;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import main.start.code.mapping.Map;
import main.start.code.mapping.maps.StandardMap;

public class MapController  implements Initializable{
	
	@FXML
	BorderPane borderPane;
	
	
	GridPane gridPane;

	
	
	Map map;
	
	public MapController() throws FileNotFoundException {
		map = new StandardMap();
		gridPane= new GridPane();
		borderPane =new BorderPane();
//		gridPane.setMinSize(map.getNumberOfTilesHorizontaly(), map.getNumberOfTilesVerticaly());
//		
//		gridPane.setMaxSize(map.getNumberOfTilesHorizontaly(), map.getNumberOfTilesVerticaly());
		for(int i =0; i<4;i++) {
		ImageView child =new ImageView(map.getSpecificTile(i, i));
		gridPane.add(child, i, i);}
		borderPane.getChildren().add(gridPane);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

}
