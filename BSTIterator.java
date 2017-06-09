/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    
    private TreeNode root;
    private Deque<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        this.root = root;
        stack = new ArrayDeque<>();
        fillStack(root);
    }
    
    private void fillStack(TreeNode node) {
        if (node == null) {
            return;
        }
        stack.push(node);
        fillStack(node.left);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        }
        return true;
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode current = stack.pop();
        if(current.right != null) {
            fillStack(current.right);
        }
        return current.val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
