package Day2;
import java.util.*;

public class Range_Addition {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0};
        int[][] updates = {{1,3,2},{2,4,3},{0,2,-2}};

        System.out.println(Arrays.toString(DAT(nums, updates)));
    }

    public static int[] DAT(int[] nums, int[][] updates){
        for(int[] query : updates){
            int start = query[0];
            int end = query[1];
            int val = query[2];

            nums[start] += val;
            if(end+1 < nums.length){
                nums[end+1] -= val; 
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                nums[i] = nums[i] + 0;
            }
            else{
                nums[i] = nums[i] + nums[i-1];
            }
        }
        return nums;
    }
    
}
