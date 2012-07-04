package dk.itu.gp.florida;

@SuppressWarnings("serial")
public class MammalNotFoundException extends RuntimeException {

	public MammalNotFoundException() {
		super();
	}
	
	public MammalNotFoundException(String str) {
		super(str);
	}
}
