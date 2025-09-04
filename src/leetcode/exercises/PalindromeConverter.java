package leetcode.exercises;

public class PalindromeConverter {

	public static void main(String[] args) {
		convert("mad&");

	}
	
	static String convert(String inputStr) {
		String newString = inputStr.replaceAll("[^a-zA-Z0-9]", "");
        String [] array = newString.split(""); //mad

        StringBuilder response = new StringBuilder(newString);
        

        for (int i = array.length -1; i >= 0; i--) {
        	//dam
        	response = response.append(array[i]);
		}

		return response.toString();
	}

}
//Mckesson exercise


//class Solution {
//    public boolean isPalindrome(String s) {
//        String newString = s.replaceAll("[^a-zA-Z0-9]", "");
//        String [] array = newString.split("");
//
//        
//        
//    }
//}