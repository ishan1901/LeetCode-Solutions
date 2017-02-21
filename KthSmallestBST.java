/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 
public class KthSmallestBST {
    private static int count = 0;
    private static int number = 0;
    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        count--;
        if (count == 0) { number = root.val;}
        inorder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        inorder(root);
        return number;
    }
}
