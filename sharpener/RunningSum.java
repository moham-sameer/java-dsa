package sharpener;

import java.util.Arrays;

public class RunningSum {
   public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    int[] result = runSum(arr);
     System.out.println(Arrays.toString(result));
   } 
   public static int[] runSum(int[] arr){
    int n = arr.length;
    int temp[] = new int[n];
     temp[0] = arr[0];
    for(int i = 1; i < n; i++){
        temp[i] = temp[i-1] + arr[i];
   }
   return temp;
}
}
