package main.start.code.mapping;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.image.Image;

public abstract class Tile extends Image{
//Einfaches Tile
	
	static String path = ".\\src\\main\\resources\\";
	public Tile(String typeOfTile) throws FileNotFoundException {
		super(new FileInputStream(path+typeOfTile+".png"));
		
		
	}

}
