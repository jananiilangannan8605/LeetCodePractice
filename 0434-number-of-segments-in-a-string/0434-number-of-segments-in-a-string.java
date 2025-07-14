class Solution {
    public int countSegments(String s) {
       if(s==null ||s.length()<1||s.trim().isEmpty()) return 0;
        return s.trim().split("\\s+").length;
        
    }
}
