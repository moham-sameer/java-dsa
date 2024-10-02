package sharpener.Sort;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int nums[] = {2,3,1,5,4};
        select(nums);
    }
    public static void select(int nums[]){
         int n = nums.length;
         for(int i = 0; i < n; i++){
            int min = i;
             for(int j = i+1;j<n;j++){
                if(nums[j]<nums[min]){
                       min = j;
                }
             }
             int temp = nums[min];
             nums[min] = nums[i];
             nums[i] = temp;
             
         }
         System.out.println(Arrays.toString(nums));
    }
}
