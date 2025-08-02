class Solution {
    public boolean checkPerfectNumber(int num) {
        int n=num;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}