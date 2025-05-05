class Solution {
    public String reverseStr(String s, int k) {
        char[] c=s.toCharArray();
        int start=0;
        while(start<c.length){
        int st=start;
        int end=Math.min(start+k-1,c.length-1);
        while(st<end){
            char temp=c[st];
            c[st]=c[end];
            c[end]=temp;
            st++;
            end--;
        }
        start += 2 * k;
        }
        return String.valueOf(c);
    }
}