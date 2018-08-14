class Solution {
    public int binaryGap(int N) {
        
        int gap = 0;
        int i = 0;
        int last = -1;
        while(N > 0) {
            int bit = N % 2;
            if(bit == 1) {
                if(last != -1)
                    gap = Math.max(gap, i - last);
                last = i;
            }
            
            i++;
            N /= 2;
        }
        
        return gap;
    }
}