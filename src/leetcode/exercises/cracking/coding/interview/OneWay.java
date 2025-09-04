package leetcode.exercises.cracking.coding.interview;


//There are three types of edits that can be performed on strings: insert a character, remove
// a character, or replace a character. Given two strings, write a function to check if
// they are one edit (or zero edits) way.
//Example
// pale, ple -> true
// pales, pale -> true
// pale, bale -> true
// pale, bake -> false
public class OneWay {
	
	private static void main(String ... args) {
		// TODO Auto-generated method stub
		boolean res = isEditsValid("pale", "ple");
		System.out.println("Result: "+res);
	}
	
	static boolean isEditsValid (String one , String two) {
		
//		if (isInsert(one, two) || isRemove(one, two) || isReplace(one, two) ) {
//			return true;
//		}
		return false;
		
	}
	
	static boolean isInsert(String stringOne, String stringTwo) {// 4    4,3
//		if (stringOne.length() == stringTwo.length() || stringOne.length() -1 <= stringTwo.length()) {
//			return false;
//		}
		
		return true;
		
	}
		
		
		
		
//	}
	
}