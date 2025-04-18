class Solution {
    public int[] arrayRankTransform(int[] arr) {
       
        Map<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],0);
        }
        int j=1;
        for(int i:map.keySet()){
            map.put(i,j);
            j++;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
      

        

    }
}