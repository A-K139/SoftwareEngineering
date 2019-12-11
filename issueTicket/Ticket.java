package issueTicket;

import java.util.ArrayList;
import java.util.UUID;

public class Ticket {
	private UUID userID;
	private boolean hasEntered;
	private boolean isUser;
	static ArrayList<Ticket> ticketDatabase = new ArrayList<Ticket>();
	
	public Ticket(UUID userID, boolean isUser) {
		this.userID = userID;
		hasEntered = false;
		this.isUser = isUser;
		ticketDatabase.add(this);
	}
	public static void isIDValid(UUID userID) {
		for(int i =0; i < ticketDatabase.size(); i++) {
			if(ticketDatabase.get(i).userID.equals(userID)) {
				if(ticketDatabase.get(i).hasEntered == false) {
					System.out.println("is Valid");
					if(ticketDatabase.get(i).isUser == true)
						ticketDatabase.get(i).hasEntered = true;
					return;
				}
				else {
					System.out.println("Attendee has already entered");
					return;
				}
			}
		}
			System.out.println("Ticket not found");
			return;
	}
}
	
	
	

