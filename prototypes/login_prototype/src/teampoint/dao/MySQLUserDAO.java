import dao.UserDAO;

public class MySQLUserDAO extends UserDAO{



    /**
	 * Description of the method getUser.
	 * @param email 
	 * @param password 
	 * @return 
	 */
	public User getUser(String email, String password) {
		// SQL Query to find a user
		String mail = "galoisnicolas@gmail.com";
        String pass = "toto";
            
        stmt = getConnection().createStatement();

        String req = "SELECT idUser, name, firstName, email, phoneNumber, profileDescription, birthday"
            		+ " FROM User "
            		+ "WHERE email = '" + email + "'"
            				+ " AND password = '" + pass + "'";
            
        if (stmt.execute(req)) {
            rs = stmt.getResultSet();
        }

        while (rs.next()) {

            int idUser = rs.getInt("Id_User");
            
            String name = rs.getString("name");
            String firstName = rs.getString("firstName");
            
            String emailBase = rs.getString("email");
            
            String profileDescr = rs.getString("profileDescription");
            
            System.out.println(idUser + ", " + name + ", " + firstName + 
                    ", " + email + ", " + pass + ", " + profileDescr);
          }



		return getUser;
		// End of user code
	}
}
