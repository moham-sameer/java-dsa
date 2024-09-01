package leetcode;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int nums[] = { 5, 3, 4, 15 };
        int target = 9;
        int[] result = sum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }

            }
        }
        return new int[] {};
    }
}
