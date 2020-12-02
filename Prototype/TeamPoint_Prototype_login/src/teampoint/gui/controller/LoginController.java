/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package gui.controller;

import business_logic.UserFacade;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of LoginController.
 * 
 * @author Nico
 */
public class LoginController {
	/**
	 * Description of the property userFacade.
	 */
	public UserFacade userFacade = null;

	// Start of user code (user defined attributes for LoginController)

	// End of user code

	/**
	 * The constructor.
	 */
	public LoginController() {
		// Start of user code constructor for LoginController)
		super();
		// End of user code
	}

	/**
	 * Description of the method login.
	 * @param email 
	 * @param password 
	 * @return 
	 */
	public Boolean login(String email, String password) {
		// Start of user code for method login
		Boolean login = Boolean.FALSE;
		return login;
		// End of user code
	}

	// Start of user code (user defined methods for LoginController)

	// End of user code
	/**
	 * Returns userFacade.
	 * @return userFacade 
	 */
	public UserFacade getUserFacade() {
		return this.userFacade;
	}

	/**
	 * Sets a value to attribute userFacade. 
	 * @param newUserFacade 
	 */
	public void setUserFacade(UserFacade newUserFacade) {
		this.userFacade = newUserFacade;
	}

}
