package topInterview.Array_String;

public class Practice{
  public static void main(String[] args) {
    int nums[] = {7,1,3,4,6};
    int result = stocks(nums);
    System.out.println(result);
  }
  public static int stocks(int nums[]){
    int Max = 0;
    int Min = nums[0];
    for(int i = 0;i<nums.length;i++){
      Min = Math.min(Min,nums[i]);
      int diff = nums[i] - Min;
      Max = Math.max(Max,diff);
    }
    return Max;
  }
}