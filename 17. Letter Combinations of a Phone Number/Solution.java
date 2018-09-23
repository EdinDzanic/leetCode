class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) return combinations;
        
        Map<Character, Character[]> map = new HashMap<>();
        map.put('2', new Character[]{'a', 'b', 'c'});
        map.put('3', new Character[]{'d', 'e', 'f'});
        map.put('4', new Character[]{'g', 'h', 'i'});
        map.put('5', new Character[]{'j', 'k', 'l'});
        map.put('6', new Character[]{'m', 'n', 'o'});
        map.put('7', new Character[]{'p', 'q', 'r', 's'});
        map.put('8', new Character[]{'t', 'u', 'v'});
        map.put('9', new Character[]{'w', 'x', 'y', 'z'});
        
        combinations.add("");
        
        char[] digitsArr = digits.toCharArray();
        for (int i = 0, n = digitsArr.length; i < n; i++) {
            int size = combinations.size();
            
            Character[] mapping = map.get(digitsArr[i]);
            
            for (int j = 0; j < size; j++) {
                String el = combinations.get(0);
                combinations.remove(0);

                for (Character c: mapping) {
                    combinations.add(el + c);
                }
            }
        }
        
        return combinations;
    }
}