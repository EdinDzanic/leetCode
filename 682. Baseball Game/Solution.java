class Solution {
    public int calPoints(String[] ops) {
        List<Integer> points = new ArrayList<>();
        
        int sum = 0;
        for(int i = 0; i < ops.length; i++) {
            
            int next = 0;
            if(ops[i].equals("C")) {
                next = (-1) * points.get(points.size() - 1);
                points.remove(points.size() - 1);
            }
            else { 
                if(ops[i].equals("+")) 
                    next = points.get(points.size() - 1) + points.get(points.size() - 2);
                else if(ops[i].equals("D"))
                    next = 2 * points.get(points.size() - 1);
                else 
                    next = Integer.parseInt(ops[i]);
                
                points.add(next);
            }
            
            sum += next;
        }
        
        return sum;
    }
}