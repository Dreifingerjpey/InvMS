
public class InversionMain {

	public static void main (String[] args) {
		
		 String funktion = "x+1";
		
		 Funktion f 		 =	new Gauss(funktion);
		 SuchAlgorithmus s	 =	new Schwarmverfahren();
		 Ergebnis ergebnis  =	s.execute();
		 
		 System.out.println("F�r die Funktion: "+f.toString()+" wurde Berechnet:\n"+ergebnis.toString());
		
	}
	
}
