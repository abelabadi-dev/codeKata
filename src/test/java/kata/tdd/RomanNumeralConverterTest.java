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
	public void convert_4_IV() {
		assertEquals(RomanNumeralConverter.convert(4),"IV");
	}
	@Test
	public void convert_5_V() {
		assertEquals(RomanNumeralConverter.convert(5),"V");
	}
	@Test
	public void convert_6_VI() {
		assertEquals(RomanNumeralConverter.convert(6),"VI");
	}
	@Test
	public void convert_9_IX() {
		assertEquals(RomanNumeralConverter.convert(9),"IX");
	}
	@Test
	public void convert_10_X() {
		assertEquals(RomanNumeralConverter.convert(10),"X");
	}
	@Test
	public void convert_11_XI() {
		assertEquals(RomanNumeralConverter.convert(11),"XI");
	}
	@Test
	public void convert_20_XX() {
		assertEquals(RomanNumeralConverter.convert(20),"XX");
	}
	@Test
	public void convert_21_XXI() {
		assertEquals(RomanNumeralConverter.convert(21),"XXI");
	}
	@Test
	public void convert_50_L() {
		assertEquals(RomanNumeralConverter.convert(50),"L");
	}
	@Test
	public void convert_51_LI() {
		assertEquals(RomanNumeralConverter.convert(51),"LI");
	}
	@Test
	public void convert_100_C() {
		assertEquals(RomanNumeralConverter.convert(100),"C");
	}
	
}
