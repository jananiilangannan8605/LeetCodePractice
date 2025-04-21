class Solution {
    public int minSteps(String s, String t) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(char c:s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        int count=0;
        for(char c='a';c<='z';c++){
            int freq1=map1.getOrDefault(c,0);
            int freq2=map2.getOrDefault(c,0);
            if(freq1>freq2){
                count+=freq1-freq2;
            }
        }
        return count;
    
    
    }
}