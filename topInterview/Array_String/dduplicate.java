package topInterview.Array_String;

import java.util.Arrays;

public class dduplicate {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,1,2,2,2,2,3,3};
        int result = ddup(nums);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
    }
    public static int ddup(int[] nums){
        int count = 2;
        for(int i = 2; i<nums.length;i++){
            if( nums[count-2]!=nums[i]){
                
                nums[count] = nums[i];
                count++;
            }
        }
        return count ;
    }
}
