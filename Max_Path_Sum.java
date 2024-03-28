import java.util.*;
public class Max_Path_Sum {
    public static void main(String[] args) { 
        int[] arr1 = {2,3,7,10,12,15,30,34};
        int[] arr2 = {1,5,7,8,10,15,16,19};
        int sum1 = 0 , sum2 = 0, ts = 0, i =0,j=0;

        while( i<arr1.length &&  j<arr2.length){
            if(arr1[i] == arr2[j]){
                ts += Math.max(sum1,sum2)+arr1[i];
                sum1=0;
                sum2=0;
                i++;
                j++;
            }
            else if(arr1[i] > arr2[j]){
                sum2 = sum2 +arr2[j];
                j++;
            }
            else {
                sum1=sum1 + arr1[i];
                i++;
            }
        }

      System.out.println("Total Sum ->"+ts);
      System.out.println("Sum1 -> "+sum1);
      System.out.println("Sum2 -> "+sum2);

      while(i<arr1.length){
        sum1=sum1 + arr1[i];
        i++;
      }
      while(j<arr2.length){
        sum2=sum2 + arr2[j];
        j++;
      }
      ts = ts + Math.max (sum1,sum2);
      System.out.println(ts);
    }
}
