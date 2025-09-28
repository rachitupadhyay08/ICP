package Week1;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};

        System.out.println(Wealth(accounts));

    }
    public static int Wealth(int[][] accounts){
        int ans =0;
        for(int[] query:accounts){
            int total=0;
            for(int i=0; i<query.length; i++){
                total += query[i];
                ans = Math.max(total,ans);
            }    
        }
        return ans;
    }  
}
