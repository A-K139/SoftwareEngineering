package questionAnswer;
//Only relevant instance attributes to this method are stated in entity classes, and simpler constructor here for sake of simplicity
public class Main {
	public static void main(String[] args) {
		//Creating 2 speakers
		Speaker speaker1 = new Speaker();
		Speaker speaker2 = new Speaker();
		//Creating 2 attendees
		Attendee attendee1 = new Attendee("attendee1@gmail.com");
		Attendee attendee2 = new Attendee("attendee2@gmail.com");
		Attendee attendee3 = new Attendee("attendee3@gmail.com");
		
		attendee1.addQuestion(speaker1); 
		System.out.println("Console note: attendee 1 added question to speaker1\n");
		attendee2.addQuestion(speaker1);
		
		System.out.println("Console note: attendee 2 added question to speaker1\n");
		attendee3.addQuestion(speaker2);
		
		System.out.println("Console note: attendee 3 added question to speaker2\n");
		System.out.println("Console note: Speaker 1 list of questions:\n");
		
		System.out.println(speaker1.getQuestions());
		speaker1.removeQuestion();
		System.out.println("Console note: Speaker 1 removed question 1\n");
		
		System.out.println("Console note: Speaker 1 list of questions:\n");
		System.out.println(speaker1.getQuestions());
		
		System.out.println("Console note: Speaker 2 list of questions:\n");
		System.out.println(speaker2.getQuestions());

	}
}
