
public class Ergebnis {

	private Intervall i;
	private float Sicherheit;
	private int iterationen;
	private float Laufzeit;
	
	public Ergebnis(Intervall i) {
		this.i = i;
	}
	
	public String toString() {
		
		return "Das Minimum wird im Intervall "+i.toString()+" vermutet";
	
	}
}
