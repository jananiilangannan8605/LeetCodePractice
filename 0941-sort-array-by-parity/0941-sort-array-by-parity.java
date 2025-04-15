class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int left=0;
       int move=0;
       while(move<nums.length){
            if(nums[move]%2==0){
                int temp=nums[move];
                nums[move]=nums[left];
                nums[left]=temp;
                left++;
            }
            move++;
       }
       return nums;
    }
}