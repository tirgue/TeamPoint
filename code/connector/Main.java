import java.sql.*;  

public class Main {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/TeamPoint?" +
            	                                   "user=root&password=");
            
            String email = "galoisnicolas@gmail.com";
            String pass = "toto";
            
            stmt = conn.createStatement();
            //rs = stmt.executeQuery("SELECT * FROM User"
            	//	+ "WHERE email = " + email);
            
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
                
                String profileDescr = rs.getString("profileDescription");
                
                System.out.println(idUser + ", " + name + ", " + firstName + 
                		", " + email + ", " + pass + ", " + profileDescr);
              }


        } catch (Exception ex) {
            // handle the error
        	System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ((SQLException) ex).getSQLState());
            System.out.println("VendorError: " + ((SQLException) ex).getErrorCode());
        } 
		finally {
		    // it is a good idea to release
		    // resources in a finally{} block
		    // in reverse-order of their creation
		    // if they are no-longer needed

		    if (rs != null) {
		        try {
		            rs.close();
		        } catch (SQLException sqlEx) { } // ignore

		        rs = null;
		    }

		    if (stmt != null) {
		        try {
		            stmt.close();
		        } catch (SQLException sqlEx) { } // ignore

		        stmt = null;
		    }
		  
		}
	}

}
