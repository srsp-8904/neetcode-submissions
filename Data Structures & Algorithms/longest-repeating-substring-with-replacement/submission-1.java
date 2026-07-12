class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int l=0;
        int maxf=0;
        int ans=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            hm.put(c,hm.getOrDefault(c,0)+1);
            maxf=Math.max(maxf,hm.get(c));
            while((r-l+1)-maxf>k){
                char ch=s.charAt(l);
                hm.put(ch,hm.get(ch)-1);
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
