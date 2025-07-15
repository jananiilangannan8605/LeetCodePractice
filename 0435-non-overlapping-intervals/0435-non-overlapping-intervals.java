class Solution {
    public int eraseOverlapIntervals(int[][] inter) {
      if(inter.length==0) return 0;
      Arrays.sort(inter,(a,b)->Integer.compare(a[1],b[1]));
      int cnt=0;
      int last=inter[0][1];
      for(int i=1;i<inter.length;i++){
        if(inter[i][0]<last) {
            cnt++;
        }
        else last=inter[i][1];
      }
    return cnt;
    }
}