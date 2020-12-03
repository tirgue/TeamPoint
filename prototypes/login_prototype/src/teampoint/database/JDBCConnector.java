/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package database;

import java.sql.DriverManager;

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


    private static JDBCConnector INSTANCE = null;

	private JDBCConnector() {

        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost/TeamPoint?" +
            	                                   "user=root&password=");

	}

	/** Point d'accès pour l'instance unique du singleton */
    public static synchronized JDBCConnector getInstance()
    {           
        if (INSTANCE == null){ 
			INSTANCE = new JDBCConnector(); 
		}
        return INSTANCE;
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
}
