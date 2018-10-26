class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        for (int i = 0; i < m; i++) {
            if (target <= matrix[i][n - 1]) {
                return binarySearch(matrix[i], target);
            }
        }
        
        return false;
    }
    
    public boolean binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        
        while (start <= end) {
            int middle = (start + end) / 2;
            if (array[middle] == target)
                return true;
            else if (target > array[middle])
                start = middle + 1;
            else
                end = middle - 1;
        }
        
        return false;
    }
}