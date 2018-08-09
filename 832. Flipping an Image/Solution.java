class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        int[][] image = new int[A.length][];
        int n = A.length;
        int m = A[0].length;
        
        for(int i = 0; i < n; i++) {
            image[i] = new int[m];
            
            for(int j = 0; j < m; j++) {
                image[i][m - j - 1] = A[i][j] ^ 1;
            }
        }
        
        return image;
    }
}