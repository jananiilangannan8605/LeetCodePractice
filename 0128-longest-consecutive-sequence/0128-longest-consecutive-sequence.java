class Solution {
    public int longestConsecutive(int[] arr) {
        int n=arr.length;
        if(n==0) return 0;
        Arrays.sort(arr);
        int count=1;
        int tc=1;
        int st=arr[0];
        int stmax=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]==arr[i-1]+1){
                count++;
            }
                
            else {
                if (count > tc) {
                    tc = count;
                    stmax = st;
                }
                count = 1;
                st = arr[i];
            }
        }
        if (count > tc) {
            tc = count;
            stmax = st;
            }
            tc=Math.max(count,tc);
        
        return tc;
}}