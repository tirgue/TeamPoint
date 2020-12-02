/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package database;

import database.Connection;
import database.JDBCConnector;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of JDBCConnector.
 * 
 * @author Nico
 */
public class JDBCConnector {
	/**
	 * Description of the property connection.
	 */
	public Connection connection = null;

	// Start of user code (user defined attributes for JDBCConnector)

	// End of user code

	/**
	 * The constructor.
	 */
	public JDBCConnector() {
		// Start of user code constructor for JDBCConnector)
		super();
		// End of user code
	}

	/**
	 * Description of the method getJDBCInstance.
	 * @return 
	 */
	public JDBCConnector getJDBCInstance() {
		// Start of user code for method getJDBCInstance
		JDBCConnector getJDBCInstance = null;
		return getJDBCInstance;
		// End of user code
	}

	// Start of user code (user defined methods for JDBCConnector)

	// End of user code
	/**
	 * Returns connection.
	 * @return connection 
	 */
	public Connection getConnection() {
		return this.connection;
	}

	/**
	 * Sets a value to attribute connection. 
	 * @param newConnection 
	 */
	public void setConnection(Connection newConnection) {
		this.connection = newConnection;
	}

}
