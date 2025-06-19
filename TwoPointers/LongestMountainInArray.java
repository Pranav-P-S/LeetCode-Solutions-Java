// LeetCode Problem: LongestMountainInArray 845
// Solution by: @Pranav-P-S

class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int result = 0;
        int i = 1;
        
        while (i < n - 1) {
            // Check if current is a peak
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int left = i - 1;
                int right = i + 1;
                
                // Expand left
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }
                
                // Expand right
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }
                
                result = Math.max(result, right - left + 1);
                i = right;  // Skip to end of current mountain
            } else {
                i++;
            }
        }
        return result;
    }
}
