class Solution {
    public String reverseVowels(String s) {
            char[]ch=s.toCharArray();
            int st=0;
            int end=s.length()-1;
            while(st<end){
                while(st<end&&!(ch[st]=='a'||ch[st]=='e'||ch[st]=='i'||ch[st]=='o'||ch[st]=='u'||ch[st]=='A'||ch[st]=='E'||ch[st]=='I'||ch[st]=='O'||ch[st]=='U') ){
                    st++;
                }
                while(st<end&&!(ch[end]=='a'||ch[end]=='e'||ch[end]=='i'||ch[end]=='o'||ch[end]=='u'||ch[end]=='A'||ch[end]=='E'||ch[end]=='I'||ch[end]=='O'||ch[end]=='U')) {
                    end--;
                }

                char temp=ch[st];
                ch[st]=ch[end];
                ch[end]=temp;
                st++;
                end--;
            }
            
            return new String(ch);
    }
}