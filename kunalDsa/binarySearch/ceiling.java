package kunalDsa.binarySearch;
public class ceiling {
   public static void main(String[] args) {
     // ! Search either the target one and if it's not available then the next greater.
      int [] arr = {2,4,6,8,12,14,15,16,18};
      int target = 15;
      int ans = search(arr, target);
      System.out.println(ans);
   } 
   public static int search(int[]arr,int target){
       int start = 0;
       int end = arr.length - 1;
       while(start <= end){
        int mid = (start + end)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid]<target){
            start =  mid + 1;
        }else{
            end = mid - 1;
        }
       }
       return start;
   }
}
