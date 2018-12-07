package main.start.code.mapping.maps;

import java.io.FileNotFoundException;

import main.start.code.mapping.Map;
import main.start.code.mapping.tiles.StandardTile;

public class StandardMap extends Map{

	public StandardMap() throws FileNotFoundException {
		super(2, 2);
		for (int i =0; i<2;i++) {
		this.addTile(i, i, new StandardTile());}
	}

}
