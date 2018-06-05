class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] shortestDistance = new int[S.length()];
        
        int prev = Integer.MAX_VALUE;
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == C) prev = i;
            shortestDistance[i] = Math.abs(prev - i);
        }
        
        prev = Integer.MAX_VALUE;
        for(int i = S.length() - 1; i >= 0; i--) {
            if(S.charAt(i) == C) prev = i;
            shortestDistance[i] = Math.min(shortestDistance[i], prev - i);
        }
        
        return shortestDistance;
    }
}