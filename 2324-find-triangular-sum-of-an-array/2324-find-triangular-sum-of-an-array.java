class Solution {
    public int triangularSum(int[] nums) {
        int count=nums.length;
        while(count>0){
            for(int i=0;i<count-1;i++){
             nums[i]=(nums[i]+nums[i+1])%10;
            }
            count--;

        }
        return nums[0];
        

    }
}