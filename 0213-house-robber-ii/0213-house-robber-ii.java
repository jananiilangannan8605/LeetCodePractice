class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int c1=robber(nums,0,nums.length-2);
        int c2=robber(nums, 1, nums.length-1);
        return Math.max(c1,c2);
    }
    private int robber(int[]nums, int st, int end){
        int pre1=0;
        int pre2=0;
        for(int i=st;i<=end;i++){
            int curr=Math.max(pre1,pre2+nums[i]);
            pre2=pre1;
            pre1=curr;
        }
        return pre1;
    } 
}