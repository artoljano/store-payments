public class User {

	String FirstName;	
	String LastName;
	String Email;
	Integer PhoneNumber;
	String Username;
	String Password;
	
	
	public User(String FirstName, String LastName, String Email, Integer PhoneNumber, String Username, String Password) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.PhoneNumber = PhoneNumber;
		this.Username = Username;
		this.Password = Password;
	}
	
	public User(String Username, String Password) {
		this.Username = Username;
		this.Password = Password;
	}
	
	
	
}
