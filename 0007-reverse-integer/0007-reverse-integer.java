class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
            int dig=x%10;
            rev=rev*10+dig;
            x/=10;

        }
        if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
          return 0;
    }
    if(x<0){
        return (int)(-1*rev);
    }
    return (int)rev;

    }
}