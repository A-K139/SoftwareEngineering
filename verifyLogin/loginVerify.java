package verifyLogin;
import java.util.Scanner;
//Only relevant instance attributes to this method are stated in entity classes, and simpler constructor here for sake of simplicity
public class loginVerify {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		User user1 = new User("Thepassword112", "user1@gmail.com");
		User user2 = new User("Thepassword113", "user2@gmail.com");
		User user3 = new User("abc123", "t.pieroni@ucl.ac.uk");
		fullVerify();
	}
	
	public static void fullVerify() {
		int indexV = findEmail();
		while(indexV==-1) {
				System.out.println("Cannot find email address, please try again or create an account");
				fullVerify();
		}
		if(pwVerify(indexV)) {
			System.out.print("Login Successful");
			System.exit(0);
		}
		else {
			System.out.println("Password wrong");
		}
	}
	public static int findEmail() {
		System.out.println("Please enter your email address");
		String emailInput = scan.next();
		for(int i =0; i < User.getArrayList().size(); i++) {
			if(emailInput.equals(User.getArrayList().get(i).getEmail()))
				return i;
		}
		return -1;
	}
	public static boolean pwVerify(int index) {
		System.out.println("Please enter your password");
		String passwordInput = scan.next();
		if (passwordInput.equals(User.getArrayList().get(index).getPw())) {
			return true;
		}
		return false;
	}
}
