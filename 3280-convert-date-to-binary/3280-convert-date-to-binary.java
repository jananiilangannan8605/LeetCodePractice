import java.math.BigInteger;
class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb=new StringBuilder();
        String a="";
        for(String s:date.split("-")){
            a = new BigInteger(s).toString(2);
            sb.append(a+"-");
        }
         sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}