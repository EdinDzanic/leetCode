class Solution {
    public boolean isValidSudoku(char[][] board) {
        int size = 9;
        for (int i = 0; i < size; i++) {
            boolean[] row = new boolean[10];
            boolean[] col = new boolean[10];
            boolean[] box = new boolean[10];
            int startX = 3 * (i % 3);
            int startY = 3 * (i / 3);
            for (int j = 0; j < size; j++) {
                
                if (board[i][j] != '.') {
                    if (row[board[i][j] - '0'])
                        return false;
                    row[board[i][j] - '0'] = true;
                }
                
                if (board[j][i] != '.') {
                    if (col[board[j][i] - '0'])
                        return false;
                    col[board[j][i] - '0'] = true;
                }
                
                int x = startX + j % 3;
                int y = startY + j / 3;
                if (board[x][y] != '.') {
                    if (box[board[x][y] - '0'])
                        return false;
                    box[board[x][y] - '0'] = true;
                }
            }
        }
        
        return true;
    }
}