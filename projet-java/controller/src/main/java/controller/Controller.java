package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;
import model.Player;
public class Controller implements IController {

	/** The view. */
	private IView		view;

	/** The model. */
	private IModel	model;
	
	private Player player = new Player(0,0,true,11);
	
	
	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see contract.IController#control()
	 */
	public void control() {
		this.view.printMessage("appuyez sur la direction de votre choix.");
	}

	/**
	 * Sets the view.
	 *
	 * @param view
	 *          the new view
	 */
	private void setView(final IView view) {
		this.view = view;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
			case Up:
				 player.setPosy(player.getPosy() + 1);
				System.out.println(player.getPosy());
				break;
			case Down:
				 player.setPosy(player.getPosy() - 1);
				System.out.println(player.getPosy());
				break;
			case Left:
				 player.setPosx(player.getPosx() + 1);
				System.out.println(player.getPosx());
				break;
			case Right:
				 player.setPosx(player.getPosx() + 1);
				System.out.println(player.getPosx());
				break;
			case Skill:
				 player.lancerSkillDroite(null);
			default:
				break;
		}
	}

}
