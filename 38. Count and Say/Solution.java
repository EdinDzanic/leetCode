class Solution {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        
        int i = 1;
        String current = "1";
        while(i < n) {

            int count = 1;
            StringBuilder sb = new StringBuilder();
            char[] temp = current.toCharArray();
            char next = temp[0];
            
            for(int j = 1; j < temp.length; j++) {
                if(temp[j] == next) {
                    count++;
                    continue;
                }
                
                sb.append(count);
                sb.append(next);
                count = 1;
                next = temp[j];
            }
            
            sb.append(count);
            sb.append(next);
            current = sb.toString();
            i++;
        }
        
        return current;
    }
}