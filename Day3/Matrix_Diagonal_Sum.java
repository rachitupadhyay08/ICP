package Day3;

public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(Sum(mat));
    }
    public static int Sum(int[][] mat){
        int n = mat.length;
        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<mat[0].length;j++){
                if(i==j){
                    sum += mat[i][i] + mat[i][n-i-1];
                }
            }
        }
        int common = n/2;
        if(n%2 != 0){
            sum -= mat[common][common];
        }
        return sum;
    }    
}
