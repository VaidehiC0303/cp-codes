import java.util.*;

public class NextMax_1 {
    public static void main(String[] args){
        int[] num1 = {4,1,2};
        int[] num2 = {1,3,4,2};
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        NextMax(num1, num2, map, st);
    
}

public static void NextMax(int[] num1,int[] num2, HashMap<Integer,Integer> map,Stack<Integer> st) {
    st.add(num2[0]);
        
    for(int i=0;i<num2.length ; i++){
        while(!st.isEmpty() && num2[st.peek()] < num2[i] ){
            // st[st.pop()] = num2[i];
            map.put(num2[st.pop()],num2[i]);
            
        }
        st.add(i);
   
    }
    

    while(!st.isEmpty()){
        // newarr[st.pop()] = -1;
        map.put(num2[st.pop()],-1);
    }
    System.out.println(map);



    for(int i = 0;i<num1.length ; i++){
        if(map.containsKey(num1[i])){
        int value = map.get(num1[i]);
        num1[i] = value;
    }
}
System.out.println(Arrays.toString(num1));
}

}
