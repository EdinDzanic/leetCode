class Solution {
    public boolean isMonotonic(int[] A) {
        return isMonotoneIncreasing(A) || isMonotoneDecreasing(A);
    }
    
    public boolean isMonotoneIncreasing(int[] A) {
        for(int i = 0; i < A.length - 1; i++)
            if(A[i] > A[i + 1])
                return false;
        return true;
    }
    
    public boolean isMonotoneDecreasing(int[] A) {
        for(int i = 0; i < A.length - 1; i++)
            if(A[i] < A[i + 1])
                return false;
        return true;
    }
}