package Day1;

public class CAn_Place_Flowers {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1};
        int n = 1;
        System.out.println(Flowers(arr, n));
    }

    public static boolean Flowers(int[] arr, int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                if((i==0 || arr[i-1]==0) && (i==arr.length-1 || arr[i+1]==0)){
                    arr[i]=1;
                    n--;
                }
            }
        }
        return n<=0; 
    }
}
