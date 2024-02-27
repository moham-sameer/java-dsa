package kunalDsa.binarySearch;

public class findRotatedArray {
    public static void main(String[] args) {
        int[] arr = {9,11,12,2,4,5,7,8};
        int target = 9;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    public static int search(int[] arr,int target){
        int pivot = findPivot(arr);
        if(arr[pivot]==target){
            return pivot;
        }
        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length-1);
        }
        if(target >= arr[0]){
          return binarySearch(arr, target, 0, pivot-1);
        }
        return binarySearch(arr, target, pivot+1, arr.length-1);
    }
    public static int findPivot(int[]arr){
       int start = 0;
       int end = arr.length -1;
       while(start<=end){
        int mid = start + (end - start)/2;
        //! first case:
        if(mid<end && arr[mid]>arr[mid+1]){
            return mid;
            // ! second case:
        } else if(mid>start && arr[mid]<arr[mid-1]){
            return mid-1;
        }
        //! third case:
        if(arr[start]>=arr[mid]){
            end = mid - 1;
        }else{
            start = mid + 1;    // ! fourth case:
        }
       }
       return -1;
    }
    public static int binarySearch(int arr[],int target,int start,int end){
        while(start<=end){
            int mid = (start + end)/2;
         
         if(target>arr[mid]){
             start = mid +1;
 
         }else if(target<arr[mid]){
             end = mid - 1;
         } else{
             return mid;
         }
        }
        return -1;
     }

}
