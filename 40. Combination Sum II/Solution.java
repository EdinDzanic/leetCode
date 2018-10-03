class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        Arrays.sort(candidates);
        
        generateCombinations(candidates, target, 0, new ArrayList<Integer>(), combinations);
        
        return combinations;
    }
    
    public void generateCombinations(int[] candidates, int target, int index, List<Integer> combination, List<List<Integer>> combinations) {
        if (target == 0)
            combinations.add(new ArrayList<Integer>(combination));
        
        for(int i = index; i < candidates.length; i++) {
            int sum = target - candidates[i];
            
            if (sum < 0) break;
            
            combination.add(candidates[i]);
            generateCombinations(candidates, sum, i + 1, combination, combinations);
                
            combination.remove(combination.size() - 1);
            
            while (i + 1 < candidates.length && candidates[i] == candidates[i + 1])
                i++;
        }
    }
}