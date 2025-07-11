class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        int i=0;
        //char ch1[]=pref.toCharArray();
        while(i<words.length){
            if(words[i].startsWith(pref)){
                count++;
            }
            i++;
            }
            return count;
    }
}