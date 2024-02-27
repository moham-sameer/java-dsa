package topInterview.Array_String;

public class removeElements {
    public static void main(String[] args) {
        int[] nums= {1,3,2,3,4,3,2,8};
        int val = 3;
        System.out.println(removeElement(nums, val));         
    }
       public static int removeElement(int nums[], int val) {
            int count = 0;
            for(int i =0; i<nums.length;i++){
              if(nums[i]!=val){
                  nums[count] = nums[i];
                  count++;
              } 
            }
            return count;    
        }
    
}
