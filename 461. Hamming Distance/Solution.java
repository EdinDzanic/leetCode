class Solution {
    public int hammingDistance(int x, int y) {
        int distance = 0;
        int xor = x ^ y;
        
        while(xor != 0) {
            distance++;
            xor &= xor - 1;
        }
        
        return distance;
    }
}