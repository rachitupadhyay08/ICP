package Assignment1;
import java.util.*;

public class First_and_Last_Element_in_an_SortedArray {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        
        int[] ans = Ans(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] Ans(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int[] result={-1,-1};
        while(left<=right){
            int mid = (right + left)/2;
            if(arr[mid] > target){
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                result[0]=mid;
                right=mid-1;
            }
        }
        left=0;
        right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid] > target){
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                result[1]=mid;
                left=mid+1;
            }
        }
        return result;
    }

}
