/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package dao;

import business_logic.user.User;

/**
 * {@link UserDAO} class implements {@link DAO} interface
 * @author Salim Azharhoussen, Birane Ba, Raphael Bourret, Nicolas Galois
 */
public abstract class UserDAO implements DAO<User>{
	
	/**
	 * For a given email and password returns the corresponding {@link User}
	 * @param email an email as a {@link String}
	 * @param password the given password as a {@link String}
	 * @return Returns the corresponding {@link User} if found in the database
	 * otherwise throw an {@link Exception}
	 */
	public abstract User getUser(String email, String password) throws Exception;
}
