class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder(s.substring(0,k));
        String str=sb.reverse().toString();
        String str1=s.substring(k,s.length());
        return str+str1;
    }
}