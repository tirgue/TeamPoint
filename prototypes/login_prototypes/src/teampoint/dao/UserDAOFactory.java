/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package dao;

import dao.AbstractFactoryDAO;
import dao.UserDAO;
import dao.UserDAOFactory;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of UserDAOFactory.
 * 
 * @author Nico
 */
// TODO : singleton
public abstract class UserDAOFactory implements AbstractFactoryDAO {
	// Start of user code (user defined attributes for UserDAOFactory)

	// End of user code

	/**
	 * The constructor.
	 */
	public UserDAOFactory() {
		// Start of user code constructor for UserDAOFactory)
		super();
		// End of user code
	}

	/**
	 * Description of the method create.
	 * @return 
	 */
	public UserDAO create() {
		// Start of user code for method create
		return new UserDAO();
		// End of user code
	}

	/**
	 * Description of the method getUserDAOFactoryInstance.
	 * @return 
	 */
	public static UserDAOFactory getUserDAOFactoryInstance() {
		// Start of user code for method getUserDAOFactoryInstance
		UserDAOFactory getUserDAOFactoryInstance = null;
		return getUserDAOFactoryInstance;
		// End of user code
	}

	// Start of user code (user defined methods for UserDAOFactory)

	// End of user code

}
