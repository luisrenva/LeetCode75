package leetcode.exercises.cracking.coding.interview;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i.e("abc", "bc8") false, true("abc", "bca")
		boolean res = isPermutation("abc", "bc8");
		System.out.println("The string is permutation: "+res);

	}
	
	static boolean isPermutation(String string1, String string2) {
		String [] secondChain = string2.split("");
		if (string1.length() != string2.length()) return false;
		
		for (int i =0; i< string1.length(); i ++) {
			if (!(string1.contains(secondChain[i]))) {
				return false;
			}
			
		}
		return true;
	}

}
