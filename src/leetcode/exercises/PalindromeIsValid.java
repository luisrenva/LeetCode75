package leetcode.exercises;

//Implement a method to determine if a string is a palindrome.
public class PalindromeIsValid {

	public static void main(String[] args) {
		//madam, error
		boolean res = isPalindrome("error");
		System.out.println(res);
	}
	
	private static boolean isPalindrome(String value) {
		String compareValue = new StringBuilder(value).reverse().toString();
		return value.equals(compareValue);
	}

}
