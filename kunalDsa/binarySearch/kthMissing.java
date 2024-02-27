package kunalDsa.binarySearch;

public class kthMissing {
    public static void main(String[] args) {
        int arr[] = {3,4,6,8,9,12,19};
        int k = 9;
        int ans = MissingSearch(arr, k);
        System.out.println(ans);
    }
     public static int MissingSearch(int arr[],int k){
        int missingCount = 0;
        int num = 1;
           while(missingCount < k){

               if(!contains(arr, num)){
                   missingCount++;
                   
                } 
                if(missingCount < k){
                    num++;
                }
            }
          return num;
     }
    public static boolean contains(int[]arr,int target){
        for(int num:arr){
            if(num == target){
                return true;
            }  
        }
        return false;
    }
}
