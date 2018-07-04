class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);                

        String longest = "";
        Set<String> built = new HashSet<String>();

        for (String w : words) {
            if (w.length() == 1 || built.contains(w.substring(0, w.length() - 1))) {
                longest = w.length() > longest.length() ? w : longest;
                built.add(w);
            }
        }

        return longest;
    }
}