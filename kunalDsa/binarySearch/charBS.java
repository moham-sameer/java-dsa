package kunalDsa.binarySearch;

public class charBS {
    public static void main(String[] args) {
        // ! In this Q we have to find next greater character and if it isn't exist then the first character.
        char[] arr = { 'c', 'd', 'e', 'f' };
        char target = 'e';
        char ans = search(arr, target);
        System.out.println(ans);
    }

    public static char search(char arr[], char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }        
        return arr[start % arr.length];
    }
}
