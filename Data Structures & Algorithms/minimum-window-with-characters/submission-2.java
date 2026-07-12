
class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> tm = new HashMap<>();
        HashMap<Character, Integer> sm = new HashMap<>();

        for (char c : t.toCharArray()) {
            tm.put(c, tm.getOrDefault(c, 0) + 1);
        }

        int have = 0;
        int need = tm.size();

        int l = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;

        for (int r = 0; r < s.length(); r++) {

            char c = s.charAt(r);
            sm.put(c, sm.getOrDefault(c, 0) + 1);

            if (tm.containsKey(c) && sm.get(c).intValue() == tm.get(c).intValue()) {
                have++;
            }

            while (have == need) {

                if (r - l + 1 < min) {
                    min = r - l + 1;
                    start = l;
                }

                char ch = s.charAt(l);
                sm.put(ch, sm.get(ch) - 1);

                if (tm.containsKey(ch) && sm.get(ch) < tm.get(ch)) {
                    have--;
                }

                l++;
            }
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }
}