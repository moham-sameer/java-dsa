package topInterview.Array_String;

public class duplicate {
    public static void main(String[] args) {
        // duplicate removing algorithm used in it;
        int nums[] = {1,2,3,3,4,5,5,6,6,7};
        // int nums2[] = {};
    //    dupL(nums);
       System.out.println(dupL(nums));
    }
    public static int dupL(int[] nums){

            int count = 1;
        for(int i = 1; i<nums.length;i++){
           if(nums[i]!= nums[i-1]){
              nums[count] = nums[i];
              count++;

           }
        }
        return count;
    }
}
