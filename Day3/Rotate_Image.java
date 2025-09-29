package Day3;

public class Rotate_Image {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}}; 

        Rotate_img(matrix);
        for(int i=0; i<matrix.length; i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }

    }
    public static void Rotate_img(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i<j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        int n = matrix.length;
        for(int row=0; row<matrix.length; row++){

            int i=0;
            int j=n-1;
            while(i<j){
                int temp = matrix[row][i];
                matrix[row][i] = matrix[row][j];
                matrix[row][j] = temp;
                i++;
                j--;
            }            
        }
    }   
}
