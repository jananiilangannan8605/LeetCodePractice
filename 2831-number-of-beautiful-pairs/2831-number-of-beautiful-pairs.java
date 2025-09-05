class Solution {
    public int countBeautifulPairs(int[] nums) {
        int cnt=0;
       for(int i=0;i<nums.length;i++){
        int f=0;
        while(nums[i]>0){
            f=nums[i]%10;
            nums[i]/=10;
        }
        for(int j=i+1;j<nums.length;j++){
            int l=nums[j]%10;
            if(gcd(f,l)) cnt++;
        }
       } 
        return cnt;
    }
      public static boolean gcd(int f, int l){
        int gcd=0;
        for(int i=1;i<=Math.min(f,l);i++){
            if(f%i==0&&l%i==0) gcd=i;
        }
        if(gcd==1) return true;
        return false;
       }
       
    }
