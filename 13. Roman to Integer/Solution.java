class Solution {
    public int romanToInt(String s) {
        int number = 0;
        char[] roman = s.toCharArray();
        
        for(int i = 0; i < roman.length; i++) {
            
            int numeral = 0;
            switch(roman[i]) {
                case 'I':
                    numeral = 1;
                    break;
                case 'V':
                    numeral = 5;
                    break;
                case 'X':
                    numeral = 10;
                    break;
                case 'L':
                    numeral = 50;
                    break;
                case 'C':
                    numeral = 100;
                    break;
                case 'D':
                    numeral = 500;
                    break;
                case 'M':
                    numeral = 1000;
                    break;
                default:
                    numeral = 0;
            }
            
            number += numeral;
            
            if(i - 1 >= 0) {
                if((roman[i] == 'V' || roman[i] == 'X') && roman[i - 1] == 'I')
                    number -= 2;
                if((roman[i] == 'L' || roman[i] == 'C') && roman[i - 1] == 'X')
                    number -= 20;
                if((roman[i] == 'D' || roman[i] == 'M') && roman[i - 1] == 'C')
                    number -= 200;
            }
                
        }
        
        return number;
    }
}