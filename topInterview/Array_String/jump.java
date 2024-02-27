package topInterview.Array_String;

public class jump {
    public static void main(String[] args) {
        int nums[] = {2,0,1,1};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int index = nums.length-1;
        for(int i = index; i >= 0; i--){
            if(i+nums[i] >= index){
                index = i;
            } 
        }
        if(index==0) return true;
         else return false;
    }
}
