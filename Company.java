package theBooth;
import java.util.UUID;
import java.util.Scanner;

public class Company {
	private UUID userID;
	private String companyName;
	
	public Company(String companyName) {
		userID = UUID.randomUUID();
		this.companyName = companyName;
	}
	public void chooseBooth() {
		Scanner scan = new Scanner(System.in);
		System.out.println("This is the current Booths, you can only choose empty booths");
		System.out.println(Booth.viewMap());
		boolean isValid = false;
		
		while(!isValid) {
			System.out.println("Choose room number");
			int roomNo = scan.nextInt();
			System.out.println("Choose table number");
			int boothNo = scan.nextInt();	
		
			if(roomNo > 0 && roomNo < 6 && boothNo > 0 && boothNo <5) {
				if(Booth.getBoothName(roomNo-1,boothNo-1).equals("Select Booth")) {
					Booth booth = new Booth(this.companyName, this.userID, roomNo, boothNo);
					isValid = true;
					System.out.println("You have successfully chosen a booth in room " + roomNo + ", Table " + boothNo  );
				}
			else {
				System.out.println("This booth is not empty");
				}
		}
		else {
			System.out.println("Choose a room between 1-5, and a booth between 1-4");
			}
		}
	}
	public String viewBooth() {
		for(int i =0; i < Booth.getMap().length; i++) {
			for(int j =0; j < Booth.getMap()[0].length; j++) {
				if (this.userID.equals(Booth.getUserID(i, j)))  {
					return ("Room "+ Booth.getBoothName(i,j));
				}	
			}
		}
		return "No booth chosen";	
	}
	public void removeBooth() {
		for(int i =0; i < Booth.getMap().length; i++) {
			for(int j =0; j < Booth.getMap()[0].length; j++) {
				if (this.userID.equals(Booth.getUserID(i, j)))  {
					Booth booth = new Booth("Select Booth", new UUID(0L,0L), i+1, j+1);
					return;
				}
			}
		}
			System.out.println("You have not chosen a booth");
	}
}
	