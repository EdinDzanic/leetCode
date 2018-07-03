class Solution {
    public String convertToBase7(int num) {
        // can be solved by using the built in static method of Integer class
        // Integer.toString(num, 7);
        if(num == 0)
            return "0";
        
        StringBuilder sb = new StringBuilder();
        String sign = "";
        if(num < 0) {
            sign = "-";
            num = Math.abs(num);
        }
        
        while(num > 0) {
            sb.append(num % 7);
            num /= 7;
        }
        
        return sign + sb.reverse().toString();
    }
}