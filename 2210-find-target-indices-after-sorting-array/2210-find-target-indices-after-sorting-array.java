class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> l=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if(nums[i]==target){
                l.add(i);
            }
            i++;
        }
        return l;
    }
}