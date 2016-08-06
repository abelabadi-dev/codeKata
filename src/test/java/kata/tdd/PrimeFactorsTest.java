package kata.tdd;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeFactorsTest {

	@Test
	public void of_1_is__empty(){
		assertEquals(PrimeFactors.of(1), new ArrayList<Integer>());
	}
	
	@Test
	public void of_2_is_2()  {
		
	}
	
	
}
