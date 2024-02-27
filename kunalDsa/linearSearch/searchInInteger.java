package kunalDsa.linearSearch;

public class searchInInteger {
    public static void main(String[] args) {
        int nums[] = {6,15,27,38,39,100};
     int target = 27;
      System.out.println(search(nums, target));
    }
   public static int search(int nums[],int target){
     if(nums.length == 0){
        return -1;
     }
       for(int index = 0; index<nums.length;index++){
            if(nums[index] == target){
                return index; 
            }
       }
       return -1;
    }
}
