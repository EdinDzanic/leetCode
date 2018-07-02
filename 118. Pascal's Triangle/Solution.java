class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if(numRows >= 1) {
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            triangle.add(firstRow);
        }
        
        int i = 1;
        while(i < numRows) {
            List<Integer> lastRow = triangle.get(triangle.size() - 1);
            List<Integer> newRow = new ArrayList<>();
            
            newRow.add(1);
            for(int j = 0; j < i - 1; j++) 
                newRow.add(lastRow.get(j) + lastRow.get(j + 1));
            newRow.add(1);
            
            triangle.add(newRow);
            i++;
        }     
        
        return triangle;
    }
}