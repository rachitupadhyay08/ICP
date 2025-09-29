package Assignment3;
import java.util.*;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        int[] ans = Spiral(mat);

        System.out.println(Arrays.toString(ans));
    }
    public static int[] Spiral(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int minc = 0;
        int minr = 0;
        int maxc = m-1;
        int maxr = n-1;
        int te = m*n;
        int c = 0;

        List<Integer> ls = new ArrayList<>();

        while(c<te){
            for(int i=minc; i<=maxc && c<te; i++){
                ls.add(mat[minr][i]);
                c++;
            }
            minr++;

            for(int i=minr; i<=maxr && c<te; i++){
                ls.add(mat[i][maxc]);
                c++;
            }
            maxc--;

            for(int i=maxc; i>=minc && c<te; i--){
                ls.add(mat[maxr][i]);
                c++;
            }
            maxr--;

            for(int i=maxr; i>=minr && c<te; i--){
                ls.add(mat[i][minc]);
                c++;
            }
            minc++;
        }

        int[] res = new int[ls.size()];
        for(int i=0; i<ls.size(); i++){
            res[i] = ls.get(i);
        }
        return res;
    }
    
}
