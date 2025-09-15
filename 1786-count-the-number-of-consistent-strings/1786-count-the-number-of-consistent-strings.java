class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt=0;
       for(int i=0;i<words.length;i++){
        boolean flag=true;
        for(char c:words[i].toCharArray()){
            if(allowed.indexOf(c)==-1){
                flag=false;
            }
        }
        if(flag==true) cnt++;

       }
        return cnt;
    }
}