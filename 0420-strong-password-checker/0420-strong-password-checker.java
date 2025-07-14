class Solution {
    public int strongPasswordChecker(String s) {
        int n = s.length();
        boolean hasLower = false, hasUpper = false, hasDigit = false;

        // Count repeated sequences
        int replace = 0;
        int one = 0, two = 0;  // For optimizing deletes
        for (int i = 0; i < n;) {
            char c = s.charAt(i);

            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isDigit(c)) hasDigit = true;

            int j = i;
            while (i < n && s.charAt(i) == s.charAt(j)) i++;
            int len = i - j;

            if (len >= 3) {
                replace += len / 3;
                if (len % 3 == 0) one++;
                else if (len % 3 == 1) two++;
            }
        }

        int missingTypes = 0;
        if (!hasLower) missingTypes++;
        if (!hasUpper) missingTypes++;
        if (!hasDigit) missingTypes++;

        if (n < 6) {
            return Math.max(6 - n, missingTypes);
        } else if (n <= 20) {
            return Math.max(replace, missingTypes);
        } else {
            int delete = n - 20;
            int r = replace;

            // Try reducing replace using deletions
            if (delete > 0) {
                int min = Math.min(delete, one);
                r -= min;
                delete -= min;

                min = Math.min(delete, two * 2) / 2;
                r -= min;
                delete -= min * 2;

                min = delete / 3;
                r -= min;
            }

            return (n - 20) + Math.max(r, missingTypes);
        }
    }
}
