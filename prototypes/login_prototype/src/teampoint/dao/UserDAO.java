/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package dao;

import business_logic.user.User;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of UserDAO.
 * 
 * @author Nico
 */
public abstract class UserDAO implements DAO<User> {
	// Start of user code (user defined attributes for UserDAO)

	// End of user code

	/**
	 * The constructor.
	 */
	public UserDAO() {
		// Start of user code constructor for UserDAO)
		super();
		// End of user code
	}

	/**
	 * Description of the method getUser.
	 * @param email 
	 * @param password 
	 * @return 
	 */
	public User getUser(String email, String password) {
		// Start of user code for method getUser
		User getUser = null;
		return getUser;
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

	// End of user code

}
