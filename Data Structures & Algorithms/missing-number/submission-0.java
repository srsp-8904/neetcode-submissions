class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int fin=0;
        for(int i=0;i<=n;i++){
            fin^=i;
        }
        for(int k:nums){
            fin^=k;
        }
        return fin;
    }
}
