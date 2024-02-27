package kunalDsa.binarySearch;

public class mountain {
    public static void main(String[] args) {
        // ! we are finding the peak value in this array of mountain.
        int[] arr = {2,3,4,5,6,7,5,3,2,1};
        int ans = searchPeak(arr);
        System.out.println(ans);
        
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
}
