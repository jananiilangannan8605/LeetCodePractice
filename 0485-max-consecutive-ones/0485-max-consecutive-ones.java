class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mcount=0;
         int count=0;
        for(int n:nums){
            if(n!=0){
                count++;
            }
            else{
                mcount=Math.max(mcount,count);
                count=0;
            }
        }
        return Math.max(mcount,count);
    }
}