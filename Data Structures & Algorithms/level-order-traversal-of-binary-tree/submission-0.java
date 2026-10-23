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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        walkTree(root, 0, ans);
        return ans;
    }

    private void walkTree(TreeNode root, int depth, List<List<Integer>> ans){
        if(root==null){
            return;
        }
        List<Integer> sameLevelList;
        if(depth<=ans.size()-1){
            sameLevelList = ans.get(depth);
        }else{
            sameLevelList = new ArrayList<>();
            ans.add(sameLevelList);
        }
        sameLevelList.add(root.val);
        walkTree(root.left, depth + 1, ans);
        walkTree(root.right, depth + 1, ans);
    }
}
