package Funktionen;
import Tools.CustomMathFunctions;

public class Poisson extends Funktion{

	private float lambda;
	
	public Poisson(String funktion,float lambda) {
		super(funktion);
	    this.lambda = lambda;
	}
	
	public float execute(){
		System.out.println("Operatoreingabe:");
		String operator = sc.next();
		System.out.println("Nummereingabe:");
		int count = sc.nextInt();
		return execute(operator,count);
	}
	
	public float execute(String operator,int count) {
		
		switch(operator) {
		case "=": super.p = equal(count);
				  break;
		case "<": super.p = smaller(count);
				  break;
		case ">": super.p = bigger(count);
				  break;
		case "<=":super.p = smaller(count) + equal(count);
				  break;
		case ">=":super.p = bigger(count) + equal(count);
		  		  break;	  
		}
		return super.p;
	}
	private float equal(int i) {
		
		return (float) ((float) ((Math.pow(lambda,i))/CustomMathFunctions.factorial(i)) * (Math.exp(lambda)));
		
	}
	private float smaller(int count) {
		float tmp=0;
		for(int i=0;i<count;++i) {
			tmp+=equal(i);
		}
		return tmp;
	}
	private float bigger(int count) {
		float tmp=Float.MAX_VALUE;
		for(int i=(int)tmp;i>count;--i) {
			tmp+=equal(i);
		}
		return tmp;
	}


}
