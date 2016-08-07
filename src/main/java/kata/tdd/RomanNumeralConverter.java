package kata.tdd;

public class RomanNumeralConverter {

	public static String convert(int number) {

		String str = "";
		
		while(number >= 50) {

			str += "L";
			number -= 50;
		}

		while(number >= 10) {

			str += "X";
			number -= 10;
		}
		while(number >= 9) {

			str += "IX";
			number -= 9;
		}
		while (number >= 5) {

			str += "V";
			number -= 5;
		}
		while (number >= 4) {

			str += "IV";
			number -= 4;
		}
		while(number >= 1){
			str += "I";
			number -= 1;
		}

		return str;
	}

	//
	// public static void main(String[] args){
	// System.out.println(RomanNumeralConverter.convert(6));
	// }
}
