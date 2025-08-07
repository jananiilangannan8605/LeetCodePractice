class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxLen = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(j) == c) {
                    int len = j - i - 1;
                    if (len > maxLen) {
                        maxLen = len;
                    }
                    break; // no need to check smaller j's for this i
                }
            }
        }

        return maxLen;
    }
}
