package kata.tdd;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public static List<Integer> of(int i) {
		
		List<Integer> factors = new ArrayList<>();
		
		for(int divisor = 2;i >1; divisor++){
			for(; i%divisor == 0;i /=divisor){
				factors.add(divisor);
			}
		}

		return factors;

	}

}
