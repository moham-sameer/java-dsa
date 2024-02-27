package kunalDsa.binarySearch;

public class agOrdBiSearch {
    public static void main(String[] args) {
        int[] arr = {78,45,44,33,23,12,2};
        int target = 45;
        int ans = search(arr, target);
        System.out.println(ans);

    }
    public static int search(int[]arr,int target){
        int start = 0;
        int end = arr.length -1;
        // ! This is one is the basic method of checking the order of an array.
        // boolean isAsc;
        // if(arr[start]<arr[end]){
        //     isAsc = true;
        // } else{
        //     isAsc = false;
        // } 
        
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
