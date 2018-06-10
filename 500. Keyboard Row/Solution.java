class Solution {
    public String[] findWords(String[] words) {
        List<String> rowWords = new ArrayList<String>();
        
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        
        for(String word: words) {
            String lower = word.toLowerCase();
            
            String row = null;
            char c = lower.charAt(0);
            if(firstRow.indexOf(c) != -1)
                row = firstRow;
            else if(secondRow.indexOf(c) != -1)
                row = secondRow;
            else
                row = thirdRow;
            
            boolean contains = true;
            for(int i = 1; i < lower.length() && contains; i++)
                contains = row.indexOf(lower.charAt(i)) != -1;
            
            if(contains)
                rowWords.add(word);
        }
        
        return rowWords.toArray(new String[rowWords.size()]);
    }

}