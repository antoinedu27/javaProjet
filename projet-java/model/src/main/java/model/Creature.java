package model;

public class Creature extends Entity {
	
	private int posx , posy;
	boolean vivant;
	
	
	
	public Creature(int posx, int posy, boolean vivant){
		setPosx(posx);
		setPosy(posy);
		setVivant(vivant);
		
	}
	
	
	public void motionDroite(int posx){
		setPosx(posx + 1);
		System.out.println("droite");
	}
	public void motionGauche(int posx){
		setPosx(posx - 1);
		System.out.println("gauche");
	}
	public void motionBas(int posy){
		setPosy(posy + 1);
		System.out.println("bas");
	}
	public void motionHaut(int posy){
		setPosy(posy - 1);
		System.out.println("haut");
	}


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
	public boolean isVivant() {
		return vivant;
	}
	public void setVivant(boolean vivant) {
		this.vivant = vivant;
	}
	

}
