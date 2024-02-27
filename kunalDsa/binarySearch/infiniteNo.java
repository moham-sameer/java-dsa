package kunalDsa.binarySearch;

public class infiniteNo {
    public static void main(String[] args) {
        // ! This algorithm is to find no. in infinite no. of arrays...
        int[] arr = {2,4,5,6,7,8,9,12,15,46,78,89,90,99,100};
        int target = 100;
        int result = ans(arr, target);
        System.out.println(result);
    }
    public static int ans(int[]arr,int target){
       int start = 0;
       int end = 1;

       while(target>arr[end]){
        
              int temp = end + 1;
                end = end + (end-start+1)*2; // ? here the formula is end - (start -1);
                start = temp;
           
       }
       return search(arr, target, start, end);
    }
    public static int search(int arr[],int target,int start,int end){
        
        while(start<=end){
            int mid = (start + end)/2;
         
         if(target>arr[mid]){
             start = mid + 1;
 
         }else if(target<arr[mid]){
             end = mid - 1;
         } else{
             return mid;
         }
        }
        return -1;
     }
}
