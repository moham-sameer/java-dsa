package kunalDsa.sortAlgo;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int arr[] = {2,6,8,-9,4,7,5};
         sort(arr);
         System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            int last = arr.length - i-1;
            int max = maxLength(arr, 0, last);
                     
              swap(arr, max, last);

        }
    }
    public static void swap(int[]arr,int start,int second){
           int temp = arr[start];
           arr[start] = arr[second];
           arr[second] = temp;                    
        
    }
    public static int maxLength(int arr[],int start,int end){
         int max = start;
        for(int i = start;i<=end;i++ ){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
         return max;
    }


}
