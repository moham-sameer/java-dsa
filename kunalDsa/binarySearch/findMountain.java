package kunalDsa.binarySearch;

public class findMountain {
    public static void main(String[] args) {
      int arr [] = {2,3,4,6,8,5,4,2,1};
      int target  = 8;
      int ans = find(arr, target);
      System.out.println(ans);
    
  }
  public static int find(int[] arr, int target){
     int peak = searchPeak(arr);
     int firstTry = search(arr, target, 0, peak-1);
     if(arr[peak]==target){
        return peak;
     }
     if(firstTry != -1){
        return firstTry;
     }
        return search(arr, target, peak+1, arr.length-1);
  }
  public static int searchPeak(int[] arr){
    int start = 0;
    int end = arr.length - 1;
    while(start < end){
        int mid = start + (end - start)/2;
        if(arr[mid]>arr[mid+1]){
            end = mid;
            // ? it can't be end != mid - 1, because in descending 2nd half of array we will go left side in the array to find the max value.
        }else{
            start = mid + 1;
        }
    }
    return start; // ? we can return start or end cause both the value will be equal
}
  public static int search(int[]arr,int target,int start,int end){
  
    // ! This is the shortest method of checking the  order of an array.
    boolean isAsc = arr[start] < arr[end];

    while(start <= end){
        int mid = start + (end - start)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(isAsc){
            if(target<arr[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }else{
            if(target>arr[mid]){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
    }
    return -1;
}
}



