public class Path_To_Reach_One_BottomUp {
    public static void main(String[] args) {
        
        int n = 11;
        Integer[] dp = new Integer[n+1];
        int  p = Path(n , dp);
        System.out.println(p);


    }
    public static int Path(int n,Integer[] dp) {
        
        dp[2] = 1;
        for(int i = 3 ; i<=n; i++){
            if(i%2 == 0){
               dp[i] = dp [i/2] +1 ;

            }
            else{
            int sp2 =dp[i-1]+1;
            int sp3 =dp[(i+1)/2]+2;

            dp[i] = Math.min(sp2 , sp3);
            }
            
        }
        
        return dp[n];
    }
}
