package Day3;

public class Count_Negative_Number_in_a_sorted_matrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(Negative(grid));
    }
    public static int Negative(int[][] grid){
        int count=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
}
    

