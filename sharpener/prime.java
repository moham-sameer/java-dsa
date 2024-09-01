package sharpener;


public class prime {
    public static void main(String[] args) {
        int n = 5;
         int[] result = num(n);
         for(int i = 0; i < n; i++){
            System.out.println(result[i]);
         }
    }
    public static int[] num(int n){
        int counter = 0;
        int arr[] = new int[n];
        int nums = 2;
        while(counter < n){
            boolean flag = true;
            for(int i = 2;i<nums;i++){
                if(nums % i == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
             arr[counter] = nums;
             counter++;
            }
            nums++;
        }
        return arr;
    }
}

