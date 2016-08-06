package kata.tdd;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public static List<Integer> of(int i) {
		
		List<Integer> factors = new ArrayList<>();
		
		if(i == 1)
			return factors;
		
		factors.add(i);
		return factors;
	}
	
	
	
}
