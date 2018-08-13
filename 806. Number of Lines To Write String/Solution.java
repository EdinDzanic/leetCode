class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        final int LINE_WIDTH = 100;
        
        int lines = 1;
        int units = 0;
        for(int i = 0; i < S.length(); i++) {
            int charWidth = widths[(S.charAt(i) - 'a')];
            units += charWidth;
            
            if(units > LINE_WIDTH) {
                lines++;
                units = charWidth;
            }                  
        }
        
        int[] result = new int[2];
        result[0] = lines;
        result[1] = units;                         
                                   
        return result;
    }
}