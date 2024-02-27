package topInterview.Array_String;

import java.util.Arrays;

public class majorityElement {
   public static void main(String[] args) {
       int nums [] = {2,3,2};
     int result = major(nums);
     System.out.println(result);
   }

   public static int major(int nums[]){
    int candidate = 0;
    int count = 0;
     for(int i =0; i<nums.length;i++){
        if(count == 0){
            candidate = nums[i];
        } if(candidate == nums[i]){
            count++;
        } else{
            count--;
        }
     }
     return candidate;
   }
}
