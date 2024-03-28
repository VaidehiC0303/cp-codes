import java.util.*;
public class phone_no {
    public static void main(String[] args){
       ArrayList<String> al = new ArrayList<>();
       PrintLetters(0,"33"," ", al);
       System.out.println(al);

    }
    public static void PrintLetters(int idx , String digit , String str , ArrayList<String> al ){
        if ( idx == digit.length()){
            al.add(str);
            return;
        }
        //ch = 3 , str = def , d->f ,
        //digits = 23
         char ch = digit.charAt(idx);
         String strwithresptoch = findString(ch);

         for(int i = 0; i<strwithresptoch.length() ;i++){
            PrintLetters(idx + 1, digit , str +strwithresptoch.charAt(i), al );
         }

    }

public static String findString( char ch){
    String arr[] = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; 
    return arr[ch - '2'];
}
}