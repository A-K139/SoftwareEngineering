package verifyLogin;
import java.util.ArrayList;

public class User {
	private static ArrayList <User> userDatabase = new ArrayList<User>();
	private String password;
	private String email;
	
	public User(String password, String email) {
		this.password = password;
		this.email = email;
		userDatabase.add(this);
	}
	
	public String getPw() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	public static ArrayList<User> getArrayList() {
		return userDatabase;
	}
}
