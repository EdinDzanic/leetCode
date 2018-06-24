class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int num1: nums1)
            set.add(num1);
        
        List<Integer> list = new ArrayList<>();
        for(int num2: nums2)
            if(set.contains(num2)) {
                list.add(num2);
                set.remove(num2);
            }
        
        int[] intersection = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            intersection[i] = list.get(i);
        
        return intersection;
    }
}