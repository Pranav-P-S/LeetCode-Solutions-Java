// LeetCode Problem: FinalValueAfterOperations 2011
// Solution by: @Pranav-P-S

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String op : operations) {
            if (op.charAt(1) == '+') {
                X++;
            } else {
                X--;
            }
        }
        return X;
    }

}