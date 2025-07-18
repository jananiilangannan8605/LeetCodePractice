class Solution {
    public int totalSteps(int[] nums) {
        int n = nums.length;
        Stack<int[]> stack = new Stack<>();
        int maxSteps = 0;

        for (int i = 0; i < n; i++) {
            int steps = 0;
            while (!stack.isEmpty() && nums[i] >= stack.peek()[0]) {
                steps = Math.max(steps, stack.pop()[1]);
            }
            steps = stack.isEmpty() ? 0 : steps + 1;

            maxSteps = Math.max(maxSteps, steps);
            stack.push(new int[]{nums[i], steps});
        }

        return maxSteps;
    }
}
