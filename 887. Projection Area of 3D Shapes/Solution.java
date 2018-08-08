class Solution {
    public int projectionArea(int[][] grid) {
        
        int area = 0;
        int N = grid.length;
        for(int i = 0; i < N; i++) {
            int max1 = 0;
            int max2 = 0;
            
            for(int j = 0; j < N; j++) {
                max1 = Math.max(max1, grid[i][j]);
                max2 = Math.max(max2, grid[j][i]);
                
                if(grid[i][j] > 0)
                    area++;
            }
            
            area += max1;
            area += max2;
        }
        
        return area;
    }
}