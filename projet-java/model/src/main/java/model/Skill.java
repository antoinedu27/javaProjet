package model;

public class Skill extends Entity {
	
	private boolean inHand;
	
	// un petit sort avec tout ça...
	
	
	public Skill(int posx, int posy, boolean inHand){
		super.setPosx(posx);
		super.setPosy(posy);
		this.setInHand(inHand); // faut bien qu'on sache si il l'a dans les  mains...
	}
	


	public boolean isInHand() {
		return inHand;
	}


	public void setInHand(boolean inHand) {
		this.inHand = inHand;
	}
	
	
}

