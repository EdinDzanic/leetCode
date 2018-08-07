class Solution {
    public String toLowerCase(String str) {
        // can be solved with the built in function
        // return str.toLowerCase();
        
        char[] strArr = str.toCharArray();
        for(int i = 0; i < strArr.length; i++) {
            if('A' <= strArr[i] && strArr[i] <= 'Z')
                strArr[i] = (char)(strArr[i] + 'a' - 'A');
        }
        
        return new String(strArr);
    }
}