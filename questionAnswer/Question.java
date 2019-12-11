package questionAnswer;

public class Question {
	private String email;
	private String question;
	
	public Question(String email, String question, Speaker speaker1) {
		this.email = email;
		this.question = question;
		speaker1.addQuestion(this);
	}
	public String getQuestion() {
		return this.question;
	}
	public String getEmail() {
		return this.email;
	}
}
	
