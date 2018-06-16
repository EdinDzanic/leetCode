class Solution {
    public String toGoatLatin(String S) {
        String[] words = S.split(" ");        
        return toGoatWords(words);
    }
    
    public String toGoatWords(String[] words) {
        StringBuilder sb = new StringBuilder("a");
        StringBuilder goatWords = new StringBuilder();
        
        for(int i = 0; i < words.length; i++) {
            goatWords.append(toGoatWord(words[i], sb));
            sb.append("a");
            goatWords.append(" ");
        }
        
        return goatWords.toString().trim();
    }

    public String toGoatWord(String word, StringBuilder suffix) {
        char first = word.charAt(0);
        
        String goatWord = "";
        if(isVowel(Character.toLowerCase(first))) 
            goatWord = word;
        else
            goatWord = word.substring(1) + first;
            
        return goatWord + "ma" + suffix.toString();
    }
    
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}