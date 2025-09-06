class Solution {
    public int secondHighest(String s) {
        TreeSet<Integer> set=new TreeSet<>();
        for(char c:s.toCharArray()){
            if(c>='0'&&c<='9'){
               int d=c-'0';
               set.add(d);
            }
        }
        if(set.size()<2) return -1;
        set.pollLast();
        return set.last();
    }
}