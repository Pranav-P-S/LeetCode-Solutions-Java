// LeetCode Problem: MissingNumber 268
// Solution by: @Pranav-P-S

class Solution {
    public int missingNumber(int[] nums) {
        int i;
        int sum1=0,sum2=0;
        for (i=0;i<nums.length;i++){
            sum1+=i;
            sum2+=nums[i];
        }
        sum1+=i;
        return sum1-sum2;
    }
}