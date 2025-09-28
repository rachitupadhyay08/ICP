package Week1;

import java.util.Arrays;

public class Running_Sum_of_1D_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        int[] ans = Sum(nums);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] Sum(int[] nums){
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i==0){
                result[i] = nums[i];
            }
            else{
                int k=0;
                for(int j=i;j>=0;j--){
                    k += nums[j];
                    result[i] = k;
                }
            }
        }
        return result;
    }
    
}
