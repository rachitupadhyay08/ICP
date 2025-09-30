package Assignment4;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(Longest(s));
    }   

    public static int Longest(String s){
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            boolean[] seen = new boolean[256];
            for(int j=i; j<s.length(); j++){
                char c = s.charAt(j);
                if(seen[c]) break;
                seen[c] = true;
                ans = Math.max(ans,j-i+1);
            }
        }
        return ans;   
    }
}
