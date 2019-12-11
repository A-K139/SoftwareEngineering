package issueTicket;
import java.util.UUID;
import java.util.UUID;

public class Attendee {
	private UUID userID;
	
	public Attendee() {
		userID = UUID.randomUUID();
	}
	public UUID getUserID() {
		return userID;
	}
	public void buyTicket() {
		Ticket ticket = new Ticket(userID, true);	
	}
}
