package kunalDsa.binarySearch;
public class countRotations {
    public static void main(String[] args) {
        int [] arr = {6,7,0,1,2,3,4,5};
        int ans = countRotation(arr);
        System.out.println(ans);
    }
      public static int countRotation(int arr[]){
        int pivot = findPivot(arr);
        return pivot + 1 ;
      }
      public static int findPivot(int[]arr){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
         int mid = start + (end - start)/2;
         //! first case:
         if( arr[mid]>arr[mid+1]){
             return mid;
             // ! second case:
         } else if(arr[mid]<arr[mid-1]){
             return mid-1;
         }
         //! third case:
         if(arr[mid]<=arr[start]){
             end = mid - 1;
         }else{
             start = mid + 1;    // ! fourth case:
         }
        }
        return -1;
     }
    
}
