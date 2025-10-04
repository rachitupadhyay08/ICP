package Assignment7;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        return helper(nums, 0, nums[0], nums[0]);
    }

    private static int helper(int[] nums, int i, int currentSum, int maxSum) {
        if (i == nums.length - 1) return maxSum;
        currentSum = Math.max(nums[i + 1], currentSum + nums[i + 1]);
        maxSum = Math.max(maxSum, currentSum);
        return helper(nums, i + 1, currentSum, maxSum);
    }
}
