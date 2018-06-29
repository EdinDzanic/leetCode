class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int sign = x < 0 ? -1: 1;
        x *= sign;
        
        while(x > 0) {
            int rem = x % 10;
            int prev = reversed;
            reversed = (reversed * 10) + rem;
            if(prev != (reversed - rem) / 10) return 0;
            x /= 10;
        }
        
        return reversed * sign;
    }
}