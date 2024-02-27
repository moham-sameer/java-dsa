package kunalDsa.linearSearch;

import java.util.Arrays;

public class evenDigits {
    public static void main(String[] args) {
     // count the even no. of elements in the array below:-
        int[] arr = {12,123,34,5,123,34,9,9878,1,12,897,7263};
        int ans = findNumbers(arr);
        System.out.println(ans);
        
    }
    public static int findNumbers(int[] nums){
            int count = 0;
            for(int numbers:nums){
                if(even(numbers)){
                     count++;
                }
            }
            return count;
    }
    public static boolean even(int num){
            int noOfDigits = digit(num);
            // if(noOfDigits % 2 == 0){
            //     return true;
            // }
            // return false;
            return noOfDigits % 2 == 0;
        
    }
    public static int digit(int num){
        int count = 0;
        
        while(num>0){
               count++;
               num = num / 10;
        }
        return count;
        

    }
}
