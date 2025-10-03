package Assignment6;

import java.util.*;

public class Combinations {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        int[][] ans = Comb(n, k);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] Comb(int n, int k) {
        List<int[]> res = new ArrayList<>();
        dfs(1, n, k, new ArrayList<>(), res);
        return res.toArray(new int[res.size()][]);
    }

    static void dfs(int i, int n, int k, List<Integer> cur, List<int[]> res) {
        if (cur.size() == k) {
            int[] arr = new int[k];
            for (int j = 0; j < k; j++) arr[j] = cur.get(j);
            res.add(arr);
            return;
        }
        if (i > n) return;
        cur.add(i);
        dfs(i + 1, n, k, cur, res);
        cur.remove(cur.size() - 1);
        dfs(i + 1, n, k, cur, res);
    }
}
