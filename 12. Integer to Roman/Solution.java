class Solution {
    public String intToRoman(int num) {
        
        String roman = "";
        String[] digit1 = {"I", "X", "C", "M"};
        String[] digit5 = {"V", "L", "D"};
        
        int i = 0;
        while (num > 0) {
            int digit = num % 10;
            
            if (digit == 4) {
                roman = digit1[i] + digit5[i] + roman;
            }
            else if (digit == 9) {
                roman = digit1[i] + digit1[i + 1] + roman;
            }
            else {
                String s = "";
                if (digit >= 5)
                    s += digit5[i];
                
                digit %= 5;
                for (int k = 0; k < digit; k++)
                   s += digit1[i];
                
                roman = s + roman;
            }
            
            i++;
            num /= 10;
        }
        
        return roman;
    }
}