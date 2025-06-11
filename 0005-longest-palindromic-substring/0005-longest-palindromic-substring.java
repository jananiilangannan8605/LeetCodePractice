class Solution {
    public String longestPalindrome(String s) {
        
        if(s.length()==0&&s==null) return " ";
        int st=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int l1=func(s,i,i);
            int l2=func(s,i,i+1);
            int len=Math.max(l1,l2);
            if(len>end-st){
                st=i-(len-1)/2;
                end=i+(len)/2;
            }
        }
        return s.substring(st,end+1);
    }
    public int func(String s,int left, int right){
        int l=left, r=right;
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}