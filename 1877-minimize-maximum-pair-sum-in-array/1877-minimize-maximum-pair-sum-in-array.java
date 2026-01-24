class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<=nums.length/2;i++){
            list.add(nums[i]+nums[nums.length-1-i]);
        }
        int max=0;
        for(int i=0;i<list.size();i++){
            max=Math.max(list.get(i),max);
        }
        return max;
    }
}