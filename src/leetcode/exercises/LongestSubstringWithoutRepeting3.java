package leetcode.exercises;

import java.util.*;

public class LongestSubstringWithoutRepeting3 {

	public static void main(String[] args) {
		//aab
		int res = lengthOfLongestSubstring("abcabcbb");
		System.out.println("Response: " + res);
	}

	public static int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0 || s.length() > 50000)
			return 0;

		String[] array = s.split("");

		// to pointers , left and righ to move the window
		int left = 0;
		int right = 0;
		int maxLength = 0;
		// Map to store the no duplicates strings
		Set<String> set = new HashSet<>(); // to calculate duplicates

		while (right < array.length) {
			String current = array[right];
			
            if(set.add(current)) {
				maxLength = Math.max(maxLength, right - left + 1);
				right++;
			} else {
				set.remove(array[left]);
				left++;
			}
			
		}
		return maxLength;


		
	}

}