package Assignment5;
import java.util.*;

public class Non_Overlapping_Intervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};

        System.out.println(Overlap(intervals));
        
    }
    public static int Overlap(int[][] intervals){
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int ans =0;
        int prevStart = intervals[0][0];
        int prevEnd = intervals[0][1];

        for(int i=1; i<intervals.length; i++){
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];
            if(currStart<prevEnd){
                ans++;
                prevStart = Math.max(prevStart,currStart);
                prevEnd = Math.min(prevEnd,currEnd);

            }
            else{
                prevStart=currStart;
                prevEnd=currEnd;
            } 
        }
        return ans;
    }   
}
