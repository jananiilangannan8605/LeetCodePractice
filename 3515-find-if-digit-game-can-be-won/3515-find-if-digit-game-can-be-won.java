class Solution {
    public boolean canAliceWin(int[] nums) {
       int scount=0;
       int dcount=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>=0 && nums[i]<=9) scount+=nums[i];
        else dcount+=nums[i];
       } 
       if(scount>dcount||dcount>scount) return true;
       return false;
    }
}