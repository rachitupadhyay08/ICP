
// LeetCode 200
package Assignment3;

public class Number_of_Islands {
    public static void main(String[] args) {
        char[][] grid = {
                         {'1','1','1','1','0'},
                         {'1','1','0','1','0'},
                         {'1','1','0','0','0'},
                         {'0','0','0','0','0'}};
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j] == '1') {
                    search(grid, i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void search(char[][] mtx, int i, int j) {
        if (i < 0 || j < 0 || i == mtx.length || j == mtx[0].length){
            return;
        }
        if (mtx[i][j] != '1'){
            return;
        }
        mtx[i][j] = '0';

        search(mtx, i - 1, j);
        search(mtx, i, j - 1);
        search(mtx, i + 1, j);
        search(mtx, i, j + 1);
        
    }
}
