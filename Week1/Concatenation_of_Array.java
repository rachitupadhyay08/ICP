package Week1;

import java.util.Arrays;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,1};

        int[] ans = Concat(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] Concat(int[] nums){
        int[] result = new int[2*nums.length];
        int k = nums.length;
        for(int i=0; i<nums.length; i++){
            result[i] = nums[i];
            result[k+i] = nums[i];
        }
        return result;
    }
}
