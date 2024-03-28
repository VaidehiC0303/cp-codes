public class Path_To_Reach_one {

    public static void main(String[] args) {
        int n = 11;
        int  p = Path(n);
        System.out.println(p);


    }
    public static int Path(int n) {
        
        if(n == 1){
            return 0;
        }        
        int sp1 = Integer.MAX_VALUE;
        int sp2 = Integer.MAX_VALUE;
        int sp3 = Integer.MAX_VALUE;

        if(n%2 == 0){
            sp1 = 1 + Path(n/2);
        }
        else{
            sp2 = 1 + Path(n-1);
            sp3 = 1 + Path(n+1);
        }
        return Math.min(sp1 , Math.min(sp2,sp3));    }

    
}
