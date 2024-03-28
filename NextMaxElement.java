import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class NextMaxElement {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3,1,7,8,2,0};
        Stack<Integer> st = new Stack<>();
        int[] newarr = new int[arr.length];
        
        st.add(0);
        
        for(int i=1;i<arr.length ; i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i] ){
                newarr[st.pop()] = arr[i];
                
            }
            st.add(i);
       
        }
        

        while(!st.isEmpty()){
            newarr[st.pop()] = -1;
            
        }
        System.out.println(Arrays.toString(newarr));
        
    }
    }
    

