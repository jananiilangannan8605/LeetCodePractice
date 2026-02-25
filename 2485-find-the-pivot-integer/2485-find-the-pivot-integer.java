class Solution {
    public int pivotInteger(int n) {
       int tot=n*(n+1)/2;
       int x=(int)Math.sqrt(tot);
       if(x*x==tot) return x;
       return -1; 
    }
}