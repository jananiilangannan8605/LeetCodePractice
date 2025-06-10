class Solution {
    public int maxDifference(String s) {
        int freq[]=new int[26];
        char[]ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            freq[ch[i]-'a']++;
        }
        int a1=0, a2=Integer.MAX_VALUE;
        for(int i=0;i<freq.length;i++){
            if(freq[i]%2==1){
                a1=Math.max(a1,freq[i]);
            }
            if(freq[i]%2==0 && freq[i]>0){
                a2=Math.min(a2,freq[i]);
            }
        }
        return a1-a2;
    }
}