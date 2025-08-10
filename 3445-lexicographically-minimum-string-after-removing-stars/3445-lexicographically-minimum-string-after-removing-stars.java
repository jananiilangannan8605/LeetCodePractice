import java.util.*;

class Solution {
    public String clearStars(String s) {
        StringBuilder sb = new StringBuilder(s);
        // Buckets for each character 'a' to 'z'
        List<Integer>[] buckets = new List[26];
        for (int i = 0; i < 26; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '*') {
                // store index in corresponding bucket
                buckets[c - 'a'].add(i);
            } else {
                sb.setCharAt(i, ' '); // mark '*' for removal
                // find smallest character bucket that has indices
                for (int j = 0; j < 26; j++) {
                    if (!buckets[j].isEmpty()) {
                        int idx = buckets[j].remove(buckets[j].size() - 1);
                        sb.setCharAt(idx, ' '); // mark removed letter
                        break;
                    }
                }
            }
        }

        // Build result without spaces
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != ' ') {
                res.append(sb.charAt(i));
            }
        }
        return res.toString();
    }
}
