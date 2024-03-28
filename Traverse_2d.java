import java.util.*;

public class Traverse_2d {
    public static void main(String[] args) {
        int[][] arr = { {10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50} };
        int x = 29;
        int i = 0;
        int j = arr[0].length - 1;
        
        while (i < arr.length && j >= 0) {
            if (arr[i][j] > x) {
                j--;
            } else if (arr[i][j] < x) {
                i++;
            } else {
                break;
            }
        }

            System.out.println("Index Row->" + i  + "\nIndex column->" + j);
    }
}
