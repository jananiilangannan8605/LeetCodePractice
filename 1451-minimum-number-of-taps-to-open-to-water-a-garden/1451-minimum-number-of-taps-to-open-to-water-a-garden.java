import java.util.Arrays;

class Solution {
    public int minTaps(int n, int[] ranges) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 0);
        for (int i = 0; i <= n; i++) {
            int left = Math.max(0, i - ranges[i]);
            int right = Math.min(n, i + ranges[i]);
            dp[left] = Math.max(dp[left], right);
        }

        int taps = 0, farthest = 0, currEnd = 0;

        for (int i = 0; i <= n; i++) {
            if (i > farthest) return -1;
            if (i > currEnd) {
                taps++;
                currEnd = farthest;
            }
            farthest = Math.max(farthest, dp[i]);
        }

        return taps;
    }
}
