package model;

/**
 * The Class Entity.
 *
 * @author Jean-Aymeric Diet
 */
abstract class Entity {
	
	private int posx;
	private int posy;
	
	/*
	 * la classe mere de toutes les entités
	 */
	
	public int getPosx() {
		return posx;
	}
	public void setPosx(int posx) {
		this.posx = posx;
	}
	public int getPosy() {
		return posy;
	}
	public void setPosy(int posy) {
		this.posy = posy;
	}

	
	
	
	
}
