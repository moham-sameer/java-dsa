package kunalDsa.binarySearch;

import java.util.Arrays;

public class practice{
    public static void main(String[] args) {
        int arr[] = {5,3,7,9,12,11,6,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length-1;i++){
            for(int j = 1; j < arr.length;j++){
                 if(arr[j]<arr[j-1]){
                    swap(arr, j-1, j);

                 }
            }
        }
    }
    public static void swap(int[] arr,int start, int second){
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;
    }
}