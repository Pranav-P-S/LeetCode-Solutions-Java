// LeetCode Problem: MinimumSizeSubarraySum 209
// Solution by: @Pranav-P-S

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int length=nums.length;
        int result=Integer.MAX_VALUE;
        int total=0;
        for(int r=0;r<length;r++){
            total+=nums[r];

            while(total>=target){
                result=Math.min(result,r-l+1);
                total-=nums[l];
                l++;
            }

        }
        if (result==Integer.MAX_VALUE) return 0;
        else return result;      
    }
}