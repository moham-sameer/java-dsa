package sharpener.Recursion;

import java.util.Arrays;

class mergeShort {
    public static void main(String[] args) {
        int nums[] = {6,5,1,3,4,2,8};
        int[] result = sortArray(nums);
        System.out.println(Arrays.toString(result));
    }
    public static void mergeSort(int[] nums, int left, int right) {
      if (left < right) {
          int mid = left + (right - left) / 2;

          // Recursively sort the first and second halves
          mergeSort(nums, left, mid);
          mergeSort(nums, mid + 1, right);

          // Merge the sorted halves
          merge(nums, left, mid, right);
      }
  }

  // Function to merge two subarrays
  private static void merge(int[] nums, int left, int mid, int right) {
      // Find sizes of two subarrays to be merged
      int n1 = mid - left + 1;
      int n2 = right - mid;

      // Create temporary arrays
      int[] leftArray = new int[n1];
      int[] rightArray = new int[n2];

      // Copy data to temporary arrays
      System.arraycopy(nums, left, leftArray, 0, n1);
      System.arraycopy(nums, mid + 1, rightArray, 0, n2);

      // Initial indexes for leftArray, rightArray, and merged subarray
      int i = 0, j = 0, k = left;

      // Merge the temporary arrays back into nums[left..right]
      while (i < n1 && j < n2) {
          if (leftArray[i] <= rightArray[j]) {
              nums[k++] = leftArray[i++];
          } else {
              nums[k++] = rightArray[j++];
          }
      }

      // Copy the remaining elements of leftArray[], if any
      while (i < n1) {
          nums[k++] = leftArray[i++];
      }

      // Copy the remaining elements of rightArray[], if any
      while (j < n2) {
          nums[k++] = rightArray[j++];
      }
  }

  // Main function to sort the array
  public static int[] sortArray(int[] nums) {
      if (nums == null || nums.length < 2) {
          return nums;
      }
      mergeSort(nums, 0, nums.length - 1);
      return nums;
  }
}

