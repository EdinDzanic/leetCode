class Solution {
    public int peakIndexInMountainArray(int[] A) {
        return findPeak(A, 0, A.length);
    }
    
    public int findPeak(int[] A, int start, int end) {
        int index = (start + end) / 2;
        if(A[index - 1] < A[index] && A[index] > A[index + 1])
            return index;
        
        if(A[index] >= A[index + 1])
            return findPeak(A, start, index);
        else
            return findPeak(A, index, end);        
    }
}