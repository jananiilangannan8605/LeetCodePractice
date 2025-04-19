class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
        k = k % n;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Collections.rotate(list, k);
        
        for (int i = 0; i < n; i++) {
            nums[i] = list.get(i);
        }
    }
}