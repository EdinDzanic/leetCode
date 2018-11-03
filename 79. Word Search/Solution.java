class Solution {
    
    public boolean exist(char[][] board, String word) {
        
        int m = board.length;
        int n = board[0].length;
        
        boolean[][] visited = new boolean[m][];
        for (int i = 0; i < m; i++) {
            visited[i] = new boolean[n];
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean wordExists = false;
                if (word.charAt(0) == board[i][j])
                    wordExists = searchBoard(i, j, board, visited, 0, word);
                if (wordExists) return true;
            }
        }
        
        return false;
    }
    
    public boolean searchBoard(int x, int y, char[][] board, boolean[][] visited, int next, String word) {
        
        if (next == word.length()) return true;
        
        boolean outOfBounds = x < 0 || y < 0 || 
            x >= board.length || y >= board[0].length;
        if (outOfBounds || visited[x][y] || board[x][y] != word.charAt(next)) 
            return false;
        
        visited[x][y] = true;
        
        if (searchBoard(x - 1, y, board, visited, next + 1, word) ||
            searchBoard(x, y - 1, board, visited, next + 1, word) ||
            searchBoard(x + 1, y, board, visited, next + 1, word) ||
            searchBoard(x, y + 1, board, visited, next + 1, word))
            return true;
        
        visited[x][y] = false;
        
        return false;
    }
    
}