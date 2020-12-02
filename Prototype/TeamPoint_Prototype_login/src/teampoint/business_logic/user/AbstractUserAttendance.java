/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package business_logic.user;

import business_logic.workspace.Workspace;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of AbstractUserAttendance.
 * 
 * @author Nico
 */
public abstract class AbstractUserAttendance {
	/**
	 * Description of the property user.
	 */
	public User user = null;

	/**
	 * Description of the property workspace.
	 */
	public Workspace workspace = null;

	// Start of user code (user defined attributes for AbstractUserAttendance)

	// End of user code

	// Start of user code (user defined methods for AbstractUserAttendance)

	// End of user code
	/**
	 * Returns user.
	 * @return user 
	 */
	public User getUser() {
		return this.user;
	}

	/**
	 * Sets a value to attribute user. 
	 * @param newUser 
	 */
	public void setUser(User newUser) {
		this.user = newUser;
	}

	/**
	 * Returns workspace.
	 * @return workspace 
	 */
	public Workspace getWorkspace() {
		return this.workspace;
	}

	/**
	 * Sets a value to attribute workspace. 
	 * @param newWorkspace 
	 */
	public void setWorkspace(Workspace newWorkspace) {
		this.workspace = newWorkspace;
	}

}
