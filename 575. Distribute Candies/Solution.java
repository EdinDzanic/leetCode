class Solution {
    public int distributeCandies(int[] candies) {
        int candiesToTake = candies.length / 2;
        
        Set<Integer> set = new HashSet<>();
        for(int candy: candies) {
            set.add(candy);
            
            if(set.size() >= candiesToTake)
                return candiesToTake;
        }
        
        return set.size();
    }
}