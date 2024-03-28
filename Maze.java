//rat maze
import java.util.*;

public class Maze {
    public static void main(String[] args) {
        int row  = 5;
        int col = 4;

        char[][] mat = {{'o','x','o','o'},{'o','o','o','o'},{'o','o','x','o'},{'x','o','o','o'},{'x','x','o','o'}};
        int[][] visited = new int[row][col];


    }

    public static void call(int crow, int ccol,char[][] maze ,  ) {

        call(crow-1 , ccol , maze , visited , path"U");
        call(crow, ccol+1 , maze , visited , path"R");
        call(crow+1 , ccol , maze , visited , path"D");
        call(crow, ccol-1 , maze , visited , path"L");

        if(mat[i][j] != x){
            j++;
            ans[i][j] == 1 ;

        }
        
    }
}
