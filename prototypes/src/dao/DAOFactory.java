/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package dao;

/**
 * Abstract Factory interface
 * 
 * @author Salim Azharhoussen, Birane Ba, Raphael Bourret, Nicolas Galois
 */
public interface DAOFactory {
	
	/**
	 * Creates a {@link UserDAO}
	 * @return Returns a {@link UserDAO}
	 */
	public UserDAO createUserDAO();
}
