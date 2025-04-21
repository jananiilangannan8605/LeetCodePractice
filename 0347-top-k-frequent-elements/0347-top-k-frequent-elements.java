class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int[]arr=new int[k];
        int j=0;
        for(int i:nums){
           map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int n=0;n<k;n++){
            int max=0;
        for(int i:map.keySet()){
            if(map.get(i)>max){
                max=map.get(i);
                arr[n]=i;

            }
        }
        map.remove(arr[n]);

        }
        
        
        return arr;
    }
}