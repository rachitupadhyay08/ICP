package Week1;

import java.util.Arrays;

public class Shuffle_the_Array {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;   
        
        int[] ans = Shuffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] Shuffle(int[] nums,int n){
        int[] result = new int[2*n];
        for(int i=0; i<n;i++){
            result[2*i]=nums[i];
            result[2*i+1]=nums[n+i];
        }
        return result;
    }
}