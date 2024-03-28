// Given an array of integers Arr of size N and a number K. 
// Return the maximum sum of a subarray of size K.
// https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
import java.util.*;
public class subarr_div_K {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] arr = {100,200,300,400};
        System.out.println("Enter value of K = ");
        int k = s.nextInt();
        int i=0,sum=0,max=0;

        for(i=0;i<k;i++){
            sum += arr[i];
        }
        max = sum;

        for(i=1;i<=arr.length-k;i++){
            sum = sum - arr[i-1];
            sum = sum + arr[i+k-1];
            max = Math.max(max,sum);
        }
       System.out.println(max);
    }
}
