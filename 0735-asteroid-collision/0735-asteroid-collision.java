class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int as:asteroids){
            boolean flag=false;
            while(!stack.isEmpty() && stack.peek()>0 && as<0){
                if(Math.abs(as)>stack.peek()){
                    stack.pop();
                }
                else if(Math.abs(as)==stack.peek()){
                    stack.pop();
                    flag=true;
                    break;
                }
                else{
                    flag=true;
                    break;
                }
            }
            if(!flag){
                stack.push(as);
            }
        }
        int res[]=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            res[i]=stack.pop();
        }
        return res;
    }
}