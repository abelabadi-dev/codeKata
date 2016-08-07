package kata.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralConverterTest {

	@Test
	public void convert_1_I() {
		assertEquals(RomanNumeralConverter.convert(1),"I");
	}
	
	@Test
	public void convert_2_II() {
		assertEquals(RomanNumeralConverter.convert(2),"II");
	}
	@Test
	public void convert_3_III() {
		assertEquals(RomanNumeralConverter.convert(3),"III");
	}
	@Test
	public void convert_5_V() {
		assertEquals(RomanNumeralConverter.convert(5),"V");
	}
	@Test
	public void convert_6_VI() {
		assertEquals(RomanNumeralConverter.convert(6),"VI");
	}
}
