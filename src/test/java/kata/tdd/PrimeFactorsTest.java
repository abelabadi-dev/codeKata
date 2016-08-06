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
	
	@Test
	public void of_4_is_2_2(){
		assertEquals(PrimeFactors.of(4),new ArrayList<Integer>(Arrays.asList(2,2)));
	}
	@Test
	public void of_5_is_5() {
		assertEquals(PrimeFactors.of(5),new ArrayList<Integer>(Arrays.asList(5)));
	}
	
	@Test
	public void of_6_is_2_3()  {
		assertEquals(PrimeFactors.of(6),new ArrayList<Integer>(Arrays.asList(2,3)));
	}
	
	@Test
	public void of_8_is_2_4() {
		assertEquals(PrimeFactors.of(8),new ArrayList<Integer>(Arrays.asList(2,2,2)));
	}
	
	@Test
	public void of_9_is_3() {
		assertEquals(PrimeFactors.of(9),new ArrayList<Integer>(Arrays.asList(3,3)));
	}
	
	@Test
	public void of_100_is_2_2_5_5()  {
		assertEquals(PrimeFactors.of(100),new ArrayList<Integer>(Arrays.asList(2,2,5,5)));
	}
}
