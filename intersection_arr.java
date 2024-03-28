import java.util.*;
class intersection_arr{
    public static void main(String[] args) { 
        int[] arr1 = {1,2,2,2,3,4,4,5,6};
        int[] arr2 = {1,1,2,2,2,3,3,4,5};
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0,j = 0;
        do{
            if(arr1[i] == arr2[j]){
                temp.add(arr1[i]);
                i++;
                j++;
            }else if(arr1[i] > arr2[j]){
                j++;
            }else{
                i++;
            }
        }while(i<arr1.length && j<arr2.length);
        System.out.println(temp);
    }
}