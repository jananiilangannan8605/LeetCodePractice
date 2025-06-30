class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        int val=0;
        for(int i=0;i<details.length;i++){
            String st=details[i];
            String s=st.substring(11,13);
             val=Integer.valueOf(s);
             if(val>60) count++;
        }
        
        
        return count;
    }
}