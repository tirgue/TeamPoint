/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package business_logic;


import business_logic.user.User;
import dao.MySQLDAOFactory;

/**
 * Make the link between User frontend and User backend.
 * 
 * @author Salim Azharhoussen, Birane Ba, Raphael Bourret, Nicolas Galois
 */
public class UserFacade {
	/**
	 * The User logged in. If there is no User logged in : null.
	 */
	private User user = null;

	/**
	 * UserFacade constructor.
	 * @return A new UserFacade.
	 */
	private UserFacade() {}

	/**
	 * Handler for the unique instance of UserFacade.
	 */
	private static class LazyHolder {
		/**
		 * The unique instance of the UserFacede.
		 */
		static final UserFacade INSTANCE = new UserFacade ();
	}

	/**
	 * Get the UserFacade instance.
	 * @return The unique UserFacade instance.
	 */
	public static UserFacade getUserFacadeInstance() {
		return LazyHolder.INSTANCE;
	}

	/**
	 * Ask for UserDAO to return an user based on email and password, set the currentUser to the returned user.
	 * @param email : the User's email.
	 * @param password : the User's password.
	 * @return true if user found, false if user not found or incorrect.
	 */
	public Boolean login(String email, String password) {		
		try {
			User user = MySQLDAOFactory.getMySQLDAOFactoryInstance().createUserDAO().getUser(email, password);
			setUser(user);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Get the User logged in.
	 * @return The User logged in.
	 */
	public User getUser() {
		return this.user;
	}

	/**
	 * Set the User logged in.
	 * @param newUser : The User logged in.
	 */
	public void setUser(User newUser) {
		this.user = newUser;
	}

}
