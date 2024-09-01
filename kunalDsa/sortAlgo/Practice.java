package kunalDsa.sortAlgo;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        int arr[] = { 6, 1, 2, 3, 6, 4, 1 };
       List<Integer> ans = sort(arr);
        System.out.println(ans);
    }

    public static List<Integer> sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            int correct = arr[i]-1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }

        }
        List<Integer> list = new ArrayList<>();
        for(int index = 0;index < arr.length;index++){
                if(arr[index] != index+1){
                    list.add(arr[index]);
                }
        }
        return list;

    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
