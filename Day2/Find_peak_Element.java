package Day2;

public class Find_peak_Element {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        System.out.println(Element(nums));
    }
    public static int Element(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = (left + right)/2;
            if(nums[mid] < nums[mid+1]){
                left = mid + 1;
            }
            else{
                right = mid;

            }
        }
        return left;
    }        
}

