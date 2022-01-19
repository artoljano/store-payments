public class User {

	String FirstName;	
	String LastName;
	String Email;
	String Phone;
	String Username;
	String Password;
	
	
	public User(String FirstName, String LastName, String Email, String Phone, String Username, String Password) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.Phone = Phone;
		this.Username = Username;
		this.Password = Password;
	}
	
	public User(String Username, String Password) {
		this.Username = Username;
		this.Password = Password;
	}
	
	
	public static void Register() {
		User test = new User("Artol",
				"Jano",
				"artol.jano",
				"123",
				"ajano",
				"ajano");
		
		UsersDb.AddUser(test);
		
	}
}
