// LeetCode Problem: SameTree 100
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p==null)&&(q==null)) return true;
        else{
            if (p==null) return false;
            if (q==null) return false;
            if(p.val==q.val) return (isSameTree(p.left,q.left)&&isSameTree(p.right,q.right));
            else return false;
        }
    }
}
