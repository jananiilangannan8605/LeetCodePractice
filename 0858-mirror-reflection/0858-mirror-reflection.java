class Solution {
    public int mirrorReflection(int p, int q) {
       int g=gcd(p,q);
       int m=p/g;
       int n=q/g;
       if(m%2==1&&n%2==1) return 1;
       if(m%2==1&&n%2==0) return 0;
       return 2;
    }
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    
}