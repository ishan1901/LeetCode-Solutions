/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Flatten {
    private static Deque<TreeNode> queue = new ArrayDeque<>();
    public void flatten(TreeNode root) {
        preorder(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            node.right = queue.peek();
            node.left = null;
        }
    }
    private void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        queue.offer(root);
        preorder(root.left);
        preorder(root.right);
    }
}
