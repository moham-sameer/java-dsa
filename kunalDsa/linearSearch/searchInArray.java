package kunalDsa.linearSearch;

import java.util.Arrays;

public class searchInArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4},
            {7,8,9}
        };
        int target = 4;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] search(int[][]arr,int target){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
