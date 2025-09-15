class Solution {
    public int similarPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(find(words[i],words[j])) count++;
            }
        }
        return count;
    }
    public boolean find(String s,String t){
        for(char c:s.toCharArray()){
            if(t.indexOf(c)==-1) return false;
        }
        for(char c:t.toCharArray()){
            if(s.indexOf(c)==-1) return false;
        }
        return true;
    }
}