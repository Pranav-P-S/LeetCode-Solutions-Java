// LeetCode Problem: TwoSum 1
// Solution by: @Pranav-P-S

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                return new int[] {map.get(nums[i]),i};
            }
            else{
                map.put((target-nums[i]),i);
            }
        }
        return new int[] {0,0};
 
    }
}
