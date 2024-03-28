import java.util.Stack;

public class stack_copy {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
          
        int n=4;
        for(int i=1;i<=n;i++){
            st.push(i);
        }
        recur(st);
        System.out.println(st);
    }
    public static void recur(Stack<Integer> st) {
        if(!st.isEmpty()){
            int ele = st.pop();
            System.out.println(ele);
            recur(st);
            System.out.println(ele);
            st.add(ele);
        }
        
        
    }
}
