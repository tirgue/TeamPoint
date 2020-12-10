/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package dao;

import database.JDBCConnector;

/**
 * Abstract Factory interface
 * 
 * @author Salim Azharhoussen, Birane Ba, Raphael Bourret, Nicolas Galois
 */
public abstract class DAOFactory {
	
	private JDBCConnector jdbcConnector;

	public void initializeConnection() {
		this.jdbcConnector = JDBCConnector.getInstance();
	}
	
	public JDBCConnector getJdbcConnector() {
		return jdbcConnector;
	}
	
	/**
	 * Creates a {@link UserDAO}
	 * @return Returns a {@link UserDAO}
	 */
	public abstract UserDAO createUserDAO();
}
