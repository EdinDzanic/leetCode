class Solution {
    public int numTrees(int n) {
        return (int)(binomialCoeff(2 * n, n) / (n + 1));
    }
    
    public long binomialCoeff(int n, int k) { 
        long res = 1; 
        
        // Since C(n, k) = C(n, n-k) 
        if (k > n - k) 
            k = n - k; 
        
        // Calculate value of [n*(n-1)*---*(n-k+1)] / [k*(k-1)*---*1] 
        for (int i = 0; i < k; i++) { 
            res *= (n - i); 
            res /= (i + 1); 
        } 
        
        return res;
    } 
}