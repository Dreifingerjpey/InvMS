package Tools;
import java.security.SecureRandom;

public class RandomFloatGenerator {

	private SecureRandom sr = new SecureRandom();
	
	public float nextFloat(){	
		return sr.nextFloat();
	}
	
}
