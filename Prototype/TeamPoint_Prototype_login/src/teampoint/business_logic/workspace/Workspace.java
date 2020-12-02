/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package business_logic.workspace;

import java.util.HashSet;

import business_logic.user.AbstractUserAttendance;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Workspace.
 * 
 * @author Nico
 */
public class Workspace {
	/**
	 * Description of the property userAttendances.
	 */
	public HashSet<AbstractUserAttendance> userAttendances = new HashSet<AbstractUserAttendance>();

	// Start of user code (user defined attributes for Workspace)

	// End of user code

	/**
	 * The constructor.
	 */
	public Workspace() {
		// Start of user code constructor for Workspace)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Workspace)

	// End of user code
	/**
	 * Returns userAttendances.
	 * @return userAttendances 
	 */
	public HashSet<AbstractUserAttendance> getUserAttendances() {
		return this.userAttendances;
	}

}
