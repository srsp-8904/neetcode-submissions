class Solution {
    int[] dp;
    public int solve(int i , int[] nums){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob=nums[i]+solve(i+2,nums);
        int skip=solve(i+1,nums);
        return dp[i]=Math.max(rob,skip);
    }
    public int rob(int[] nums) {
        int n= nums.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(0,nums);
    }
}
