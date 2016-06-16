package view;

import java.awt.event.KeyEvent;
import java.sql.SQLException;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;
import model.Creature;
import model.DAOHelloWorld;
import model.DBConnection;
import model.Player;

/**
 * The Class View.
 *
 * @author Jean-Aymeric Diet
 */
public class View implements IView, Runnable {

	/** The frame. */
	private final ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/**
	 * Key code to controller order.
	 *
	 * @param keyCode
	 *          the key code
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_UP: // si l'user appuie sur up, on va chercher up, normal.
				return ControllerOrder.Up;
			case KeyEvent.VK_DOWN:
				return ControllerOrder.Down;
			case KeyEvent.VK_LEFT:
				return ControllerOrder.Left;
			case KeyEvent.VK_RIGHT:
				return ControllerOrder.Right;
			case KeyEvent.VK_SPACE:
				return ControllerOrder.Skill;
			default:
				return ControllerOrder.Up;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IView#printMessage(java.lang.String)
	 */
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}
	

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		this.viewFrame.setVisible(true);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}
	
	public int recupPosx() throws SQLException{
		final DAOHelloWorld daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
		return daoHelloWorld.recupPosx();
		/*
		 * j'ai laissé dao hello world pour la classe bdd car ca sert
		 * a rien de changer. on appelle la méthode recupposx
		 * de l'objet instancié qui va directement chercher 
		 * dans la bdd.
		 */
		
	}

	public int recupPosy() throws SQLException {
		final DAOHelloWorld daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
		return daoHelloWorld.recupPosy();
	}
		
	
	

}
