package sharpener.Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int nums[] = {3,4,1,6,5,8,7,2};
        int[] result = sortArrays(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] sortArrays(int[] nums){
        if(nums == null || nums.length<2){
            return nums;
        }
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public static void mergeSort(int[] nums,int left,int right){
        if(left<right){

            int mid = left + (right-left)/2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);
            // merge the sorted halves
            merge(nums, left, mid, right);
        }
    }
    public static void merge(int[] nums,int left,int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArray = new int[n1];
        int[] rightArray= new int[n2];
        System.arraycopy(nums, left, leftArray, 0, n1);
        System.arraycopy(nums, mid+1, rightArray, 0, n2);

        int i = 0,j=0,k=left;
        while(i<n1 && j<n2){
            if(leftArray[i] <= rightArray[j]) {
                nums[k++] = leftArray[i++];
            }else{
                nums[k++] = rightArray[j++];
            }
        }
        while(i<n1){
            nums[k++] = leftArray[i++];
        }
        while(j<n2){
            nums[k++] = rightArray[j++];
        }
    }
}


