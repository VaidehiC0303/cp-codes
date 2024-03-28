class RobHome {
    public static int main(int[] nums) {
        Integer[] dp = new Integer[nums.length + 1];
        return robhome(nums , 0 , dp);
        
    }
    public static int robhome(int[] nums , int idx , Integer[] dp){
        if(idx >= nums.length){
            return 0;
        }
        if (dp[idx] != null){
            return dp[idx];
            }
            int sp1 = nums[idx] + robhome(nums , idx + 2 , dp);
            int sp2 = robhome(nums , idx + 1 , dp); 

            dp[idx] = Math.max(sp1,sp2);
        return dp[idx];


    }
}