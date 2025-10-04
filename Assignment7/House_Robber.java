package Assignment7;

public class House_Robber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        return helper(nums, 0);
    }

    private static int helper(int[] nums, int i) {
        if (i >= nums.length) return 0;
        return Math.max(nums[i] + helper(nums, i + 2), helper(nums, i + 1));
    }
}
