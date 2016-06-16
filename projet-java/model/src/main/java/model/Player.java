package model;


public class Player extends Creature {
	private Skill skill; // on crée un sort ( ca devrait etre spell)
	private int nbResurrect;
	/*
	 * comme la fonction player descend de creature et creature de entité,
	 * player descend de entité. me la cassez pas celle la, c est la plus importante.
	 * 
	 */
	
	public Player(int posx, int posy, boolean vivant, int nbResurrect) {
		super(posx, posy, vivant);
		this.nbResurrect = nbResurrect;
		
	}


	public void lancerSkillDroite(Skill skill){ // la fonction qui lance les sorts. 
		if (skill.isInHand() == true){ //(si il a son sort, il peut le lancer)
		skill = new Skill(super.getPosx(),super.getPosy(), true);  // le sort part de la position du player, et quitte ses mains
		for (int i = 0; i < 10; i++){
		skill.setPosx(skill.getPosx() + 1);
		skill.setInHand(false);
		}
		}
	}
	
	public void lancerSkillGauche(Skill skill){
		if (skill.isInHand() == true){
		skill = new Skill(super.getPosx(),super.getPosy(), false); 
		skill.setPosx(skill.getPosx() - 1);
		skill.setInHand(false);
		}
	}
	
	public void lancerSkillHaut(Skill skill){
		if (skill.isInHand() == true){
		skill = new Skill(super.getPosx(),super.getPosy(), false);
		skill.setPosy(skill.getPosy() - 1);
		skill.setInHand(false);
		}
	}
	
	public void lancerSkillBas(Skill skill){
		if (skill.isInHand() == true){
		skill = new Skill(super.getPosx(),super.getPosy(), false);
		skill.setPosy(skill.getPosy() + 1);
		skill.setInHand(false);
		}
	}
	
	
	public void checkDead(int nbResurrect){   // on verifie que le nombre de résurrection est suffisant
		if (nbResurrect == 0){
			super.setVivant(false);
		}
	}
	
	

	
}
