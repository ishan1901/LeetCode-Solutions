/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class NextRightPointers {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeLinkNode> queue = new ArrayDeque<>();
        Deque<TreeLinkNode> holdNodes;
        queue.add(root);
        int level;
        TreeLinkNode node;
        while (!queue.isEmpty()) {
            level = queue.size();
            holdNodes = new ArrayDeque<>();
            for (int i = 0; i < level; i++) {
                node = queue.poll();
                if (node.left != null) {queue.add(node.left);}
                if (node.right != null) {queue.add(node.right);}
                holdNodes.add(node);
            }
            TreeLinkNode leftNode = holdNodes.poll();
            TreeLinkNode rightNode;
            while(!holdNodes.isEmpty()) {
                rightNode = holdNodes.poll();
                leftNode.next = rightNode;
                leftNode = rightNode;
            }
        }
    }
}
