class Solution {
    public int[] getConcatenation(int[] nums) {
        int[]ans=new int[nums.length+nums.length];
        
        int k=0;
        for(int i=0;i<nums.length;i++){
            ans[k++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            ans[k++]=nums[i];
        }
        return ans;
    }
}