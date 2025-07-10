class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        String s=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            sb.append(c=='0'?'1':'0');
        }
        return Integer.parseInt(sb.toString(),2);
    }
}