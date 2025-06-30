class Solution {
    public int numIslands(char[][] grid) {
         if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int count = 0;
        
        // Loop through each cell of the grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') { // Found an island
                    count++;
                    dfs(grid, i, j); // Mark all connected land
                }
            }
        }
        
        return count;
    }

    // DFS to mark connected lands as visited
    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return; // Out of bounds or water
        }

        grid[i][j] = '0'; // Mark current cell as visited
        
        // Explore in all 4 directions
        dfs(grid, i - 1, j); // Up
        dfs(grid, i + 1, j); // Down
        dfs(grid, i, j - 1); // Left
        dfs(grid, i, j + 1); // Right
    }
}