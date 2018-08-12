class Solution {
    public int findComplement(int num) {
        
        int complement = 0;
        int pow = 1;
        while(num > 0) {
            int bit = num % 2;
            complement += pow * (bit ^ 1);
            
            num /= 2;
            pow *= 2;
        }
        
        return complement;
    }
}