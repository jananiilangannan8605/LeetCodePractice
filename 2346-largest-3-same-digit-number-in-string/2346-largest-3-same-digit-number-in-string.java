class Solution {
    public String largestGoodInteger(String num) {
        String res="";
       int max=Integer.MIN_VALUE;
       for(int i=0;i<num.length()-2;i++){
        String s=num.substring(i,i+3);
        if(s.charAt(0)==s.charAt(1)&&s.charAt(0)==s.charAt(2)){
            int val=Integer.valueOf(s);
            if(val>max){
                max=val;
                res=s;
            }
        }
       }
       return res;
    }
}