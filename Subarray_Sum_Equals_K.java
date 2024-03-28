import java.util.*;
public class Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        int count = 0, sub = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }

        System.out.println("Number of subarrays with sum equals to " + k + " is: " + count);
    }
}

