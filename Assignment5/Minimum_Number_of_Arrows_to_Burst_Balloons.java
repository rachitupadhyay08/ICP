package Assignment5;
import java.util.*;

public class Minimum_Number_of_Arrows_to_Burst_Balloons {
    public static void main(String[] args) {
        int[][] points={{10,16},{2,8},{1,6},{7,12}};
        System.out.println(Arrows(points));
    }
    public static int Arrows(int[][] points){
        Arrays.sort(points,(a,b) -> Integer.compare(a[0],b[0]));
        int arrows = 1;
        int prevStart = points[0][0];
        int prevEnd = points[0][1];

        for(int i=1; i<points.length;i++){
            int currStart = points[i][0];
            int currEnd = points[i][1];
            if(currStart>prevEnd){
                arrows++;
                prevStart=currStart;
                prevEnd=currEnd;

            }
            else{
                prevStart = Math.max(prevStart,currStart);
                prevEnd = Math.min(prevEnd,currEnd);
            }
        }
        return arrows;
    }  
}
