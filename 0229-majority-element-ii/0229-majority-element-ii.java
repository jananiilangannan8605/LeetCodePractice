class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums) {
            map.put(i,map.getOrDefault(i,0)+1);
            if((map.get(i)>nums.length/3)&&(!list.contains(i))){
                list.add(i);
            }
        }
        return list;
    }
}