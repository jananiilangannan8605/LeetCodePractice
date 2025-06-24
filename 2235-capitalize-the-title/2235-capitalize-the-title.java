class Solution {
    public String capitalizeTitle(String title) {
       String str=title.toLowerCase();
        String[] st=str.split(" "); 
        String words="";
        for(String word:st){
         if(word.length()<3){
            words+=word+" ";
         }
         else{
          words += Character.toUpperCase(word.charAt(0)) + word.substring(1)+" ";
        }
        
        }
        return words.trim();
    }
}