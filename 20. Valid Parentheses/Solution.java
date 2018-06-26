class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        char[] charArr = s.toCharArray();
        
        for(int i = 0; i < charArr.length; i++) {           
            if(isLeftBracket(charArr[i])) 
                stack.push(charArr[i]);
            else if(stack.isEmpty() || !isSameType(stack.pop(), charArr[i]))
                return false;
        }
        
        return stack.isEmpty();
    }
    
    public boolean isLeftBracket(char left) {
        return left == '(' || left == '[' || left == '{';
    }       
    
    public boolean isSameType(char left, char right) {
        return (left == '(' && right == ')') ||
               (left == '[' && right == ']') ||
               (left == '{' && right == '}');
    }
}