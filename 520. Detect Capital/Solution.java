class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1)
            return true;

        boolean isUpper = isUpper(word.charAt(0));
        boolean isLower = !isUpper;
        boolean isTitle = isUpper;
        
        for(int i = 1; i < word.length(); i++) {
            boolean c = isUpper(word.charAt(i));
            isUpper = isUpper && c;
            isLower = isLower && !c;
            isTitle = isTitle && !c;
        }
        
        return isUpper || isLower || isTitle;
    }
    
    public boolean isUpper(char c) {
        return 'A' <= c && c <= 'Z';
    }
}