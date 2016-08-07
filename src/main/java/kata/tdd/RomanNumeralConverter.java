package kata.tdd;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumeralConverter {
	
	
	private static Map<Integer,String> lookup; 
	static{
		lookup = new TreeMap<>(Collections.reverseOrder());
		lookup.put(50, "L");
		lookup.put(10, "X");
		lookup.put(9, "IX");
		lookup.put(5, "V");
		lookup.put(4, "IV");
		lookup.put(1, "I");
	}

	public static String convert(int number) {

		String str = "";
		
		
		for(Integer key : lookup.keySet()){
			
			String value = lookup.get(key);
			System.out.println("key: "+key+" Value: "+value);
			while(number >= key) {

				str += value;
				number -= key;
			}
		}

		return str;
	}

	
//	 public static void main(String[] args){
//	 System.out.println(RomanNumeralConverter.convert(50));
//	 }
}
