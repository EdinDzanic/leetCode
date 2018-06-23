class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;

        int leftToRight = x;
        int rightToLeft = 0;
        while(x > 0) {
            rightToLeft = rightToLeft * 10 + (x % 10);
            x /= 10;
        }
        
        return leftToRight == rightToLeft;
    }
}