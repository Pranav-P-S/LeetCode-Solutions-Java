// LeetCode Problem: MinimumAbsoluteDifference 1200
// Solution by: @Pranav-P-S

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int l = arr.length;
        
        // Find minimum absolute difference
        int minDiff = arr[1] - arr[0];
        for (int i = 1; i < l - 1; i++) {
            minDiff = Math.min(minDiff, arr[i + 1] - arr[i]);
        }
        
        // Collect all pairs with minimum difference
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < l - 1; i++) {
            if (arr[i + 1] - arr[i] == minDiff) {
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        
        return result;
    }
}
