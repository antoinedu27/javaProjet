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

	/*
	 *la classe que vous attendiez tous !
	 *celle qui est pleine de fonctions qu'on ne sait pas manipuler 
	 * # check my pattern observer.
	 * il faut rien supprimer, on fera du tri si necessaire
	 * 
	 */
	
	public Model() {
		this.message = "";
	}

	public String getMessage() {
		return this.message;
	}
	
	public void setPosition(int posx, int posy){
		this.setChanged(); // voila une belle fonction toute faite que j'appelle jamais.
		this.notifyObservers();
	}


	public void loadPosition(int posx, int posy) {// ah en voila une fonction qu'elle est belle !
		//c'est normal, je l'ai en partie codée.
		try {
			final DAOHelloWorld daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
			daoHelloWorld.majPosx(posx);// de la meme façon que la vue recupere les données, le model se met a jour
			daoHelloWorld.majPosy(posy);// n'oublions pas que c est le controleur qui appelle
			// on envoie les nouvelles cooordonnées du player
			
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
