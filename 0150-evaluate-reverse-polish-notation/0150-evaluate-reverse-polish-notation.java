class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int peek=st.peek();
                st.pop();
                int peek1=st.peek();
                st.pop();
                st.push(peek+peek1);
            }
            else if(tokens[i].equals("-")){
                int peek1=st.peek();
                st.pop();
                int peek2=st.peek();
                st.pop();
                st.push(peek2-peek1);
            }
            else if(tokens[i].equals("*")){
                int peek=st.peek();
                st.pop();
                int peek1=st.peek();
                st.pop();
                st.push(peek*peek1);
            }
            else if(tokens[i].equals("/")){
                int peek=st.peek();
                st.pop();
                int peek1=st.peek();
                st.pop();
                st.push(peek1/peek);

            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    
    }
}