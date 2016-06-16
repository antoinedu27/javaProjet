package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The Class DAOHelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
public class DAOHelloWorld extends DAOEntity {

	/**
	 * Instantiates a new DAO hello world.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	public DAOHelloWorld(final Connection connection) throws SQLException {
		super(connection);
	}

	/*
	 * les fonctions contenues dans cette classe sont les plus importantes !
	 * c'est elles qui permettent toute relation avec le model(bdd)
	 */
	public void majPosx(final int posx) {
		

		try {
			final String sql = "{call PlayerUpx(?)}"; //on ecrit dans un string la procedure a ecrire dans la bdd
			final CallableStatement call = this.getConnection().prepareCall(sql);//on initialise l'appel de procedure
			call.setInt(1, posx);// on définit que le parametre de la procedure sera un int nommé posx.
			call.execute();//on execute l'appel
		} catch (final SQLException e) {
			e.printStackTrace(); // les try catchs, je sais pas a quoi ca sert, mais il faut qu'ils soient la.
		}
	}

	
	public void majPosy(final int posy) {

		try {// ici, meme chose que pour x, mais pour y
			final String sql = "{call PlayerUpy(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, posy);
			call.execute();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}
	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(java.lang.String)
	 */

	public int recupPosx()  {
		
		try { // la c'est la partie qui récupère les positions stockées dans la bdd.
		int x;
		final String sql = "{call PlayerReadx(?)}";// pas besoin de réexpliquer pour les 3 prochaines lignes.
		final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, 0);
		call.execute();
		final ResultSet resultSet = call.getResultSet(); // ici on crée un objet qui récupèrera la position.
			if (resultSet.first()) {//si une donnée est trouvée ...
				x = resultSet.getInt("posx");// on la retourne !!
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
		
		
		
	}
	
	

	public int recupPosy() {
		try {// meme chose que pour le y.
			int y = 0;
			final String sql = "{call PlayerReady(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
				call.setInt(1, 0);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
				if (resultSet.first()) {
					y = resultSet.getInt("posy");
				}
				
				return y;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		
	}
	
/*	public HelloWorld find(final int posy) {
		HelloWorld helloWorld = new HelloWorld();

		try {
			final String sql = "{call helloworldByKey(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setString(1, key);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.first()) {
				helloWorld = new HelloWorld(resultSet.getInt("posx"), key, resultSet.getInt("posy"));
			}
			return helloWorld;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}*/

}
