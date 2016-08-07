package kata.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralConverterTest {

	@Test
	public void convert_1() {
		assertEquals(RomanNumeralConverter.convert(1),"I");
	}
}
