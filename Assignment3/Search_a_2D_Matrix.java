package Assignment3;

public class Search_a_2D_Matrix {
    public static void main(String[] args) {
        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;

        boolean found = Search(mat, target);
        System.out.println(found);
    }
    public static boolean Search(int[][] mat,int target){
        int m = mat[0].length;
        for(int i=0; i<mat.length; i++){
            if(mat[i][0] <= target && target <= mat[i][m-1]){
                return BS(mat[i], m, target);
            }
        }
        return false;
    }
    public static boolean BS(int[] matrix , int m,int target){
        int s = 0;
        int e = m-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(matrix[mid]<target){
                s=mid+1;
            }
            else if(matrix[mid]>target){
                e=mid-1;
            }
            else{
                return true;               
            }
        }
        return false;
    }   
}
