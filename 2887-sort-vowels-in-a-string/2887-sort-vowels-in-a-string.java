class Solution {
    public String sortVowels(String s) {
        String vo="AEIOUaeiou";
        List<Character> l=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(vo.indexOf(c)!=-1) l.add(c);
        }
        Collections.sort(l);
        String res="";
        int ind=0;
        for(char c:s.toCharArray()){
            if(vo.indexOf(c)!=-1){
                res+=l.get(ind);
                ind++;
            }
            else{
                res+=c;
            }
        }
        return res;



    }
}