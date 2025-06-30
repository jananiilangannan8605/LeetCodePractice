class Solution {
    public int longestPalindrome(String s) {
        StringBuilder sbs=new StringBuilder(s);
        if(sbs.reverse().toString().equals(s)) return s.length();
        int freq[]=new int[128];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        StringBuilder sb=new StringBuilder();
        Character mid=null;
        for(char c='A';c<='z';c++){
            if(freq[c]%2==1&&mid==null){
                mid=c;
            }
            for(int i=0;i<freq[c]/2;i++){
                sb.append(c);
            } 
        }
        String f=sb.toString();
        String scnd=new StringBuilder(f).reverse().toString();
        String str= f+(mid!=null?mid:"")+ scnd;
        return str.length();
    }
}