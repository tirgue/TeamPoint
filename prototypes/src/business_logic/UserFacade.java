/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package business_logic;


import business_logic.user.User;
import dao.DAOFactory;
import dao.UserDAO;

/**
 * {@link UserFacade} is a Singleton class. Simplify the use of 
 * buisness logic subsystem for the GUI layer. Facade pattern. Contains the
 * buisness methods.
 * @author Salim Azharhoussen, Birane Ba, Raphael Bourret, Nicolas Galois
 */
public class UserFacade {

	/**
	 * <code>currentUser</code> class member {@link User} instance.
	 * Is null until login method is called
	 */
	@SuppressWarnings("unused")
	private User currentUser;


	private DAOFactory daoFactory;

	/**
	 * <code>private</code> constructor
	 */
	private UserFacade() {
		this.currentUser = null;
		this.daoFactory = DAOFactory.getDaoFactoryInstance();
	}

	/***
	 * The {@link UserFacadeHolder} <code>static</code> nested class
	 * guarantees the uniqueness of {@link UserFacade} instance
	 */
	private static class UserFacadeHolder {
		/**
		 * The unique instance of {@link UserFacade}
		 */
		private static final UserFacade USER_FACADE = new UserFacade();
	}

	/***
	 * <code>static</code> method. Gives the unique instance of {@link UserFacade}
	 * @return Returns the {@link UserFacade} 
	 */
	public static UserFacade getUserFacadeInstance() {
		return UserFacadeHolder.USER_FACADE;
	}

	/**
	 * Asks for UserDAO to return a user based on email and password,
	 * sets the currentUser to the returned {@link User}
	 * @param email 
	 * @param password 
	 * @return true if user found, false if user not found or incorrect 
	 */
	public Boolean login(String email, String password) {
		daoFactory.initializeConnection();
		UserDAO userDAO = daoFactory.createUserDAO();
		try {
			this.currentUser = userDAO.getUser(email, password);	
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
