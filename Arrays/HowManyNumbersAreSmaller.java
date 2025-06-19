// LeetCode Problem: HowManyNumbersAreSmaller 1365
// Solution by: @Pranav-P-S

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int l=nums.length;
        int[] ans = new int[l];
        int[] sorted = Arrays.copyOf(nums,l);
        Arrays.sort(sorted);
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<l;i++){
            if(!(map.containsKey(sorted[i]))){
                map.put(sorted[i],i);
            }
        }
        for(int i=0;i<l;i++){
            ans[i]=map.get(nums[i]);
        }
        return ans;
    }
}
