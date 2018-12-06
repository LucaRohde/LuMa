package main.start.code.mapping;

public abstract class Map {

	private int numberOfTilesVerticaly,numberOfTilesHorizontaly;
	//x,y
	private Tile[][] tiles;
	public Map(int numberOfTilesVerticaly, int numberOfTilesHorizontaly) {
		
		this.numberOfTilesHorizontaly=numberOfTilesHorizontaly;
		this.numberOfTilesVerticaly=numberOfTilesVerticaly;
		tiles = new Tile[numberOfTilesHorizontaly][numberOfTilesVerticaly];		

	}
	//Puts in a tile at the targeted location in the 2D Array
	public void addTile(int destinationVerticaly, int destinationHorizonaly, Tile tile) {
		
		tiles[destinationHorizonaly][destinationVerticaly]=tile;	
		
		
				}
	public Tile getSpecificTile(int destinationVerticaly, int destinationHorizonaly) {
		
		return tiles[destinationHorizonaly][destinationVerticaly];
	}
	
	public Tile[][] getTileArray(){
		return tiles;
	}
	public int getNumberOfTilesVerticaly() {
		return numberOfTilesVerticaly;
	}
	public void setNumberOfTilesVerticaly(int numberOfTilesVerticaly) {
		this.numberOfTilesVerticaly = numberOfTilesVerticaly;
	}
	public int getNumberOfTilesHorizontaly() {
		return numberOfTilesHorizontaly;
	}
	public void setNumberOfTilesHorizontaly(int numberOfTilesHorizontaly) {
		this.numberOfTilesHorizontaly = numberOfTilesHorizontaly;
	}
	
}
