package kunalDsa.sortAlgo.cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class disappeared {
    public static void main(String[] args) {
        int arr[] = {2,3,3,5,2};
         List<Integer> ans = sort(arr);
         System.out.println(ans);

    }
    public static List<Integer> sort(int[] arr){
          int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0;index<arr.length;index++){
            if(arr[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
