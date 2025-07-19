class Solution {
    public int islandPerimeter(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int res=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    res+=dfs(i,j,grid);
                }
            }
        }
        return res;
    }
    public static int dfs(int i, int j, int[][]grid){
        int r=grid.length;
        int c=grid[0].length;
        if(i<0||i>=r||j<0||j>=c||grid[i][j]==0){
            return 1;
        }
        int m=0;
        if(grid[i][j]==2) return 0;
        grid[i][j]=2;
       m+= dfs(i+1,j,grid);
        m+=dfs(i,j+1,grid);
        m+=dfs(i-1,j,grid);
        m+=dfs(i,j-1,grid);
        return m;

    }
}