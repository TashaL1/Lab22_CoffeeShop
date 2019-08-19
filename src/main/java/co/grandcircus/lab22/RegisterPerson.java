package co.grandcircus.lab22;

public class RegisterPerson {

	private String firstName;
	private String lastName;
	private char email;
	private int phoneNum;
	public RegisterPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisterPerson(String firstName, String lastName, char email, int phoneNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNum = phoneNum;
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
	public char getEmail() {
		return email;
	}
	public void setEmail(char email) {
		this.email = email;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "RegisterPerson [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNum="
				+ phoneNum + "]";
	}
	
	
}
