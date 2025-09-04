package leetcode.exercises.cracking.coding.interview;

import java.util.HashSet;
import java.util.Set;

//Implement an algoritm to determine if a string has all unique characters.
//what if you cannot use additional data structure
public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 44 117 132
//		int [] array = new int [] {44,117,132};
//		boolean res = areUniqueValues(array);
		String test = new String ("44,117,132,44");
		boolean res = areUniqueValues(test);
		System.out.println(res);
	}
//	
//	static boolean areUniqueValues(int[] array) {
//		Set <Integer> noDuplicates = new HashSet<Integer>();
//		for (int x=0; x< array.length; x++) {
//			if (!noDuplicates.add(array[x] )) {
//				return false;
//			}
//		}
//		return true;
//	}

	static boolean areUniqueValues(String chain) {
		if (chain.length() == 0) return false;
		
		String [] characters = chain.split(",");
		if (characters[0] == characters[1]) return  false;
		
		//44, 117, 132
		for (int i=0; i < characters.length; i++) {
			for (int j=i +1; j < characters.length; j++) {
				if (characters[i].equals(characters[j]))return false;
			}
		}
		
		
		return true;
		
	}

}
