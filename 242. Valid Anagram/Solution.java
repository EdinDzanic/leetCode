class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        // if input constains unicode characters we can
        // replace the array map with a hashmap
        int[] map = new int[26];
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        
        for(int i = 0; i < s.length(); i++) {
            map[(arrS[i] - 'a')]++;
            map[(arrT[i] - 'a')]--;
        }
            
        for(int i: map)
            if(i != 0)
                return false;
        
        return true;
    }
}