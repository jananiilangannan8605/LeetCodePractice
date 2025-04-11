class Solution {
    public List<String> commonChars(String[] words) {
        String s=words[0];
        List<String> list=new ArrayList<>();
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            String c=s.charAt(i)+"";
            flag=true;
            for(int j=1;j<words.length;j++){
                if(words[j].indexOf(c)==-1){
                    flag=false;
                    break;
                }
                else{
                    int index=words[j].indexOf(c);
                    words[j]=words[j].substring(0,index)+words[j].substring(index+1);
                }
            }
            if(flag) list.add(c);
        }
        return list;
    }
}