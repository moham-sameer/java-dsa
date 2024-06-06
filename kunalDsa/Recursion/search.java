package kunalDsa.Recursion;

import java.util.ArrayList;

public class search {
    public static void main(String[] args) {
       int arr[] = {1, 4, 3, 4, 5, 4}; 
       int target = 4;
       ArrayList<Integer> ans = Search(arr, target, 0, new ArrayList<Integer>());
          System.out.println(ans);       
    }
    public static ArrayList<Integer> Search(int[] arr,int target,int i,ArrayList<Integer> list) {
        if(i == arr.length){
             return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        
        return Search(arr,target,i+1,list);
    }

}
