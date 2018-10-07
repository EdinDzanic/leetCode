class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int carry = 1;
        
        while (carry != 0 && i >= 0) {
            if (digits[i] == 9) {
                digits[i] = 0;
                carry = 1;
            }
            else {
                digits[i]++;
                carry = 0;
                break;
            }
            i--;
        }
        
        if (carry == 1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int j = 1; j < digits.length; j++)
                newDigits[j] = digits[j - 1];
            
            return newDigits;
        }
        
        return digits;
    }
}