class Solution {
    public int rotatedDigits(int N) {
        int goodNumbers = 0;
        
        for(int i = 1; i <= N; i++) {
            
            int number = i;
            int rotatedNumber = 0;
            boolean isGood = true;
            int mult = 1;
            while(isGood && number > 0) {
                int digit = number % 10;
                isGood = isGoodAfterRotation(digit);
                rotatedNumber += rotate(digit) * mult;
                mult *= 10;
                number /= 10;
            }
            
            if(isGood && rotatedNumber != i) goodNumbers++;
            
        }
        
        return goodNumbers;
    }
    
    public boolean isGoodAfterRotation(int digit) {
        return digit != 3 && digit != 4 && digit != 7;
    }
    
    public int rotate(int digit) {
        if(digit == 2) return 5;
        if(digit == 5) return 2;
        if(digit == 6) return 9;
        if(digit == 9) return 6;
        
        return digit;
    }
}