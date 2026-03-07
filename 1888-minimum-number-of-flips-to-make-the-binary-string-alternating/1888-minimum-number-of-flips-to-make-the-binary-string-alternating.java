class Solution {
    public int minFlips(String s) {
        int n=s.length();
        String str=s+s;
        int diff1=0, diff2=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c!=(i%2==0?'0':'1'))diff1++;
            if(c!=(i%2==0?'1':'0')) diff2++;
            if(i>=n){
                char ch=str.charAt(i-n);
                if(ch!=((i-n)%2==0?'0':'1'))diff1--;
                if(ch!=((i-n)%2==0?'1':'0')) diff2--;
            }
            if(i>=n-1)  ans=Math.min(ans,Math.min(diff1,diff2));
        }
        return ans;
    }
}