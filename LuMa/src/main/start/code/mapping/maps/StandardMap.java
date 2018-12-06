package main.start.code.mapping.maps;

import java.io.FileNotFoundException;

import main.start.code.mapping.Map;
import main.start.code.mapping.tiles.StandardTile;

public class StandardMap extends Map{

	public StandardMap() throws FileNotFoundException {
		super(4, 4);
		for (int i =0; i<5;i++) {
		this.addTile(i, i, new StandardTile());}
	}

}
