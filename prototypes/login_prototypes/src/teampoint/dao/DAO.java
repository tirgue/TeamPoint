/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package dao;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of DAO.
 * 
 * @author Nico
 */
public interface DAO<T> {
	// Start of user code (user defined attributes for DAO)

	// End of user code

	/**
	 * Description of the method create.
	 * @param obj 
	 * @return 
	 */
	public Boolean create(T obj);

	/**
	 * Description of the method delete.
	 * @param obj 
	 * @return 
	 */
	public Boolean delete(T obj);

	// Start of user code (user defined methods for DAO)

	// End of user code

}
