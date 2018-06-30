class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length() != B.length())
            return false;  
        
        int n = A.length();
        if(A.equals(B)) {
            Map<Character, Integer> map = new HashMap<>();
            
            for(int i = 0; i < n; i++)
                if(!map.containsKey(A.charAt(i)))
                    map.put(A.charAt(i), 1);
                else
                    map.put(A.charAt(i), map.get(A.charAt(i)) + 1);

            for(Integer val: map.values())
                if(val >= 2)
                    return true;
            
            return false;
        }
        
        char a = ' ', b = ' ';
        boolean swaped = false;
        for(int i = 0; i < n; i++) {
            if(A.charAt(i) != B.charAt(i)) {
                if(swaped)
                    return false;
                
                if(a == ' ') {
                    a = A.charAt(i);
                    b = B.charAt(i);
                } 
                else if(a == B.charAt(i) && b == A.charAt(i))
                    swaped = true;
                else
                    return false;
            }
        }
        
        return true;
    }
}