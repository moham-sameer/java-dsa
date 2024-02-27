package kunalDsa.linearSearch;

public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {14,12,5,23,78,19};
        int target = 19;
        System.out.println(search(arr, target, 1, 4));
        
    }
    static int search(int[]arr,int target,int start,int end){
      if(arr.length == 0){
         return -1;
      }
        
        for(int i =start;i<=end;i++){
            if(arr[i]== target){
                return i;
            }
        }
        return -1;
    }

}
