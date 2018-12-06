package main.start.code.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.image.Image;

public class Tile extends Image{
//Einfaches Tile
	
	static String path = "../../../../resources/";
	public Tile(String typeOfTile) throws FileNotFoundException {
		super(new FileInputStream(path+typeOfTile+".png"));
		
		
	}

}
