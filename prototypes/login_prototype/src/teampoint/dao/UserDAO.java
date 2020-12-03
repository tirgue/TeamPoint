/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package dao;

import business_logic.user.User;
// Start of user code (user defined imports)
import database.JDBCConnector;

// End of user code

/**
 * Description of UserDAO.
 * 
 * @author Nico
 */
public abstract class UserDAO implements DAO<User> {
	
	private Connection connection;
	
	/**
	 * The constructor.
	 */
	public UserDAO() {
		// Start of user code constructor for UserDAO)
		super();
		this.connection = JDBCConnector.getInstance();
		// End of user code
	}

	@Override
	public Boolean create(User obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(User obj) {
		// TODO Auto-generated method stub
		return null;
	}

	// Start of user code (user defined methods for UserDAO)

	public Connection getConnection() {
		return this.connection;
	}

	// End of user code

}
