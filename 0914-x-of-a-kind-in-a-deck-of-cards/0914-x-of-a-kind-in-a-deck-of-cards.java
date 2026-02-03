class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length==1) return false;
       HashMap<Integer, Integer> map=new HashMap<>();
       for(int a:deck){
        map.put(a, map.getOrDefault(a,0)+1);
       }
       int gcd=0;
       for(int a:map.values()){
         gcd=gcd(a,gcd);
       }
       return gcd>=2;
    }
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}