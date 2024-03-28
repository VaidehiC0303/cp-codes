import java.io.*;
import java.util.*;
public class merge_sort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 9};
        divide(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void divide(int[] arr, int s, int e) {
        if (s < e) {
            int mid = (s + e) / 2;
            divide(arr, s, mid);
            divide(arr, mid + 1, e);
            conquer(arr, s, mid, e);
        }
    }

    public static void conquer(int[] arr, int s, int mid, int e) {
        int[] merged = new int[e - s + 1];
        int idx1 = s;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= e) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                idx1++;
            } else {
                merged[x] = arr[idx2];
                idx2++;
            }
            x++;
        }

        while (idx1 <= mid) {
            merged[x] = arr[idx1];
            idx1++;
            x++;
        }

        while (idx2 <= e) {
            merged[x] = arr[idx2];
            idx2++;
            x++;
        }

        for (int i = 0, j = s; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
}
