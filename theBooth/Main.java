package theBooth;
import java.util.UUID;
//Only relevant instance attributes to this method are stated in entity classes, and simpler constructor here for sake of simplicity
public class Main {
	public static void main(String[] args) {
		Company company1 = new Company("Google");
		Company company2 = new Company("HSBC");
		
		System.out.println("Console note: initial view of map");
		for(int i =0; i < Booth.getMap().length; i++) {
			for(int j =0; j < Booth.getMap()[0].length; j++) {
				Booth booth = new Booth("Select Booth", new UUID(0L,0L),i+1,j+1);
			}
		}
		company1.chooseBooth();
		System.out.println("Console Log: Google chose a booth\n");
		System.out.println(Booth.viewMap());
		
		company2.chooseBooth();
		System.out.println("Console Log: HSBC chose a booth\n");
		System.out.println(Booth.viewMap());
		
		company1.removeBooth();
		System.out.println("Console Log: Google cancelled their booth\n");
		System.out.println(Booth.viewMap());	
	}
}
