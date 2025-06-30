// LeetCode Problem: PathSum 112
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return repath(root,targetSum,0);
    }
    public boolean repath(TreeNode root, int targetSum,int sum){
        if (root==null) return false;
        if((root.left==null)&&(root.right==null)){
            sum+=root.val;
            if (targetSum==sum) return true;
            else return false;
        }
        else {
            sum+=root.val;
            return (repath(root.left,targetSum,sum)||repath(root.right,targetSum,sum));
        }
    }
}
