/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package business_logic;

import business_logic.UserFacade;
// Start of user code (user defined imports)
import business_logic.user.User;
import dao.MySQLDAOFactory;
import dao.UserDAO;

// End of user code

/**
 * Description of UserFacade.
 * 
 * @author Nico
 */
public class UserFacade {
	/**
	 * Description of the property user.
	 */
	private User currentUser = null;

	// Start of user code (user defined attributes for UserFacade)

	// End of user code

	/**
	 * The constructor.
	 */
	public UserFacade() {
		// Start of user code constructor for UserFacade)
		super();
		// End of user code
	}

	/**
	 * Description of the method getUserFacadeInstance.
	 * @return 
	 */
	public static UserFacade getUserFacadeInstance() {
		// Start of user code for method getUserFacadeInstance
		UserFacade getUserFacadeInstance = null;
		return getUserFacadeInstance;
		// End of user code
	}

	/**
	 * ask for UserDAO to return an user based on email and password, set the currentUser to the returned user
	 * @param email 
	 * @param password 
	 * @return true if user found, false if user not found or incorrect 
	 */
	public Boolean login(String email, String password) {
		// Start of user code for method login
		
		try {
			User user = MySQLDAOFactory.getMySQLDAOFactoryInstance().createUserDAO().getUser(email, password);
			setCurrentUser(user);
			
			return true;
		} catch (Exception e) {
			return false;
		}
		// End of user code
	}

	// Start of user code (user defined methods for UserFacade)

	// End of user code
	/**
	 * Returns user.
	 * @return user 
	 */
	public User getCurrentUser() {
		return this.currentUser;
	}

	/**
	 * Sets a value to attribute user. 
	 * @param newUser 
	 */
	public void setCurrentUser(User newUser) {
		this.currentUser = newUser;
	}

}
