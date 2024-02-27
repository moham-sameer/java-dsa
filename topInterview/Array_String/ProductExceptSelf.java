package topInterview.Array_String;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
         int nums[] = {1,2,3,4};
         int result[] = product(nums);
         System.out.println(Arrays.toString(result));
    }

    public static int[] product(int[] nums){
       int n = nums.length;
       int right[] = new int[n];
       int left[] = new int[n];
       int result[] = new int[n];
       left[0] = 1;
       for(int i = 1; i<n ;i++){
        left[i] = left[i-1] * nums[i-1];
       }
       right[n-1] = 1;
       for(int i = n-2;i>=0;i--){
         right[i] = right[i+1] * nums[i+1];
       }

       for(int i = 0;i<n;i++){
        result[i] = right[i]*left[i];
       }




        return result;
    }
}
