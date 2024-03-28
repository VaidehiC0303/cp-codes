import java.util.Stack;

public class VaildParanthesis {
    public static void main(String[] args) {
        String para = "(()()))()))()";
        Stack<Character> st = new Stack<>();
        
        valid(para,st);
        
    }
    public static void valid( String para,Stack<Character> st ) {
        int count = 0;
        st.push(para.charAt(0));
        for(int i=1 ; i<para.length();i++)  {
            
            if(para.charAt(i) == '('){
                st.push('(');
            }
            if(!st.isEmpty()) {
                if(para.charAt(i) == ')'){
                st.pop();
                count++;
                }
            }
            
        }  
        System.out.println(count);  
    }
}
