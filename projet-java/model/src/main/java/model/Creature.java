package model;

public class Creature extends Entity {
	
	boolean vivant;
	
	
	
	public Creature(int posx, int posy, boolean vivant){
		super.setPosx(posx);
		super.setPosy(posy);
		setVivant(vivant);
	}
	

	public boolean isVivant() {
		return vivant;
	}
	public void setVivant(boolean vivant) {
		this.vivant = vivant;
	}
	

}
