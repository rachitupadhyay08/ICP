package Assignment2;
import java.util.*;

public class Valid_Perfect_Square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Square(num));
    }
    public static boolean Square(int num){
        if(num==1){
            return true;
        }
        long s = 1;
        long e = num;
        while(s<=e){
            long mid = (s+e)/2;
            long sq = mid*mid;
            if(sq == num){
                return true;
            }
            else if(sq < num){
                s = mid +1;
            }
            else{
                e = mid-1;
            }
        }
        return false;
    }  
}
