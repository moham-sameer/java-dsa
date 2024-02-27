package kunalDsa.binarySearch;

public class splitArrayLSum {
    public static void main(String[] args) {
        int arr[] = {7,2,5,10,8};
        int m = 2;
        int ans = splitArray(arr, m);
        System.out.println(ans);

    }
    public static int splitArray(int arr[],int m){
        int start = 0;
        int end = 0;
        for(int i = 0;i<arr.length;i++){
          start = Math.max(start,arr[i]);
          end += arr[i];  
        }
        while(start<end){
            int mid = start + (end - start)/2;
            int sum = 0;
            int pieces = 1;
            for(int nums:arr){
                if(sum + nums>mid){
                    sum = nums;
                    pieces++;
                }else{
                    sum += nums;
                }
            }
            if(pieces > m){
                start = mid + 1;

            }else{
                end = mid;
            }
        }
        return end;  // ! return either start or end because at this point start, end and mid three of them will be equal.
    }
}
