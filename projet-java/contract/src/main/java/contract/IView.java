package contract;

import java.sql.SQLException;

/**
 * The Interface IView.
 *
 * @author Jean-Aymeric Diet
 */
public interface IView {

	/**
	 * Prints the message.
	 *
	 * @param message
	 *          the message
	 */
	void printMessage(final String message);

	int recupPosx()throws SQLException;

	int recupPosy()throws SQLException;

	
	
	
	
	
}
