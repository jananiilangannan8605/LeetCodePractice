class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int freq1[]=new int[1001];
        int freq2[]=new int[1001];
        for(int i:nums1) freq1[i]++;
        for(int i:nums2) freq2[i]++;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<freq1.length;i++){
            if(freq1[i]>0 && freq2[i]>0){
                int min=Math.min(freq1[i],freq2[i]);
                for(int j=1;j<=min;j++){
                    list.add(i);
                }
            }
        }
        int arr[]=new int[list.size()];
        int index=0;
        for(int i:list){
            arr[index++]=i;
        }
        return arr;

    }
}