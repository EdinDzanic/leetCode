class Solution {
    public String reverseString(String s) {
        
        char[] characters = s.toCharArray();
        int begin = 0; 
        int end = characters.length - 1;
        
        while(begin < end) {
            char temp = characters[begin];
            characters[begin] = characters[end];
            characters[end] = temp;
            
            begin++;
            end--;
        }
               
        return String.valueOf(characters);    
    } 
}