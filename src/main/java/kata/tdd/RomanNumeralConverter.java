package kata.tdd;

public class RomanNumeralConverter {

	public static String convert(int number) {

		String str = "";

		while(number >= 10) {

			str += "X";
			number -= 10;
		}

		if (number >= 5) {

			str = "V";
			number -= 5;
		}

		return str + new String(new char[number]).replace("\0", "I");
	}

	//
	// public static void main(String[] args){
	// System.out.println(RomanNumeralConverter.convert(6));
	// }
}
