/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package dao;

/**
 * Concrete Factory for MySQLDAO product.
 * Implements the {@link DAOFactory} interface
 * @author Salim Azharhoussen, Birane Ba, Raphael Bourret, Nicolas Galois
 */
public class MongoDAOFactory extends DAOFactory {
	
	/**
	 * The constructor.
	 */
	private MongoDAOFactory() {}
	
	/**
	 * Creates a {@link UserDAO}
	 * @return Returns a {@link MongoUserDAO}
	 */
	public UserDAO createUserDAO() {
		return new MongoUserDAO();
	}
}