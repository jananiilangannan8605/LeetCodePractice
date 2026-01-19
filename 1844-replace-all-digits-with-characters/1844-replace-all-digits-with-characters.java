class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();

        for (int i = 1; i < arr.length; i += 2) {
            int shift = arr[i] - '0';   // convert char digit to int
            arr[i] = (char)(arr[i - 1] + shift);
        }

        return new String(arr);
    }
}
