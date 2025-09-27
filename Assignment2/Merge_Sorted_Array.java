package Assignment2;
import java.util.*;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

        Merge(nums1, nums2, m, n);
        System.out.println(Arrays.toString(nums1));

    }
    public static void Merge(int[] nums1, int[] nums2,int m, int n){
        while(n-1 >= 0 && m-1 >= 0){
            if(nums2[n-1] > nums1[m-1]){
                nums1[m+n-1] = nums2[n-1];
                n--;
            }
            else{
                nums1[m+n-1] = nums1[m-1];
                m--;
            }
        }
        
        while(n>0){
            nums1[m+n-1] = nums2[n-1];
            n--;
        }
    }
}
