class Solution {
    public int compress(char[] chars) {
        if(chars.length == 0)
            return 0;
        
        int length = 0;
        int count = 1;
        char c = chars[0];
        for(int i = 1; i < chars.length; i++) {
            if(chars[i] == c)
                count++;
            else {
                chars[length] = c;
                length++;
                
                if(count > 1)
                    length += modify(length, chars, count);             
                
                count = 1;
                c = chars[i];
            }
        }

        chars[length] = c;
        length++;
        
        if(count > 1)
            length += modify(length, chars, count);

        return length;
    }
    
    public int modify(int length, char[] chars, int count) {
        String str = String.valueOf(count);
        for(int k = 0; k < str.length(); k++) {
            chars[k + length] = str.charAt(k);
        }  
        return str.length();
    }
}