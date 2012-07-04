package dk.itu.gp.florida;

public class FloridaTest {

	public static void main(String[] args) {
		
		Database database = new Database();
		database.addMammal(new Manatee("Bum"));
		database.addMammal(new SeaLion("Hej"));
		database.addMammal(new Manatee("Harly"));
		
		database.spot("Bum");
		database.spot("Bum");
		System.out.println("Manatees in database: " + database.getCount(Manatee.class));
		database.save();
		
		System.out.println("All mammals in database speak:");
		for(Mammal m : database.getMammals()) {
			System.out.println(m.speak());
		}
	}
	

}
