class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();
        for(int num: nums) {
            if (seen.containsKey(num) && seen.get(num) == 1) {
                return true;
            }
            seen.put(num, 1);
        }
            return false;
    }
}