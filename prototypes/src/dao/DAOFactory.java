/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package dao;

import database.JDBCConnector;

/**
 * {@link DAOFactory} is the Abstract Factory for {@link DAO} objects.
 * 
 * @author Salim Azharhoussen, Birane Ba, Raphael Bourret, Nicolas Galois
 */
public abstract class DAOFactory {

	/**
	 * The {@link JDBCConnector} instance
	 */
	private JDBCConnector jdbcConnector; 

	private static class DAOFactoryHolder {
		/**
		 * The concrete factory for creating {@link DAO} object family
		 */
		private static final DAOFactory DAO_FACTORY = new MySQLDAOFactory();
	}

	/**
	 * Creates a {@link UserDAO}
	 * @return Returns a {@link UserDAO}
	 */
	public abstract UserDAO createUserDAO();

	/**
	 * Retrieves the {@link JDBCConnector} instance and set the <code>jdbcConnector</code>
	 * class member
	 */
	public void initializeConnection(){
		this. jdbcConnector = JDBCConnector.getJDBCConnectorInstance();
	}

	/**
	 * <code>static</code> method. It returns a subtype of {@link DAOFactory} (a concrete factory)
	 * @return Returns the concrete factory for creating {@link DAO} object family
	 */
	public static DAOFactory getDaoFactoryInstance() {
		return DAOFactoryHolder.DAO_FACTORY;
	}

	/**
	 * Getter
	 * @return Returns the {@link JDBCConnector} class member
	 */
	public JDBCConnector getJdbcconnector() {
		return jdbcConnector;
	}
}