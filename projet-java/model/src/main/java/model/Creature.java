package model;

public class Creature extends Entity {
	
	boolean vivant;
	
	/*
	 * comme vous le savez, une creature est une entité.
	 * elle recupere donc des attributs d'entité.(posx,posy));
	 * ce que cette classe a de plus, c est le bool vivant.
	 */
	
	
	public Creature(int posx, int posy, boolean vivant){
		super.setPosx(posx);
		super.setPosy(posy);
		setVivant(vivant);
		/* un onstructeur, rien de plus banal.
		 * siuvenez vous, super sert a recuperer les données de la classe mere.
		 * en l'occurrence, entity.
		 */
	
	}
	

	public boolean isVivant() {// un getter booléen
		return vivant;
	}
	public void setVivant(boolean vivant) {
		this.vivant = vivant;
	}
	

}

