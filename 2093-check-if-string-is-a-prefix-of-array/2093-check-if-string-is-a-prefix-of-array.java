class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String str="";
        //if(s.length()!=words[0].length()) return false;
        for(String word:words){
            str+=word;
    
        if(str.length()==s.length()&&str.startsWith(s)){
            return true;
        }
        }
        return false;
    }
}