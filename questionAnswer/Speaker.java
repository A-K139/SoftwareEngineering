package questionAnswer;
import java.util.ArrayList;
import java.util.Scanner;

public class Speaker {
	private ArrayList<Question> database;
	static Scanner scan = new Scanner(System.in);
	
	public Speaker() {
		this.database = new ArrayList<Question>();
	}
	public String getQuestions() {
		String question = "";
		for(int i =0; i < database.size(); i++) {
			question += (i+1) + ". " + this.database.get(i).getQuestion() + "\n";
			question += database.get(i).getEmail() + "\n" + "\n";
		}
		question+="\n"+ "---------------------";
		return question;
	}
	public void removeQuestion() {
		System.out.println("Which question do you want to remove?");
		this.database.remove(scan.nextInt()-1);
	}
	public void addQuestion(Question question) {
		this.database.add(question);
	}
}
