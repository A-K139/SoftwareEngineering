//Only relevant instance attributes to this method are stated, and simpler constructor here for sake of simplicity
public class Person {
	private String password;
	
	public Person(String password) {
		this.password = password;
	}
	public void setPw(String newPw) {
		this.password = newPw;
		System.out.println("Your password has been successfully changed");
	}
	public String getPw() {
		return password;
	}
	public void changePassword() {
		Login.changePassword(this);
	}
}

