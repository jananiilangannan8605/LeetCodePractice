class Solution {
    public boolean isValid(String word) {
        boolean up=false;
        boolean low=false;
        boolean dig=false;
        boolean vow=false;
        boolean con=false;
        if(word.length()<3) return false;
            for(char c:word.toCharArray()){
               if(!Character.isLetterOrDigit(c)) return false;
               if(Character.isLetter(c)){
               if(isvowel(c)) vow=true;
               else con=true;
               }
               
            }
            return vow && con;
    }
    private boolean isvowel(char c){
        char ch=Character.toLowerCase(c);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true;
        return false;
    }
}