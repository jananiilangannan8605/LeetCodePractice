class Solution {
    public String reverseWords(String s) {
    String[] str=s.split(" ");
    String string=" ";
    StringBuilder res=new StringBuilder();
    for(String i:str){
        StringBuilder sb=new StringBuilder(i);
        res.append(sb.reverse().append(" "));
    }
    return res.toString().trim();
    }
}