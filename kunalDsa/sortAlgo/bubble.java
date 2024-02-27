package kunalDsa.sortAlgo;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {5,3,0,-8,2,-9,1,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[]arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 1;j<arr.length - i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
