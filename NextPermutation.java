import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 4, 3, 2, 0};
        permute(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void permute(int[] arr) {
        int idx = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }
        if (idx != -1) {
            // Find the smallest number in the suffix that is greater than arr[idx]
            int min = idx + 1;
            for (int i = idx + 2; i < arr.length; i++) {
                if (arr[i] > arr[idx] && arr[i] < arr[min]) {
                    min = i;
                }
            }

            // Swap arr[idx] with arr[smallestGreaterIdx]
            int temp = arr[idx];
            arr[idx] = arr[min];
            arr[min] = temp;
        }

        // Reverse the suffix
        reverseSuffix(arr, idx + 1);
    }

    
    private static void reverseSuffix(int[] arr, int start) {
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
