class Solution {
    public int countBinarySubstrings(String s) {
        char[] sArr = s.toCharArray();
        
        int count = 0;
        
        int i = 0;
        int first = 0;
        int second = 0;
        char prev = sArr[i];
        while(i < sArr.length) {
            
            if(sArr[i] == prev) {
                first++;
            }
            else {
                count += Math.min(first, second);
                prev = sArr[i];
                second = first;
                first = 1;
            }

            i++;
        }
        
        count += Math.min(first, second);
        
        return count;
    }
}