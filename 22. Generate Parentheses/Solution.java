class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> parenthesis = new ArrayList<>();
        
        generate(n, n, "", parenthesis);
        
        return parenthesis;
    }
    
    public void generate(int open, int close, String comb, List<String> parenthesis) {
        if (open == 0 && close == 0)
            parenthesis.add(comb);
        
        if (close > open && close > 0)
            generate(open, close - 1, comb + ")", parenthesis);
        
        if (open > 0)
            generate(open - 1, close, comb + "(", parenthesis);
    }
}