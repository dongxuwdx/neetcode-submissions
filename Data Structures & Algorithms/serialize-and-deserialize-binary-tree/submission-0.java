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

public class Codec {
    
    StringBuilder sb;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        sb = new StringBuilder();
        buildString(root);
        return sb.toString();
    }

    private void buildString(TreeNode root){
        if(root==null){
            sb.append("N,").toString();
            return ;
        }
        sb.append(root.val).append(",");
        buildString(root.left);
        buildString(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
        return buildTree(nodes);
    }

    private TreeNode buildTree(Queue<String> nodes){
        String val = nodes.poll();
        if(val.equals("N")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);
        return root;
    }

}
