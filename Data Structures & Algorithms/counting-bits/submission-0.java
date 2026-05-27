class Solution {
    public int[] countBits(int n) {
        int i=0;
        int[] output=new int[n+1];
        output[0]=0;
        for(i=1;i<=n;i++){
            int k=i;
            int count=0;
            while(k!=0){
                k=k&(k-1);
                count++;
            }
            output[i]=count;
        }
        return output;
    }
}
