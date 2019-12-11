package issueTicket;
//Only relevant instance attributes to this method are stated in entity classes, and simpler constructor here for sake of simplicity

public class Main {
	public static void main(String[] args) {
		Attendee attendee1 = new Attendee();
		Attendee attendee2 = new Attendee();
		Company company1 = new Company();
		
		System.out.println("Console Log: Attendee 1 bought ticket\n");
		attendee1.buyTicket();
		company1.buyTicket();
		System.out.println("Console Log: Company 1 acquired ticket\n");
		
		System.out.println("Console Log: Checking if Attendee 1 has a valid ticket:\n");
		Ticket.isIDValid(attendee1.getUserID());
		System.out.println("Console Log: Checking if Attendee 1 has a valid ticket:\n");
		Ticket.isIDValid(attendee1.getUserID());
		System.out.println("Console Log: Checking if Attendee 2 has a valid ticket:\n");
		Ticket.isIDValid(attendee2.getUserID());
		System.out.println("Console Log: Checking if Company 1 has a valid ticket:\n");
		Ticket.isIDValid(company1.getUserID());
		System.out.println("Console Log: Checking if Attendee 1 has a valid ticket:\n");
		Ticket.isIDValid(company1.getUserID());
	}
}

