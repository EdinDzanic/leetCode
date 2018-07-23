class Solution {
    public int titleToNumber(String s) {
        
        char[] sArr = s.toCharArray();
        int col = 0;
        
        for(int i = sArr.length - 1; i >= 0; i--) {
            int pow = sArr.length - i - 1;
            col += Math.pow(26, pow) * ((int)(sArr[i] - 'A') + 1);
        }
        
        return col;
    }
}