class Solution {
    public boolean isPalindrome(int x) {
        //int x=121;
        int y=Math.abs(x);
        int rev=0;
        while(x!=0){
            int dig=x%10;
            rev=rev*10+dig;
            x/=10;
            
        }
        if(y==rev){
            return true;
        }
        else 
        return false;
    }
}