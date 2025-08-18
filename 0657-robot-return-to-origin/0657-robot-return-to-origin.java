class Solution {
    public boolean judgeCircle(String moves) {
        int l=0;
        int r=0;
       int u=0;
       int d=0;
        char[]ch=moves.toCharArray();
        for(char c:ch){
            if(c=='U') u++;
            if(c=='R') r++;
            if(c=='L') l++;
            if(c=='D') d++;
        }
        if((u==d)&&(l==r)) return true;
        return false;
    }
}