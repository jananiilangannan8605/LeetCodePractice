import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        PriorityQueue<Integer> min = new PriorityQueue<>();

        for (int num : nums) {
            if (seen.contains(num)) continue;
            seen.add(num);
            min.offer(num);

            if (min.size() > 3) {
                int removed = min.poll();
                seen.remove(removed);
            }
        }
        if (min.size() < 3) {
            int max = Integer.MIN_VALUE;
            while (!min.isEmpty()) {
                max = Math.max(max, min.poll());
            }
            return max;
        }
        return min.peek();
    }
}
