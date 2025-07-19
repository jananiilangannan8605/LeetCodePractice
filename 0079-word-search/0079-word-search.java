class Solution {
    public boolean exist(char[][] board, String word) {
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(dfs(i,j,board,word,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(int i,int j, char[][]board,String word,int ind){
        int r=board.length;
        int c=board[0].length;
        if(ind==word.length()) return true;
        if(i<0||i>=r||j<0||j>=c||board[i][j]!=word.charAt(ind)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='#';
        boolean found=dfs(i+1,j,board,word,ind+1)||
        dfs(i,j+1,board,word,ind+1)||
        dfs(i-1,j,board,word,ind+1)||
        dfs(i,j-1,board,word,ind+1);
        board[i][j]=temp;
        return found;
    }
}