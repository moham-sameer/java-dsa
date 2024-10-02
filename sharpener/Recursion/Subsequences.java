package sharpener.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        List<List<Integer>> subsequences = new ArrayList<>();
        generateSubsequences(array, 0, new ArrayList<>(), subsequences);
        printSubsequences(subsequences);
    }

    private static void generateSubsequences(int[] array, int index, List<Integer> current, List<List<Integer>> subsequences) {
        if (index == array.length) {
            if (!current.isEmpty()) {
                subsequences.add(new ArrayList<>(current));
            }
            return;
        }
        
        // Exclude the current element
        generateSubsequences(array, index + 1, current, subsequences);

        // Include the current element
        current.add(array[index]);
        generateSubsequences(array, index + 1, current, subsequences);
        current.remove(current.size() - 1); // Backtrack
    }

    private static void printSubsequences(List<List<Integer>> subsequences) {
        for (List<Integer> subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }
}


