package leetcode.exercises;

import java.util.*;

public class LongestRepeatingCharacteReplacement424 {

	public static void main(String[] args) {
		int res =characterReplacement("AABABBA", 1);
		System.out.println(res);

	}
	
	public static int characterReplacement(String s, int k) {
        if (s== null || s.length() ==0) return 0;

        int left =0;
        int right =0;
        int maxResponse = 0;
        int maxRepeatCount =0;
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();


        String [] array = s.split("");

        while (right < array.length) {
            String curr = array[right];

            if (set.add(curr)) { // if continues values
                //will calculate the frequency so far and add it to map
                maxResponse = Math.max(maxResponse , right - left +1);
                map.put(curr, maxResponse);   // A=1
                right++;
            } else { // if we find a different value
                set.remove(array[left]);// remove the A
                left++;
            }
            
//            map.put(curr, map.getOrDefault(curr, 0)+1);
//
//            maxRepeatCount = Math.max(maxRepeatCount, map.get(curr));
//            int nonrepeat = (right - left + 1 ) - maxRepeatCount;
//
//            if(nonrepeat > k){
//            	map.put(array[left], map.get(array[left]) - 1);
//                left++;
//            }
//
//            maxResponse = Math.max(maxResponse, right - left + 1);
            
            
            

        }

        return maxResponse;
	}
	
}