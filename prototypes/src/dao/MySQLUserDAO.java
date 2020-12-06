/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package dao;

import business_logic.user.User;
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

	/**
	 * The constructor.
	 */
	public MySQLUserDAO() {
		// TODO construct the UserDAO object
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

	@Override
	public User getUser(String email, String password) throws Exception {
		ArrayList<String> resultat = new ArrayList<String>();
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = JDBCConnector.getInstance().getConnection().createStatement();
		} catch (SQLException e) {
			// TODO explain database not found
			e.printStackTrace();
		}

		String req = "SELECT idUser, name, firstName, email, phoneNumber, profileDescription, birthday" + " FROM User "
				+ "WHERE email = '" + email + "'" + " AND password = '" + password + "'";

		try {
			if (stmt.execute(req)) {
				rs = stmt.getResultSet();
			}
			int i = 0;
			while (rs.next()) {
				resultat.add(rs.getString(i));
				i++;
			}
		} catch (SQLException e) {
			// TODO explain connection lost
			e.printStackTrace();
		}

		User user = new User(resultat.get(0), resultat.get(1), resultat.get(2), resultat.get(3), resultat.get(4));

		return user;
	}

	public static void main(String[] args) {
		MySQLUserDAO mySQLUserDAO = new MySQLUserDAO();

		try {
			mySQLUserDAO.getUser("galoisnicolas@gmail.com", "toto");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
