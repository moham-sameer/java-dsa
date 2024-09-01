package sharpener;

public class maxsub {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -4, 5, 6};
        int maxSum = maxArray(arr);
        System.out.println(maxSum);
    }
    public static int maxArray(int[] arr){
        int currentArray = arr[0];
        int maxArray = arr[0];
         for(int i = 0;i<arr.length;i++){
           currentArray = Math.max(currentArray+arr[i],arr[i]);
           maxArray = Math.max(currentArray,maxArray);
         }
         return maxArray;
    }
}
