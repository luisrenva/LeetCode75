package leetcode.exercises.cracking.coding.interview;

//Write a method to replace all spaces in a strinng with %20
//Example "Mr Jhon Smith    "
public class URLIfy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = replaceSpaces("Mr Jhon Smith    ");
		System.out.println("Result: "+res);

	}
	private static String replaceSpaces(String text) {
		String res = text.replace(" ", "%20");
		return res;
	}

}
