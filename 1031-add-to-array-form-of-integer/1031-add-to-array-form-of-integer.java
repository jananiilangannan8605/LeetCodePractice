import java.math.*;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
    StringBuilder sb=new StringBuilder();
        for(int i:num){
          sb.append(i);
        }
        String str=sb.toString();
        BigInteger bg=new BigInteger(str);
        BigInteger sum=bg.add(BigInteger.valueOf(k));
        String var=sum.toString();
        List<Integer>list=new ArrayList<>();

        for(char c:var.toCharArray()){
        list.add(c-'0');
    }
    return list;
    }
}