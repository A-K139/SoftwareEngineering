import java.util.Scanner;

public class Login {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//example password on person object
		Person user = new Person("Thepassword112");
		user.changePassword();	
	}
	
	public static void changePassword(Person user) {
		boolean isValid = false;
		boolean isValid1 = false;
		int count = 0;
		
		while (count < 5) {
			if(checkOld(user.getPw(), count)) {
				while(!isValid) {
					count = 6;
					String newPw = enterNew();
					if(containNo(newPw) && pwLength(newPw) && hasCapital(newPw)) {
						isValid = true;
						while(!isValid1) {
							if(enterCon(newPw)) {
								user.setPw(newPw);
								System.out.println("Console log: new password stated below:");
								System.out.print(user.getPw());
								isValid1 = true;
					}
							else
								System.out.println("Your passwords do not match, please enter again");
					}
				}
							else 
								System.out.println("Please ensure your password contains at least 1 number, 1 capital and 8 characters long");
				}	
			}
			else {
				count+= 1;
				if(count == 5) {
					System.out.println("Too many failed attempts");
					System.exit(0);
				}
			}
		}
	}
	private static boolean checkOld(String oldPw, int count) {
		int attemptNo = count+1;
		System.out.println("Enter your old password, you have 5 attempts. Attempt: " + attemptNo);
		return scan.next().equals(oldPw);
	}
	private static String enterNew() {
		System.out.println("Enter your new password");
		return scan.next();
	}
	private static boolean enterCon(String newPw) {
		System.out.println("Confirm your new password");
		if(scan.next().equals(newPw))
			return true;
		return false;
	}
	private static boolean containNo(String newPw) {
		for(int i = 0; i < newPw.length(); i++) {
			if(Character.isDigit(newPw.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	private static boolean pwLength(String newPw) {
		if (newPw.length() > 7)
			return true;
		return false;
	}
	private static boolean hasCapital(String newPw) {
		for(int i = 0; i < newPw.length(); i++) {
			if(Character.isUpperCase(newPw.charAt(i))) {
				return true;
			}
		}
		return false;
	}
}
