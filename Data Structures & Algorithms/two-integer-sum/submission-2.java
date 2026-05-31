class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] m=new int[2];
        for(int i=0;i<nums.length;i++){
            int k=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(k==nums[j]){
                    m[0]=i;
                    m[1]=j;
                }
            }
        }
        return m;
    }
}
