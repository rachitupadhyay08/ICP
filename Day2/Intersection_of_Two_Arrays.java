package Day2;
import java.util.*;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] ans = Inter(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] Inter(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<>();
        int i =0 ,j = 0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                if(result.isEmpty() || result.get(result.size()-1) != nums1[i]){
                    result.add(nums1[i]);
                }
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] ans = new int[result.size()];
        for(int k=0; k<result.size(); k++){
            ans[k] = result.get(k);
        }
        return ans;
    }     
}
