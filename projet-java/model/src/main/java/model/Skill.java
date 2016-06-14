package model;

public class Skill extends Entity {
	
	private int posx,posy;
	private boolean inHand;
	
	
	public Skill(int posx, int posy, boolean inHand){
		this.setPosx(posx);
		this.setPosy(posy);
		this.setInHand(inHand);
	}


	public int getPosy() {
		return posy;
	}


	public void setPosy(int posy) {
		this.posy = posy;
	}


	public int getPosx() {
		return posx;
	}


	public void setPosx(int posx) {
		this.posx = posx;
	}
	


	public boolean isInHand() {
		return inHand;
	}


	public void setInHand(boolean inHand) {
		this.inHand = inHand;
	}
	
	
}

