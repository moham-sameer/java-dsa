package kunalDsa.binarySearch.BS2DArray;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,4},
            {7,9,11},
            {16,18,19},
        };
        int target = 18;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    public static int[] search(int[][]arr,int target){
      int r = 0;
      int c = arr.length-1;
      while(r<=arr.length-1 && c>=0){
           if(arr[r][c] == target){
             return  new int[]{r,c};
           }
           if(arr[r][c]<target){
             r++;
           }else{
            c--;
           } 
      }
      return new int[]{-1,-1};
    }
}
