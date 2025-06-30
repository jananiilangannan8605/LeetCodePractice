class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)) arr[1]=i;
            else if(map.get(i)==2) arr[0]=i;
        }
        
        return arr;
    }
}