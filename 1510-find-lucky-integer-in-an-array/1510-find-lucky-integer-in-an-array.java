class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map=new HashMap<>();
        int max=-1;
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if((map.get(i)==i) &&(i>max))
                max=i;
        }
        return max;
    }
}