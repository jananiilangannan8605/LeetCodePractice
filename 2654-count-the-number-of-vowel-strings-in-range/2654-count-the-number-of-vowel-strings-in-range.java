class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String s="aeiou";
        int cnt=0;
        for(int i=left;i<=right;i++){
            String st=words[i];
            if(s.indexOf(st.charAt(0))!=-1&&s.indexOf(st.charAt(st.length()-1))!=-1) cnt++;
        }
        return cnt;
    }
}