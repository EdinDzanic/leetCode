class Solution {
    public String convert(String s, int numRows) {
        
        if (numRows == 1) return s;
        
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++)
            rows.add(new StringBuilder());
        
        int i = 0;
        int row = 0;
        char[] sArr = s.toCharArray();
        while (i < sArr.length) {
            
            while (i < sArr.length && row < numRows - 1) {
                rows.get(row).append(sArr[i]);
                row++;
                i++;
            }
            
            while (i < sArr.length && row > 0) {
                rows.get(row).append(sArr[i]);
                row--;
                i++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (StringBuilder string: rows) {
            sb.append(string);
        }
        
        return sb.toString();
    }
}