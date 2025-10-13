class Solution {
    public String licenseKeyFormatting(String s, int k) {
      s= s.toUpperCase();  
      StringBuilder sb=new StringBuilder();
      for(char c:s.toCharArray()){
        if(c!='-'){
            sb.append(c);
        }
      }
      sb.reverse();
        StringBuilder formatted = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (i > 0 && i % k == 0) {
                formatted.append('-');
            }
            formatted.append(sb.charAt(i));
        }
        return formatted.reverse().toString();
    }
}