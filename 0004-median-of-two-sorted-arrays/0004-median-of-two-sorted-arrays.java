class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        for(int i:nums1){
            list.add(i);
        }
        for(int i:nums2){
            list.add(i);
        }
        Collections.sort(list);
        double n=0;
        if(list.size()%2!=0){
            n=(double) list.get(list.size()/2);
        }
        else{
            int i=0;
            int j=0;
            i=list.get(list.size()/2);
            j=list.get((list.size()-1)/2);
            n= (j+i)/2.0;
        }
        return n;
    }
}