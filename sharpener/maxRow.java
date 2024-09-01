package sharpener;

public class maxRow {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{5,4,-3},{5,6}};
        System.out.println(max(arr));
    }
    public static int max(int[][] arr){
        int maximum = 0;
        for(int i = 0; i<arr.length;i++){
             int maxVal = 0;
            for(int j = 0; j<arr[i].length;j++){
                   maxVal += arr[i][j];
            }
            if(maximum < maxVal){
                maximum = maxVal;
            }
        }
        return maximum;
    }
}
