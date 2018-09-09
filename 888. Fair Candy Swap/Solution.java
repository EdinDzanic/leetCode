class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        for(int barSize: A)
            sumA += barSize;
        
        Set<Integer> set = new HashSet<>();
        int sumB = 0;
        for(int barSize: B) {
            sumB += barSize;
            set.add(barSize);
        }
        
        int diff = (sumB - sumA) / 2;

        for (int barSize : A) {
            if (set.contains(barSize + diff)) {
                return new int[]{barSize, barSize + diff};
            }
        }
        
        return null;
    }
}