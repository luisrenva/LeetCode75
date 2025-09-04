package leetcode.exercises;

import java.util.Arrays;

/*
 * Construct a version comparison function. Given 2 strings, determine if left hand string is earlier, equivalent, or 
 * greater version of a product
 * Example  "1.1.0" vs "1.1.2" would return a result indicating 1.1.0 is earlier than 1.1.2
 */
public class MckessonCampareVersion {

	public static void main(String[] args) {
//		String v1 = "1.11.0";
//		String v2 = "1.1.2";
		String v1 = "1.1.0";
		String v2 = "1.1.2";
		System.out.println(compareVersions(v1, v2));
	}
	
	public static String compareVersions(String v1, String v2) {
		String [] array1 = v1.split("\\.");// now we have [1,11,0]
		String [] array2 = v2.split("\\.");
		
		String numberToConvert1 = String.join("", array1); // "1110"
		
		int number1 = Integer.parseInt(numberToConvert1);
		int number2 = Integer.parseInt(String.join("", array2));

		String response = "";
		
		if (number2 == number1 ) {
			response = number1  + " is equals to:" + number2;
		}
		if (number1 <  number2) {
			response = 	number1  + " is earlier than " + number2;
		}
		
		if (number1 > number2) {
			response = number1  + " is greater than " + number2;
		}
		
		return response;
		
	}

}
