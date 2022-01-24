import java.sql.*;

public class UsersDb {
	
	public static void AddUser(User user) {
		
		try {
			
			Connection con = DbConnector.getCon();
			PreparedStatement ps = con
					.prepareStatement("insert into " + IUser.TABLE_USERS + "  values(?,?,?,?,?,?)");
			ps.setString(1, user.FirstName);
			ps.setString(2, user.LastName);
			ps.setString(3, user.Email);
			ps.setString(4, user.Phone);
			ps.setString(5, user.Username);
			ps.setString(6, user.Password);
			
			ps.executeUpdate();
		
	}
		catch (Exception e) {
			System.out.println("Cannot connect to DB to add new user!");
		}

}
	
	public static void DeleteUser(User user) {
		
try {
			
			Connection con = DbConnector.getCon();
			PreparedStatement ps = con
					.prepareStatement("delete from " + IUser.TABLE_USERS + " where " + IUser.COLUMN_FIRSTNAME + "=?");
			ps.setString(1, user.FirstName);
			
			ps.executeUpdate();
		
	}
		catch (Exception e) {
			System.out.println("Cannot connect to DB to delete user!");
		}

	}
	
	public static void EditUser(User user, User newUser) {
		String uName = user.Username;
		try {
			Connection con = DbConnector.getCon();
			PreparedStatement ps = con
					.prepareStatement("UPDATE " + IUser.TABLE_USERS + 
							" SET " + IUser.COLUMN_FIRSTNAME + "=?," + IUser.COLUMN_LASTNAME + "=?," + IUser.COLUMN_EMAIL + "=?," + IUser.COLUMN_PHONE + "=?," + IUser.COLUMN_USERNAME + "=?," + IUser.COLUMN_PASSWORD + "=?" + 
							" where " + IUser.COLUMN_USERNAME + "=" + "'" + uName + "'");
			ps.setString(1, newUser.FirstName);
			ps.setString(2, newUser.LastName);
			ps.setString(3, newUser.Email);
			ps.setString(4, newUser.Phone);
			ps.setString(5, newUser.Username);
			ps.setString(6, newUser.Password);
			
			ps.executeUpdate();
		
		}
		catch(Exception e) {
			System.out.println("Cannot connect to DB to edit user!");
		}
	}
	
	
}
