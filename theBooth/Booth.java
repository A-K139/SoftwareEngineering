package theBooth;
import java.util.UUID;

public class Booth {
	static Booth[][] map = new Booth[5][4];
	private String companyName;
	private UUID userID;
	
	public Booth(String companyName, UUID userID, int room, int boothNumber) {
		this.companyName = companyName;
		this.userID = userID;
		map[room-1][boothNumber-1] = this;
	}
	public static Booth[][] getMap(){
		return map;
	}
	public static String getBoothName(int a, int b) {
		return map[a][b].companyName;
	}
	public static UUID getUserID(int a, int b) {
		return map[a][b].userID;
	}
	public static String viewMap() {
		String mapp ="";
		for(int i=0;i<Booth.getMap().length; i++) {
			for(int j =0; j<Booth.getMap()[0].length;j++) {
				mapp += "Booth " + (i+1) + "." + (j+1) + ": " + Booth.getBoothName(i, j);
				mapp += "\n";
			}
		}
		return mapp;
	}
}
