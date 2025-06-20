// LeetCode Problem: SingleNumber 136
// Solution by: @Pranav-P-S

class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        return xor;
    }
}