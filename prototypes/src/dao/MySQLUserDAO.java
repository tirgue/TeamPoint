/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package dao;

import business_logic.user.User;
//import database.JDBCConnector;
import database.JDBCConnector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * MySQL specific DAO for User. This class extends {@link UserDAO}
 * 
 * @author Salim Azharhoussen, Birane Ba, Raphael Bourret, Nicolas Galois
 */
public class MySQLUserDAO extends UserDAO {

	private JDBCConnector jdbcConnector;

	/**
	 * The constructor.
	 */
	public MySQLUserDAO(JDBCConnector connector) {
		this.jdbcConnector = connector;
	}

	@Override
	public Boolean create(User obj) {
		// TODO user insertion query to the DB
		return null;
	}

	@Override
	public Boolean delete(User obj) {
		// TODO user deletion query to the database
		return null;
	}
	
	public JDBCConnector getJdbcConnector() {
		return jdbcConnector;
	}

	/**ask to the database to return the line that correspond to an email and password
	 * @param email 
	 * @param password 
	 * @return the User created
	 */
	@Override
	public User getUser(String email, String password) throws Exception {
		// List of all fields to create an user
		ArrayList<String> resultat = new ArrayList<String>();
		
		// Result from database
		ResultSet rs = null;
		
		// Query statement
		Statement stmt = null;
		
		try {
			// Getconnection
			stmt = getJdbcConnector().getConnection().createStatement();
		} catch (SQLException e) {
			// TODO explain database not found
			e.printStackTrace();
		}

		String req = "SELECT idUser, name, firstName, email, phoneNumber, profileDescription, birthday" + 
					 " FROM User "
					 + "WHERE email = '" + email + "'" + " AND password = '" + password + "'";

		try {
			if (stmt.execute(req)) {
				rs = stmt.getResultSet();
			}
			
			while (rs.next()) {
				
            	resultat.add(rs.getString("name"));
            	resultat.add(rs.getString("firstName"));
                
            	resultat.add(rs.getString("email"));
                
            	resultat.add(rs.getString("profileDescription"));
            	resultat.add(rs.getString("phoneNumber"));
			}
		} catch (SQLException e) {
			// TODO explain connection lost
			e.printStackTrace();
		}

		if (resultat.size() == 0) {
			throw new Exception("User not found");
		}
		
		User user = new User(resultat.get(0), resultat.get(1), resultat.get(2), resultat.get(3), resultat.get(4));
		//System.out.println(user.toString());
		return user;
	}

	public static void main(String[] args) {
		MySQLUserDAO mySQLUserDAO = new MySQLUserDAO(JDBCConnector.getInstance());

		try {
			User user = mySQLUserDAO.getUser("galoisnicolas@gmail.com", "toto");
			System.out.println(user.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
