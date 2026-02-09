package leetcode.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubsequence300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[] {10, 9, 2, 5, 3, 7, 101, 18};
		int res=  lengthOfLIS(array);
		System.out.println(res);

	}
	
	public static int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num: nums) {
            if (list.isEmpty() || num > list.get(list.size()-1)) {
                list.add(num);
            } else {
                int k = Collections.binarySearch(list, num);
                if (k < 0) {
                    k = - (k+1);
                }
                list.set(k, num);
            }
        }
        return list.size();
        
    }

}