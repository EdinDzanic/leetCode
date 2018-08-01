class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         
        int n = nums.length;
        int[] in = new int[n];
        for(int i = 0; i < n; i++)
            in[nums[i] - 1] = -1;
        
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
            if(in[i] != -1)
                numbers.add(i + 1);
        
        return numbers;
    }
}