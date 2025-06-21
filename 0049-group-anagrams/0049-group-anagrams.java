class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
       
        
        for(String word:strs){
         char[]ch=word.toCharArray();
        Arrays.sort(ch);
        String sorted=new String(ch);
        map.putIfAbsent(sorted,new ArrayList<>());
        map.get(sorted).add(word);

        }
        return new ArrayList<>(map.values());
    }
}