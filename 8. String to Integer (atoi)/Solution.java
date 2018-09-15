class Solution {
    public int myAtoi(String str) {
        
        boolean positive = true;
        
        int i = 0;
        char[] strArr = str.toCharArray();
        while(i < strArr.length && strArr[i] == ' ')
            i++;

        if(i < strArr.length && (strArr[i] == '-' || strArr[i] == '+')){
            positive = strArr[i] == '+';
            i++;
        }
            
        long number = 0;
        while(i < strArr.length && Character.isDigit(strArr[i])) {
            number *= 10;
            number += strArr[i] - '0';
            i++;
                
            if(number > Integer.MAX_VALUE) {
                return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
            
        return positive ? (int)number : -(int)number;     
    }
}