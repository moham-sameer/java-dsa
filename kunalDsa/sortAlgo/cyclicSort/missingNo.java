package kunalDsa.sortAlgo.cyclicSort;

public class missingNo {
    public static void main(String[] args) {
        int[] arr = {0,2,4,3,1};
        int ans = sort(arr);
         System.out.println(ans);
    }
    public static int sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        for(int index = 0;index<arr.length;index++){
            if(arr[index] != index){
                 return index;
            }
        }
        return arr.length;
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
