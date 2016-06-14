package model;


public class Player extends Creature {
	private Skill skill;
	private int nbResurrect;
	
	
	public Player(int posx, int posy, boolean vivant, int nbResurrect) {
		super(posx, posy, vivant);
		this.nbResurrect = nbResurrect;
		
	}


	public void lancerSkillDroite(Skill skill){
		skill = new Skill(super.getPosx(),super.getPosy(), false);  // le sort part de la position du player, et quitte ses mains
		skill.setPosx(skill.getPosx() + 1);
		skill.setInHand(false);
	}
	
	public void lancerSkillGauche(Skill skill){
		skill = new Skill(super.getPosx(),super.getPosy(), false); 
		skill.setPosx(skill.getPosx() - 1);
		skill.setInHand(false);
	}
	
	public void lancerSkillHaut(Skill skill){
		skill = new Skill(super.getPosx(),super.getPosy(), false);
		skill.setPosy(skill.getPosy() - 1);
		skill.setInHand(false);
	}
	
	public void lancerSkillBas(Skill skill){
		skill = new Skill(super.getPosx(),super.getPosy(), false);
		skill.setPosy(skill.getPosy() + 1);
		skill.setInHand(false);
	}
	
	
	public void checkDead(int nbResurrect){   // on verifie que le nombre de résurrection est suffisant
		if (nbResurrect == 0){
			super.setVivant(false);
		}
	}
	
	

	
}
