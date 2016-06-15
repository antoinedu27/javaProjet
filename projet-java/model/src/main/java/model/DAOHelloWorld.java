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
class DAOHelloWorld extends DAOEntity {

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
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#create(model.Entity)
	 */
	@Override
	
	public void majPosx(final int posx) {
		//HelloWorld helloWorld = new HelloWorld();

		try {
			final String sql = "{call PlayerUpx(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, posx);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			//if (resultSet.first()) {
			//	helloWorld = new HelloWorld(id, resultSet.getInt("posx"), resultSet.getInt("posy"));

		//		System.out.println(resultSet.getInt("posx"));
		//	}
			//return helloWorld;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	//	return null;
	}

	
	public void majPosy(final int posy) {
	//	HelloWorld helloWorld = new HelloWorld();

		try {
			final String sql = "{call PlayerUpy(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, posy);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
		//	if (resultSet.first()) {
			//	helloWorld = new HelloWorld(id, resultSet.getInt("posx"), resultSet.getInt("posy"));
//				System.out.println(resultSet.getInt("posy"));
		//	}
	//		return helloWorld;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	//	return null;
	}
	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(java.lang.String)
	 */
	
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
