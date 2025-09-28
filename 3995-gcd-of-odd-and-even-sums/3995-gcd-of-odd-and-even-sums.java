class Solution {
    public int gcdOfOddEvenSums(int n) {
       int odd=n*n;
       int even=n*(n+1);
       int gcd=0;
       for(int i=1;i<=Math.min(odd,even);i++){
        if(odd%i==0&&even%i==0){
            gcd=i;
        }
       }
       return gcd;
    }
}