package Funktionen;

import java.util.Scanner;

public abstract class Funktion {

	Scanner sc = new Scanner(System.in);
	
	public float p;
	
	private String output;
	
	public Funktion(String funktion) {
		this.output= funktion;
	}
	
	public abstract float execute();
	
	public String toString() {
		return output;
	}
	
}
