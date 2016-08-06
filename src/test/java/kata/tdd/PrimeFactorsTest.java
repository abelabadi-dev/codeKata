package kata.tdd;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class PrimeFactorsTest {

	@Test
	public void of_1_is__empty(){
		assertEquals(PrimeFactors.of(1), new ArrayList<Integer>());
	}
	
	@Test
	public void of_2_is_2()  {
		assertEquals(PrimeFactors.of(2),new ArrayList<Integer>(Arrays.asList(2)));
	}
	
	@Test
	public void of_3_is_3() {
		assertEquals(PrimeFactors.of(3),new ArrayList<Integer>(Arrays.asList(3)));
	}
}
