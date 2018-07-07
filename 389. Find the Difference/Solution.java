class Solution {
    public char findTheDifference(String s, String t) {
        int[] occ = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            occ[(int)(s.charAt(i) - 'a')]++;
            occ[(int)(t.charAt(i) - 'a')]--;
        }
        
        occ[(int)(t.charAt(t.length() - 1) - 'a')]--;
        
        for(int i = 0; i < occ.length; i++)
            if(occ[i] < 0)
                return (char)(i + 'a');
        
        return ' ';
    }
}