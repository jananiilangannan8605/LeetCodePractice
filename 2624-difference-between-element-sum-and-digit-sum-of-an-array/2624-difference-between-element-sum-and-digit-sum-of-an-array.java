class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0;
         StringBuilder sb=new StringBuilder();
        for(int i:nums){
            sum1+=i;
            sb.append(i);
        }
        int sum2=0;
        String str=sb.toString();
        char[] ch=str.toCharArray();
       // int sum2=0;
        for(char c:ch){
            sum2+=(c-'0');
        }
        return Math.abs(sum1-sum2);
    }
}