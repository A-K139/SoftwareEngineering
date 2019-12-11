package issueTicket;
import java.util.UUID;

public class Company {
	private UUID userID;
	
	public Company() {
		userID = UUID.randomUUID();
	}
	public UUID getUserID() {
		return userID;
	}
	public void buyTicket() {
		Ticket ticket = new Ticket(userID, false);
	}
}
