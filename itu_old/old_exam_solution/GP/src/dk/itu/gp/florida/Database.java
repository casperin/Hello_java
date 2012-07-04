package dk.itu.gp.florida;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Database {
	private List<Mammal> mammals = new ArrayList<Mammal>();

	public List<Mammal> getMammals() {
		return mammals;
	}

	public void addMammal(Mammal mammal) {
		mammals.add(mammal);
	}
	
	public Mammal findMammal(String name) {
		for(Mammal mammal: mammals) {
			if(mammal.getName().equals(name)) {
				return mammal;
			}
		}
		throw new MammalNotFoundException(name + " could not be found.");
	}
	
	public void spot(String name) {
		Mammal mammal = findMammal(name);
		mammal.setSightings(mammal.getSightings() + 1);
	}
	
	public void save() {
		try {
			PrintWriter writer = new PrintWriter("mammals.txt");
			for(Mammal mammal : mammals) {
				writer.write(mammal + "\n");
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public int getCount(Class<? extends Mammal> c) {
		int i = 0;
		for(Mammal mammal : mammals) {
			if(mammal.getClass() == c) {
				i++;
			}
		}
		return i;
	}
}
