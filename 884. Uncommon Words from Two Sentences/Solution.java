class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> words = new HashMap<>();
        
        String[] wordsInA = A.split(" ");
        String[] wordsInB = B.split(" ");
        
        for(String word: wordsInA) {
            words.put(word, words.getOrDefault(word, 0) + 1);
        }
        
        for(String word: wordsInB) {
            words.put(word, words.getOrDefault(word, 0) + 1);
        }
        
        List<String> uncommonWords = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: words.entrySet()) {
            if(entry.getValue() == 1) {
                uncommonWords.add(entry.getKey());
            }
        }
        
        return uncommonWords.toArray(new String[0]);
    }
}