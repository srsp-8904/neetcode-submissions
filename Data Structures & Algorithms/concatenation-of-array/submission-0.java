class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int k=2*n;
        int[] ans=new int[k];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        for(int i=n;i<k;i++){
            ans[i]=nums[i-n];
        }
        return ans;

    }
}