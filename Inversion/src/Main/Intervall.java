package Main;

public class Intervall {

	private float linkeGrenze;
	private float rechteGrenze;
				
	public Intervall(float lGrenze,float rGrenze) {
		this.linkeGrenze = lGrenze;
		this.rechteGrenze = rGrenze;
	}
	
	public String toString() {
		return "[ "+linkeGrenze+" ; "+ rechteGrenze+" ]";
	}
	
}
