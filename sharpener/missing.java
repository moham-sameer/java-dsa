package sharpener;

public class missing {
    public static void main(String[] args) {
        int arr[] = {2,5,3,1};
        System.out.println(findMissing(arr));
    }
    public static int findMissing(int[] arr){
        int n = arr.length+1;
        int sum = n * (n + 1) / 2;
        int actualSum = 0;
        for(int i = 0; i < n-1; i++){
            actualSum += arr[i];
        }
        return sum - actualSum;
         
    }
}
