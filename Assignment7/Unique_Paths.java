package Assignment7;

public class Unique_Paths {
    public static void main(String[] args) {
        int m = 3, n = 7;
        System.out.println(uniquePaths(m, n));
    }

    public static int uniquePaths(int m, int n) {
        return helper(0, 0, m, n);
    }

    private static int helper(int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1) return 1;
        if (i >= m || j >= n) return 0;
        return helper(i + 1, j, m, n) + helper(i, j + 1, m, n);
    }
}