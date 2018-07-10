class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;

        int maxArea = 0; 
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                maxArea = Math.max(maxArea, explore(i, j, grid));
            }
        }
        
        return maxArea;
    }
    
    public int explore(int i, int j, int[][] grid) {
        if(i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == 0)
            return 0;
        
        grid[i][j] = 0;
        
        return 1 + explore(i - 1, j, grid) + explore(i, j - 1, grid) + 
            explore(i + 1, j, grid) + explore(i, j + 1, grid);
    }
}