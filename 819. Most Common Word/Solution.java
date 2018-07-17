class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.split("!|\\?|'|,|;|\\.| ");
        Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));
        
        Map<String, Integer> map = new HashMap<>();
        String mostCommon = "";
        int max = 0;
        
        for(String word: words) {
            String lower = word.toLowerCase();
            if(!lower.isEmpty() && !bannedWords.contains(lower)) {
                map.put(lower, map.getOrDefault(lower, 0) + 1);
                
                if(map.get(lower) > max) {
                    mostCommon = lower;
                    max = map.get(lower);
                }
            }
        }
        
        return mostCommon;
    }
}