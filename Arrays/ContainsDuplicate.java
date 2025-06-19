// LeetCode Problem: ContainsDuplicate 217
// Solution by: @Pranav-P-S

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
            for (int n : nums) {
                if (set.contains(n)) {
                    return true;
            }
                set.add(n);
        }     
        return false;        
    }
}
