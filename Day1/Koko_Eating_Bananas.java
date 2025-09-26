package Day1;

public class Koko_Eating_Bananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;

        System.out.println(Speed(piles, h));
    }
    public static int Speed(int[] piles, int h){
        int left=1;
        int right=Integer.MIN_VALUE;

        for(int i=0;i<piles.length;i++){
            if(piles[i]>right){
                right=piles[i];
            }
        }

        int ans = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(isSpeedValid(piles, mid, h)){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid +1;
            }
        }
        return ans;
    }
    
    public static boolean isSpeedValid(int[] piles,int mid,int h){
        int count=0;
        for(int i=0; i<piles.length; i++){
            count += Math.ceil(piles[i]/(double)mid);
        }
        if(count<=h){
            return true;
        }
        return false;
    }
}
