/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package business_logic.user;

import java.util.Date;
// Start of user code (user defined imports)
import java.util.HashSet;

// End of user code

/**
 * Description of User.
 * 
 * @author Nico
 */
public class User {

	/**
	 * Description of the property name.
	 */
	public String name = "";

	/**
	 * Description of the property firstName.
	 */
	public String firstName = "";

	/**
	 * Description of the property email.
	 */
	public String email = "";

	/**
	 * Description of the property profileDescription.
	 */
	public String profileDescription = "";

	/**
	 * Description of the property phoneNumber.
	 */
	public String phoneNumber = "";

	/**
	 * Description of the property userAttendances.
	 */
	public HashSet<AbstractUserAttendance> userAttendances = new HashSet<AbstractUserAttendance>();

	/**
	 * Description of the property birthday.
	 */
	public Date birthday = new Date();

	// Start of user code (user defined attributes for User)
	
	//TODO Ajouter dans la base le role du user et donc dans le constructeur
	public User(
		String name, String firstName, String email, String profileDescription, String phoneNumber
		) {
			this.name = name;
			this.firstName = firstName;
			this.email = email;
			this.profileDescription = profileDescription;
			this.phoneNumber = phoneNumber;
		}	
	// End of user code

	// Start of user code (user defined methods for User)

	// End of user code
	/**
	 * Returns profileDescription.
	 * @return profileDescription 
	 */
	public String getProfileDescription() {
		return this.profileDescription;
	}

	/**
	 * Sets a value to attribute profileDescription. 
	 * @param newProfileDescription 
	 */
	public void setProfileDescription(String newProfileDescription) {
		this.profileDescription = newProfileDescription;
	}

	/**
	 * Returns phoneNumber.
	 * @return phoneNumber 
	 */
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	/**
	 * Sets a value to attribute phoneNumber. 
	 * @param newPhoneNumber 
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		this.phoneNumber = newPhoneNumber;
	}

	/**
	 * Returns email.
	 * @return email 
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Sets a value to attribute email. 
	 * @param newEmail 
	 */
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	/**
	 * Returns userAttendances.
	 * @return userAttendances 
	 */
	public HashSet<AbstractUserAttendance> getUserAttendances() {
		return this.userAttendances;
	}

	/**
	 * Returns name.
	 * @return name 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets a value to attribute name. 
	 * @param newName 
	 */
	public void setName(String newName) {
		this.name = newName;
	}

	/**
	 * Returns firstName.
	 * @return firstName 
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Sets a value to attribute firstName. 
	 * @param newFirstName 
	 */
	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}

	/**
	 * Returns birthday.
	 * @return birthday 
	 */
	public Date getBirthday() {
		return this.birthday;
	}

	/**
	 * Sets a value to attribute birthday. 
	 * @param newBirthday 
	 */
	public void setBirthday(Date newBirthday) {
		this.birthday = newBirthday;
	}

}
