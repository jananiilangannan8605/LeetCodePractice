class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
   int count = 0;
        int oddCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Initial condition: one way to have 0 odd numbers so far
        map.put(0, 1);
        
        for (int num : nums) {
            // Count the number of odd numbers so far
            if (num % 2 != 0) {
                oddCount++;
            }

            // If (oddCount - k) exists in the map, add the number of ways we got there
            count += map.getOrDefault(oddCount - k, 0);

            // Add current oddCount to the map
            map.put(oddCount, map.getOrDefault(oddCount, 0) + 1);
        }
        
        return count;
    }
}