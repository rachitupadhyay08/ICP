package Assignment5;
import java.util.*;

public class Queue_Reconstruction_by_Height {
    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};     
        int[][] ans = Queue(people);

        for(int[] p : ans){
            System.out.print("[" + p[0] + "," + p[1] + "] ");
        }
    }

    public static int[][] Queue(int[][] people){
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });

        List<int[]> result = new LinkedList<>();
        for(int[] p : people){
            result.add(p[1], p);
        }

        return result.toArray(new int[people.length][]);
    }
}
