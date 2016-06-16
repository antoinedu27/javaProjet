package controller;

import java.sql.SQLException;

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
	
	private Player player ;
	 /* ici on instancie un objet player. 
	  * en gros on crée un joueur
	  * ( je rappelle que le joueur prend en parametre 
	  * (int,int,bool,int), soit (position x, position y,
	  *  vivant ou mort, et nb resureections restantes.)
	
	
	*/
	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 * @throws SQLException 
	 */
	public Controller(final IView view, final IModel model) throws SQLException {
		this.setView(view);
		this.setModel(model);
		this.player.setPosx(view.recupPosx());
		 // le contrôleur commande à la vue de récupérer la position x du joueur
		 
		this.player.setPosy(view.recupPosy());
		
		/* ici il faudra ajouter de la même mannière que la recupPos
		 * une recupVivant et une recupResurtionsRestantes.
		 */
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see contract.IController#control()
	 */
	public void control() {
		this.view.printMessage("appuyez sur la verrue de votre voisin");
		/*
		 * cette fonction là je m'en sert pas, si vous lui trouvez
		 * une utilité allez y.
		 */
		
	}

	/**
	 * Sets the view.
	 *
	 * @param view
	 *          the new view
	 */
	private void setView(final IView view) {
		this.view = view;
		/*
		 * setters d'attributs, rien de plus basique
		 */
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
			case Up: // si l'utilisateur a appuyé sur up :
				 player.setPosy(player.getPosy() - 1); 
				 //la position du joueur est modifiée d'une case(il faudra probablement remplacer par 32
				 this.model.loadPosition(player.getPosx(), player.getPosy());
				 //le controller dit au model de se mettre à jour.
				 // c'est la meme chose pour les autres touches evidemment.
				break;
			case Down:
				 player.setPosy(player.getPosy() + 1);
				 this.model.loadPosition(player.getPosx(), player.getPosy());
				break;
			case Left:
				 player.setPosx(player.getPosx() - 1);
				 this.model.loadPosition(player.getPosx(), player.getPosy());
				break;
			case Right:
				 player.setPosx(player.getPosx() + 1);
				 this.model.loadPosition(player.getPosx(), player.getPosy());
				break;
			case Skill:
				 player.lancerSkillDroite(null);
			default:
				break;
		}
	}

}
