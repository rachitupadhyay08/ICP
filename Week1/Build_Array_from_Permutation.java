package Week1;

import java.util.Arrays;

public class Build_Array_from_Permutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};

        int[] ans = Build(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] Build(int[] nums){
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            result[i] = nums[nums[i]];
        }
        return result;
    }  
}
