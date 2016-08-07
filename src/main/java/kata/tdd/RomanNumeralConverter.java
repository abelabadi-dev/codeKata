package kata.tdd;

public class RomanNumeralConverter {

	public static String convert(int number) {
		
		return new String(new char[number]).replace("\0", "I");
	}

}
