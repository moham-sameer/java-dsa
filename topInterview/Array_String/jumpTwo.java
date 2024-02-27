package topInterview.Array_String;

public class jumpTwo {
    // in this we find the minimum possible jump to reach the last index
    public static void main(String[] args) {
        int nums[] = {2,4,2,3,7,9};
        int result = Jumps(nums);
        System.out.println("The minimum jump is : "+result);
    }
    public static int Jumps(int nums[]){
        int current = 0;
        int farthest = 0;
        int jump = 0;
    
        for(int i = 0; i < nums.length-1; i++){
            farthest = Math.max(farthest,i+nums[i]);
            if(i==current){
                jump++;
                current = farthest;
            }
        }
        return jump;
    }
}
