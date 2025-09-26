package Day1;

public class Best_Time_to_Buy_And_Sell_Product {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(Time(prices));
    }
    public static int Time(int[] prices){
        int ans = 0;
        int buy = prices[0];
        for(int i=1; i<prices.length; i++){
            if(buy<prices[i]){
                ans=Math.max(ans, prices[i] - buy );
            }
            else{
                buy=Math.min(buy,prices[i]);
            }
        }
        return ans;
    }
}
