package kata.tdd;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public static List<Integer> of(int i) {
		
		List<Integer> factors = new ArrayList<>();
		
		while(i%2 == 0){
			factors.add(2);
			i /=2;
		}

		if(i > 1)
			factors.add(i);
		return factors;

	}
	
	
	
}
