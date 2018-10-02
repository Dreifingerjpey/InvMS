
public abstract class Funktion {

	private float x;
	private float y;
	
	private String output;
	
	public Funktion(String funktion) {
		this.output= funktion;
	}
	
	public abstract float execute(float x);
	
	public String toString() {
		return output;
	}
	
}
