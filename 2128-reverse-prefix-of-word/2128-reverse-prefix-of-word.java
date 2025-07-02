class Solution {
    public String reversePrefix(String word, char ch) {
        int ind=-1;
        //char c='';
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                ind=i;
                //c=word.charAt(i);
                break;
            }
        }
        if(ind==-1) return word;
        String sub=word.substring(0,ind+1);
        StringBuilder sb=new StringBuilder(sub);
        sb=sb.reverse();
        String sub2=word.substring(ind+1,word.length());
        StringBuilder sb2=new StringBuilder(sub2);
        sb=sb.append(sb2);
        return sb.toString();
    }
}