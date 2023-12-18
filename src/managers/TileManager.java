package managers;

import static helpers.Constants.Sizes.*;
import static helpers.Constants.Tiles.*;

import java.awt.image.BufferedImage;

import java.util.ArrayList;

import helpers.LoadImage;
import helpers.Utilz;
import objects.Tile;

public class TileManager {

	public Tile GRASS, WATER, ROAD, TREE, ROCK;
	private BufferedImage atlas;
	public ArrayList<Tile> tiles = new ArrayList<>();

	public TileManager() {

		loadAtalas();
		createTiles();

	}

	private void createTiles() {

		int id = 0;
		tiles.add(GRASS = new Tile(getSprite(2, 1), id++, GRASS_TILE));
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 8, 9)), id++, OTHER_TILE));
		tiles.add(ROAD = new Tile(getSprite(5, 2), id++, ROAD_TILE));
		tiles.add(ROAD = new Tile(getSprite(5, 1), id++, ROAD_TILE));
		tiles.add(ROAD = new Tile(getSprite(6, 1), id++, ROAD_TILE));
		tiles.add(ROAD = new Tile(getSprite(7, 1), id++, ROAD_TILE));
		tiles.add(ROAD = new Tile(getSprite(7, 3), id++, ROAD_TILE));
		tiles.add(ROAD = new Tile(getSprite(5, 3), id++, ROAD_TILE));
		tiles.add(ROAD = new Tile(getSprite(2, 7), id++, ROAD_TILE));
		tiles.add(TREE = new Tile(Utilz.buildImg(getImgs(2, 1, 11, 9)), id++, GRASS_TILE));
		tiles.add(TREE = new Tile(Utilz.buildImg(getImgs(2, 1, 12, 9)), id++, GRASS_TILE));
		
		tiles.add(TREE = new Tile(Utilz.buildImg(getImgs(2, 1, 13, 6)), id++, OTHER_TILE));
		tiles.add(TREE = new Tile(Utilz.buildImg(getImgs(2, 1, 13, 7)), id++, OTHER_TILE));
		tiles.add(TREE = new Tile(Utilz.buildImg(getImgs(2, 1, 14, 6)), id++, OTHER_TILE));
		tiles.add(TREE = new Tile(Utilz.buildImg(getImgs(2, 1, 14, 7)), id++, OTHER_TILE));
		tiles.add(TREE = new Tile(Utilz.buildImg(getImgs(2, 1, 13, 9)), id++, OTHER_TILE));
		tiles.add(TREE = new Tile(Utilz.buildImg(getImgs(2, 1, 13, 10)), id++, OTHER_TILE));
		tiles.add(TREE = new Tile(Utilz.buildImg(getImgs(2, 1, 14, 9)), id++, OTHER_TILE));	
		tiles.add(TREE = new Tile(Utilz.buildImg(getImgs(2, 1, 14, 10)), id++, OTHER_TILE));
		
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 8, 11)), id++, OTHER_TILE));		
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 9, 11)), id++, OTHER_TILE));		
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 9, 12)), id++, OTHER_TILE));		
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 8, 12)), id++, OTHER_TILE));
		
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 8, 9)), id++, OTHER_TILE));
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 9, 9)), id++, OTHER_TILE));
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 10, 9)), id++, OTHER_TILE));
		
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 8, 10)), id++, OTHER_TILE));
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 9, 10)), id++, OTHER_TILE));
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 10, 10)), id++, OTHER_TILE));
		
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 7, 10)), id++, OTHER_TILE));
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 7, 11)), id++, OTHER_TILE));
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 7, 12)), id++, OTHER_TILE));
		
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 6, 10)), id++, OTHER_TILE));
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 6, 11)), id++, OTHER_TILE));
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 6, 12)), id++, OTHER_TILE));
		
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 13, 12)), id++, OTHER_TILE));
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 13, 13)), id++, OTHER_TILE));
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 14, 12)), id++, OTHER_TILE));
		tiles.add(ROCK = new Tile(Utilz.buildImg(getImgs(2, 1, 14, 13)), id++, OTHER_TILE));



	}

	private BufferedImage[] getImgs(int x1, int y1, int x2, int y2) {
		
		return new BufferedImage[] {getSprite(x1,y1), getSprite(x2,y2)};
	}
	private void loadAtalas() {

		atlas = LoadImage.getSpriteAtlas();

	}

	public Tile getTile(int id) {
		return tiles.get(id);
	}

	public BufferedImage getSprite(int id) {
		return tiles.get(id).getSprite();
	}

	private BufferedImage getSprite(int xCord, int yCord) {
		return atlas.getSubimage(xCord * TILE_SIZE, yCord * TILE_SIZE, TILE_SIZE, TILE_SIZE);
	}

}
