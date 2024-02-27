package kunalDsa.sortAlgo;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int arr[] = {4,1,6,8,9,3,-10};
          sort(arr);
          System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[]arr,int start,int second){
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;                    
     
 }
    public static void sort(int arr[]){
       for(int i = 0;i<arr.length-1;i++){
        for(int j = i+1;j>0;j-- ){
            if(arr[j]<arr[j-1]){
                 swap(arr, j, j-1); 
            }else{
                break;
            }
        }
       }
    }
}
