package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class Find_all_Anagrams_in_a_String {
    public static void main(String[] args) {
        String  s = "cbaebabacd";
        String  p = "abc";
        
        List<Integer> ans = find(s, p);
        System.out.println(ans); 
    }
    public static List<Integer> find(String s, String p) {
        int n = s.length();
        int m = p.length();

        List<Integer> li = new ArrayList<>();

        int[] mask = getHash(p, 0, m);

        int left = 0;
        int right = m;

        while (right <= n) {
            int[] cur = getHash(s, left, right);
            boolean found = true;
            for (int i = 0; i < 26; i++) {
                if (mask[i] != cur[i])
                    found = false;
            }
            if (found)
                li.add(left);
            left++;
            right++;
        }
        return li;
    }
    public static int[] getHash(String s, int si, int ei) {
        int[] hash = new int[26];

        for (int i = si; i < ei; i++) {
            hash[s.charAt(i) - 'a']++;
        }
        return hash;
    }
}
