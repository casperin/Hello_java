package dk.itu.gp.florida;

public class Mammal {
	public String speak() {
		throw new RuntimeException("Not implemented");
	}
	
	private String name;
	private int sightings;
	
	public int getSightings() {
		return sightings;
	}

	public void setSightings(int sightings) {
		this.sightings = sightings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {	
		this.name = name;
	}

	public Mammal(String name) {
		this.name = name;
		this.sightings = 1;
	}

	@Override
	public String toString() {
		return name + ": " + name + ", sightings: " + sightings;
	}
}
