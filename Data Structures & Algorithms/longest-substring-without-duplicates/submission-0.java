class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int l=0;
        int max=0;
        int n=s.length();
        for(int r=0;r<n;r++){
            hm.put(s.charAt(r),hm.getOrDefault(s.charAt(r),0)+1);
            while(hm.get(s.charAt(r))>1){
                char lc=s.charAt(l);
                hm.put(lc,hm.get(lc)-1);
                if(hm.get(lc)==0){
                    hm.remove(lc);
                }
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}
