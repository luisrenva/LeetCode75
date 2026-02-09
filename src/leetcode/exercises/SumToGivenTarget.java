package leetcode.exercises;


//Find the number of distinct pairs in an array that sum to a given target.
public class SumToGivenTarget {

	public static void main(String[] args) {
		int[] res = calculate(new int[] {4, 5, 8, 2, 9}, 10);
		System.out.println("Numbers that math the target: "+res[0] + ": "+ res[1]);
	}
	
	public static int[] calculate(int[] nums, int target) {
		int [] res = new int[2];
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums.length; j++) {
				if (i == j) continue;
				if(nums[i] + nums[j] == target) {
					res[0] =  nums[i];
					res[1] = nums[j];
					break;
				}
				
			}
			
		}
		
		return res;
		
	}

}
