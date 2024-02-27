package kunalDsa.binarySearch;

import java.util.Arrays;

class practice{
    public static void main(String[] args) {
        int matrix[][] = {
               {2,3,5},
               {7,8,9},
               {12,23,24}
        };
        int target = 23;
        int[] res = sort(matrix, target);
        System.out.println(Arrays.toString(res));
    }
    public static int[] sort(int[][] matrix,int target){
        int c = matrix.length-1;
        int r = 0;
        while(r<=matrix.length-1 && c>=0){
            if(matrix[r][c]== target){
                return new int[]{r,c};
            }else if(matrix[r][c]<target){
                  r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}