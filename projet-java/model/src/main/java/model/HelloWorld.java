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

	/** The key. */
//	private String	key;

	/** The message. */
//	private String	message;

	/**
	 * Instantiates a new hello world.
	 *
	 * @param id
	 *          the id
	 * @param key
	 *          the key
	 * @param message
	 *          the message
	 */
	public HelloWorld(final int id, final int posx, final int posy) {
		this.setId(id);
	//	this.setKey(key);
	//	this.setMessage(message);
		
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

	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	/*public String getKey() {
		return this.key;
	}*/

	/**
	 * Sets the key.
	 *
	 * @param key
	 *          the new key
	 */
/*	public void setKey(final String key) {
		this.key = key;
	}*/

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	/*public String getMessage() {
		return this.message;
	}*/

	/**
	 * Sets the message.
	 *
	 * @param message
	 *          the new message
	 */
	/*public void setMessage(final String message) {
		this.message = message;
		}*/
	

}

