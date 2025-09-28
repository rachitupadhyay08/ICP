package Day2;

public class Missing_Number {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(Missing(nums));
    }

    public static int Missing(int[] nums){
        int n = nums.length;
        int expSum = n*(n+1)/2;
        int actSum = 0;

        for(int i=0; i<n; i++){
            actSum += nums[i];
        }
        return expSum - actSum;
    }
}
