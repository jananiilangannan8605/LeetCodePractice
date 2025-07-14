class Solution {
    public int numberOfSpecialChars(String word) {
        int[]freq=new int[26];
        int[]freq2=new int[26];
        for(char c:word.toCharArray()){
            if(c>=65 && c<=90){
                freq[c-'A']++;
            }
            if(c>=97 && c<=122){
                freq2[c-'a']++;
            }
        }
        int cnt=0;
        for(int i=0;i<26;i++){
            if(freq[i]>=1&&freq2[i]>=1){
                cnt++;
            }
        }
        return cnt;
    }
}