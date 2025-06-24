// LeetCode Problem: MinimumDepthOfBinaryTree 111
// Solution by: @Pranav-P-S

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        return dfs(root, 0);
    }
    
    private int dfs(TreeNode root, int depth) {
        if (root == null) {
            return Integer.MAX_VALUE; // Return "infinity" for null nodes
        }
        
        // If it's a leaf node, return current depth + 1
        if (root.left == null && root.right == null) {
            return depth + 1;
        }
        
        // Recursively find min depth of left and right subtrees
        int leftDepth = dfs(root.left, depth + 1);
        int rightDepth = dfs(root.right, depth + 1);
        
        return Math.min(leftDepth, rightDepth);
    }
}