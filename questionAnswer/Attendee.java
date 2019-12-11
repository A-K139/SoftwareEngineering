package questionAnswer;
import java.util.Scanner;

public class Attendee {
	boolean hasAnsweredQuestion;
	String email;
	
	public Attendee(String email) {
		this.hasAnsweredQuestion = false;
		this.email = email;
	}
	public void addQuestion(Speaker speaker1) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ask a question and the speaker will try to answer at the end of the presentation. "
				+ "You can only ask 1 question with a max of 200 characters.");
		while (true) {
			String question = scan.nextLine();
			if(question.length() > 200) {
				System.out.println("Your question is too long.");
				}
			else if (this.hasAnsweredQuestion == true) {
				System.out.println("You have already asked a question");
			}
			else {
				Question q = new Question(this.email, question, speaker1);
				hasAnsweredQuestion = true;
				break;
			}
		}
	}
}
