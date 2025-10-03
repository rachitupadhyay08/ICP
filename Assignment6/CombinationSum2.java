package Assignment6;

import java.util.*;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        int[][] ans = Comb(candidates, target);
        print2D(ans);
    }

    public static int[][] Comb(int[] nums, int target) {
        Arrays.sort(nums);
        List<int[]> res = new ArrayList<>();
        dfs(nums, target, 0, new ArrayList<>(), res);
        return res.toArray(new int[res.size()][]);
    }

    public static void dfs(int[] nums, int target, int idx, List<Integer> cur, List<int[]> res) {
        if (target == 0) {
            int[] arr = new int[cur.size()];
            for (int j = 0; j < cur.size(); j++) arr[j] = cur.get(j);
            res.add(arr);
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) continue;
            if (nums[i] > target) break;
            cur.add(nums[i]);
            dfs(nums, target - nums[i], i + 1, cur, res);
            cur.remove(cur.size() - 1);
        }
    }

    public static void print2D(int[][] arr) {
        System.out.println("[");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("]");
    }
}
