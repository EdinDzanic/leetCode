class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        
        int current = left;
        while(current <= right) {
            if(isSelfDividing(current))
                result.add(current);
            
            current++;
        }
        
        return result;
    }
    
    public boolean isSelfDividing(int number) {      
        int n = number;
        while(n > 0) {
            int digit = n % 10;
            
            if(digit == 0 || number % digit != 0)
                return false;
            
            n /= 10;
        }
        
        return true;
    }
}