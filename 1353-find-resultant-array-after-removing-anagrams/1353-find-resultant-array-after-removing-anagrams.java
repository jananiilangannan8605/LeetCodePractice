class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> set=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            char[]ch=words[i].toCharArray();
            Arrays.sort(ch);
            String str1 = new String(ch);
            boolean flag=true;
            if(i>0){
                char ch2[]=words[i-1].toCharArray();
                Arrays.sort(ch2);
                String str2=new String(ch2);
                if(str1.equals(str2)){
                    flag=false;
                }
            }
            if(flag==true) set.add(words[i]);
        }
        return set;
    }
}