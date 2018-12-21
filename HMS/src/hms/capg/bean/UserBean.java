package hms.capg.bean;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.sun.istack.internal.NotNull;

public class UserBean {

    @NotEmpty(message = "Please enter your userId.")
	String userId;

    @NotEmpty(message = "Please enter your password.")
	@Size(min = 6, max = 15)
	String userPassword;
	@NotNull
	String firstName;
	@NotNull
	String lastName;
	@NotNull
	String dateOfBirth;
	@NotNull
	String contactNumber;
	@NotNull
	char gender;
	public UserBean() {
		super();
	}
	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", userPassword=" + userPassword + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", contactNumber=" + contactNumber
				+ ", gender=" + gender + "]";
	}
	public UserBean(String userId, String userPassword, String firstName, String lastName, String dateOfBirth,
			String contactNumber, char gender) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.contactNumber = contactNumber;
		this.gender = gender;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	

}
