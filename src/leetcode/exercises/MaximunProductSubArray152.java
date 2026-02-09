package leetcode.exercises;

public class MaximunProductSubArray152 {

	public static void main(String[] args) {
		int [] nums = new int [] {-2,3,-4};
		int res =maxProduct(nums);
		System.out.println("Res: "+res);

	}
	
    public static int maxProduct(int[] nums) {
        if (nums.length == 0 || nums == null) return 0;

        int maxProduct = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int tempMax = Math.max(nums[i], Math.max(currMax * nums[i], currMin * nums[i]));
            int tempMin = Math.min(nums[i], Math.min(currMax * nums[i], currMin * nums[i]));
            currMax = tempMax;
            currMin = tempMin;
            maxProduct = Math.max(maxProduct, currMax);
        }
        return maxProduct;
    }

}