class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        for(String op:operations){
            if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                st.push(2*st.peek());
            }
             else if(op.equals("+")){
                int top=st.pop();
                int newtop=top+st.peek();
                st.push(top);
                st.push(newtop);
            }
            else {
                st.push(Integer.parseInt(op));
            }
        }
        int num=0;
        while(!st.isEmpty()){
            num+=st.pop();
        }
        return num;
    }
}