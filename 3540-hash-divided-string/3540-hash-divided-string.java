class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb= new StringBuilder();
        for(int j=0;j<s.length();j=j+k){
        int temp=0;
        for(int i=j;i<k+j;i++){
            temp+=(s.charAt(i)-'a');
        
        }
     sb.append((char)(temp%26+'a'));
        }
     return sb.toString();
    }
}