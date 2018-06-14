class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] greater = new int[nums1.length];       
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums2.length; i++)
            map.put(nums2[i], i);
        
        for(int i = 0; i < nums1.length; i++) {
            int index = map.get(nums1[i]);
            
            int nextGreater = -1;
            while(index < nums2.length) {
                if(nums2[index] > nums1[i]) {
                    nextGreater = nums2[index];
                    break;
                }
                index++;
            }
            
            greater[i] = nextGreater;
        }
        
        return greater;
    }
}