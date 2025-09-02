class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int i:nums){
            if(i>0) list.add(i);
            else list2.add(i);
        }
        int ind=0;
        for(int i:list){
            nums[ind]=i;
            ind+=2;
        }
         ind=1;
        for(int i:list2){
            nums[ind]=i;
            ind+=2;
        }
    return nums;
    }
}