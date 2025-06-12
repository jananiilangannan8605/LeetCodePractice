class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int diff=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int next=(i+1)%nums.length;
            diff=Math.abs(nums[i]-nums[next]);
             max=Math.max(diff,max);
        }
       
        return max;
    }
}