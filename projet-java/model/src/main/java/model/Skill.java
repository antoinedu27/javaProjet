package model;

public class Skill extends Entity {
	
	private boolean inHand;
	
	
	public Skill(int posx, int posy, boolean inHand){
		super.setPosx(posx);
		super.setPosy(posy);
		this.setInHand(inHand);
	}
	


	public boolean isInHand() {
		return inHand;
	}


	public void setInHand(boolean inHand) {
		this.inHand = inHand;
	}
	
	
}

