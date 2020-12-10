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
	public static final JDBCConnector jdbcConnector = JDBCConnector.getInstance();

	/**
	 * Creates a {@link UserDAO}
	 * @return Returns a {@link UserDAO}
	 */
	public abstract UserDAO createUserDAO();
}
