package leetcode.exercises;

public class ReverseString {

	public static void main(String[] args) {
		String res =reverse("Luis Renteria");
		System.out.println(res);

	}
	
	public static String reverse(String chain) {
		StringBuilder res = new StringBuilder(chain).reverse();
		return res.toString();
	}

}
