/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package dao;

import dao.AbstractFactoryDAO;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of MySQLDAOFactory.
 * 
 * @author Nico
 */
public abstract class MySQLDAOFactory extends AbstractFactoryDAO {
	// Start of user code (user defined attributes for MySQLDAOFactory)

	// End of user code

	/**
	 * The constructor.
	 */
	public MySQLDAOFactory() {
		// Start of user code constructor for MySQLDAOFactory)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for MySQLDAOFactory)
/**
	 * Description of the method getMySQLUserDAOFactoryInstance.
	 * @return 
	 */
	public static MySQLUserDAOFactory getMySQLUserDAOFactoryInstance() {
		// Start of user code for method getMySQLUserDAOFactoryInstance
		MySQLUserDAOFactory getMySQLUserDAOFactoryInstance = null;
		return getMySQLUserDAOFactoryInstance;
		// End of user code
	}
	// End of user code

}
