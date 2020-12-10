/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package dao;

/**
 * Concrete Factory for MySQLDAO products.
 * Implements the {@link DAOFactory} interface
 * @author Salim Azharhoussen, Birane Ba, Raphael Bourret, Nicolas Galois
 */
public class MySQLDAOFactory extends DAOFactory {
	
	/**
	 * The constructor.
	 */
	private MySQLDAOFactory() {}

	private static class MySQLDAOFactoryHolder{
		private static final MySQLDAOFactory INSTANCE = new MySQLDAOFactory();
	}
	
	/**
	 * Static method that returns the unique instance of this class
	 * @return Returns the instance of {@link MySQLDAOFactory}
	 */
	public static DAOFactory getMySQLDAOFactoryInstance() {
		return MySQLDAOFactoryHolder.INSTANCE;
	}
	
	/**
	 * Creates a {@link UserDAO}
	 * @return Returns a MySQLUserDAO
	 */
	public UserDAO createUserDAO() {
		return new MySQLUserDAO(getJdbcConnector());
	}
}
