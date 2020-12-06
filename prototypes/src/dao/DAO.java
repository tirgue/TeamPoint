/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package dao;

import database.JDBCConnector;

/**
 * DAO interface
 * @author Salim Azharhoussen, Birane Ba, Raphael Bourret, Nicolas Galois
 */
public interface DAO<T> {

	public static final JDBCConnector jdbcConnector = JDBCConnector.getInstance();
	
	/**
	 * Creates the given object in the database.
	 * (Insert query)
	 * @param obj The object data structure must exist in the database 
	 * @return Returns <code>true</code> if the operation succeed otherwise <code>false</code> 
	 */
	public Boolean create(T obj);

	/**
	 * Removes the data corresponding to this object form the database.
	 * (Delete Query)
	 * @param obj The object data structure must exist in the database 
	 * @return Returns <code>true</code> if the operation succeed otherwise <code>false</code>
	 */
	public Boolean delete(T obj);

}
