class Solution {
    public int countPrefixes(String[] words, String s) {
        int i=0;
        int count=0;
        while(i<words.length){
            if(s.startsWith(words[i])){
                count++;
            }
            i++;
        }
        return count;
    }
}