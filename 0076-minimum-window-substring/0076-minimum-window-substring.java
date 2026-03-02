class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] freq = new int[128];
        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int l = 0, cnt = t.length();
        int min = Integer.MAX_VALUE, st = 0;

        for (int r = 0; r < s.length(); r++) {
            char rc = s.charAt(r);

            if (freq[rc] > 0) cnt--;
            freq[rc]--;

            while (cnt == 0) {
                if (r - l + 1 < min) {
                    min = r - l + 1;
                    st = l;
                }

                char lc = s.charAt(l);
                freq[lc]++;

                if (freq[lc] > 0) cnt++; // missing line
                l++; // move inside while
            }
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(st, st + min);
    }
}