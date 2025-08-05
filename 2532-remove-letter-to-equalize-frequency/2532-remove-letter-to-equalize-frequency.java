import java.util.*;

class Solution {
    public boolean equalFrequency(String word) {
        for (int i = 0; i < word.length(); i++) {
            int[] freq = new int[26];

            for (int j = 0; j < word.length(); j++) {
                if (i == j) continue; // Skip the i-th character
                freq[word.charAt(j) - 'a']++;
            }
            int expected = 0;
            boolean valid = true;

            for (int f : freq) {
                if (f == 0) continue;
                if (expected == 0) expected = f;
                else if (f != expected) {
                    valid = false;
                    break;
                }
            }

            if (valid) return true;
        }
        return false;
    }
}
