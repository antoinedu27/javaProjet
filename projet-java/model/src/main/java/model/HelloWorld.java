package model;

/**
 * The Class HelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
class HelloWorld extends Entity {

	/** The id. */
	private int			id;
	
	private int posx;
	private int posy;
/*
 * le fameux hello world !!!!!
 * attendez, ca serait pas la classe de mort qui sert à rien ?
 * ah, bah si.
 * perso je lui ai pas trouvé d'utilité je crois. après tout on a une classe player.
 * 
 * 
 */
	public HelloWorld(final int id, final int posx, final int posy) {
		this.setId(id);		
		this.setPosx(posx);
		this.setPosy(posy);
		
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

	/**
	 * Instantiates a new hello world.
	 */
	public HelloWorld() {
		this(0, 0, 0);
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *          the new id
	 */
	public void setId(final int id) {
		this.id = id;

}
	
}

