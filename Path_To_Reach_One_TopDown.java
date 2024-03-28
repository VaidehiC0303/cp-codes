public class Path_To_Reach_One_TopDown {
    public static void main(String[] args) {
        
        int n = 11;
        Integer[] dp = new Integer[n+10];
        int  p = Path(n , dp);
        System.out.println(p);


    }
    public static int Path(int n,Integer[] dp) {
        
        
        if(n == 1){
            return 0;
        }        
        int sp1 = Integer.MAX_VALUE;
        int sp2 = Integer.MAX_VALUE;
        int sp3 = Integer.MAX_VALUE;
        if(dp[n]!= null){
            return dp[n];
        }

        if(n%2 == 0){
            sp1 = 1 + Path(n/2,dp);
        }
        else{
            sp2 = 1 + Path(n-1,dp);
            sp3 = 1 + Path(n+1,dp);
        }

        dp[n] = Math.min(sp1 , Math.min(sp2,sp3));
        return dp[n];  
      }
}
