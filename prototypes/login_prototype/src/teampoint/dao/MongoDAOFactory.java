/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package dao;

/**
 * Concrete Factory for MySQLDAO product.
 * Implements the {@link DAOFactory} interface
 * @author Salim Azharhoussen, Birane Ba, Raphael Bourret, Nicolas Galois
 */
public class MongoDAOFactory implements DAOFactory {
	
	/**
	 * The constructor.
	 */
	private MongoDAOFactory() {}

	private static class MongoDAOFactoryHolder{
		private static final MongoDAOFactory INSTANCE = new MongoDAOFactory();
	}
	
	/**
	 * Creates a {@link UserDAO}
	 * @return Returns a {@link MongoUserDAO}
	 */
	public UserDAO createUserDAO() {
		return new MongoUserDAO();
	}

	/**
	 * Static method that returns the unique instance of this class
	 * @return Returns the instance of {@link MongoDAOFactory}
	 */
	public static DAOFactory getMongoDAOFactoryInstance() {
		return MongoDAOFactoryHolder.INSTANCE;
	}
}
