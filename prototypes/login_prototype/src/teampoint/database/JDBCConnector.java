/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package database;

//import java.sql.DriverManager;
import java.sql.Connection;
import database.JDBCConnector;

/**
 * Description of JDBCConnector.
 * 
 * @author Nico
 */
public class JDBCConnector {
	/**
	 * Description of the property connection.
	 */
	public Connection connection;

	private JDBCConnector() {

		/*Class.forName("com.mysql.cj.jdbc.Driver");
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost/TeamPoint?" + "user=root&password=");*/

	}
	
	/** Holder */
	private static class JDBCCOnnectorHolder {
		/** Instance unique non préinitialisée */
		private final static JDBCConnector INSTANCE = new JDBCConnector();
	}

	/** Point d'accès pour l'instance unique du singleton */
	public static JDBCConnector getInstance() {
		return JDBCCOnnectorHolder.INSTANCE;
	}

	/**
	 * Returns connection.
	 * 
	 * @return connection
	 */
	public Connection getConnection() {
		return this.connection;
	}
}
