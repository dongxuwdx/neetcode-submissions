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

    private int ans;

    public int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
        pathSum(root);
        return ans;
    }

    // global ans = max(ans, sum);
    // postorder
    // sum = max(root.val, root.val + left.val, root.val + right.val);

    private int pathSum(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftValue = Math.max(0, pathSum(root.left));
    int rightValue = Math.max(0, pathSum(root.right));

int sum = root.val + leftValue + rightValue;
    ans = Math.max(ans, sum);

        return root.val + Math.max(leftValue, rightValue);
    }
}
