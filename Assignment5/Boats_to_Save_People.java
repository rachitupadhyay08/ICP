package Assignment5;

import java.util.Arrays;

public class Boats_to_Save_People {
    public static void main(String[] args) {
        int[] people={1,2};
        int limit = 3;

        System.out.println(Boats(people, limit));
        
    }

    public static int Boats(int[] people, int limit){
        Arrays.sort(people);
        int n = people.length;
        int i=0;
        int j=n-1;

        int boat=0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                boat++;
                i++;
                j--;
            }
            else{
                j--;
                boat++;
            }
        }
        return boat;
    }  
}
