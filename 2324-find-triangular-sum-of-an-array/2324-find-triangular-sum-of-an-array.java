class Solution {
    public int triangularSum(int[] nums) {
        int sum=nums[0];
        while(nums.length>1){
            int[] arr=new int[nums.length-1];
            for(int i=0;i<nums.length-1;i++){
                arr[i]=nums[i]+nums[i+1]%10;
            }
            nums=arr;
        }
        
        return nums[0]%10;
    }
}