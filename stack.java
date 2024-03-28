import java.io.*;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  
        Stack<Integer> st1 = new Stack<>();  
        int n=4;
        for(int i=1;i<=n;i++){
            st.push(i);
        }
        for(int i=0;i<n;i++){
            int y = st.pop();
            System.out.println(y);
            st1.push(y);
        }
        System.out.println("st:"+st);
        
    
    for(int i=0;i<=n;i++){
        int x = st1.pop();
        System.out.println("st1:"+ x);
        

    }
    
}
}