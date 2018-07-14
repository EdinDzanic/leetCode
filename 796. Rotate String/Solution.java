class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length() != B.length())
            return false;
        
        if(A.equals(B))
            return true;
        
        for(int i = 0; i <= A.length(); i++) {
            if(B.indexOf(A.substring(0, i)) != -1 && A.indexOf(B.substring(i)) != -1)
                return true;
            if(B.indexOf(A.substring(i)) != -1 && A.indexOf(B.substring(0, i)) != -1)
                return true;
        }
           
        return false;
    }
}