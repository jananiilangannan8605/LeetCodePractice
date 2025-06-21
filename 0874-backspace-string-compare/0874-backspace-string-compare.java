class Solution {
    public boolean backspaceCompare(String s, String t) {
       return funstack(s).equals(funstack(t));
    }
    private String funstack(String str){
        Stack<Character> stack=new Stack<>();
        for(char c:str.toCharArray()){
            if(c!='#'){
            stack.push(c);
            }
            else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:stack){
            sb.append(c);
        }
        return sb.toString();
    }
}