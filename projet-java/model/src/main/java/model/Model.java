package model;

import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable implements IModel {

	/** The message. */
	private String message;
	private Player player;

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.message = "";
		this.player = new Player(0,0,true,13);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */
	public String getMessage() {
		return this.message;
	}
	
	public Player getPosition(){
		return player;
	}
	public void setPosition(int posx, int posy){
		this.setChanged();
		this.notifyObservers();
	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *          the new message
	 */
	/*private void setMessage(final String message) {
		this.message = message;
		this.setChanged();
		this.notifyObservers();
	}
*/
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
	public void loadPosition(int posx, int posy) {
		try {
			final DAOHelloWorld daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
			daoHelloWorld.majPosx(posx);
			daoHelloWorld.majPosy(posy);
		//	this.setMessage(daoHelloWorld.find(key).getMessage());
		//	this.setPosition(daoHelloWorld.find(posx));
		//	this.setPosition(daoHelloWorld.find(posy));
			
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}

}
