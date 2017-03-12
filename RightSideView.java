/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightSideView = new ArrayList<>();   
        if (root == null) {
            return rightSideView;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int level;
        while(!queue.isEmpty()) {
            level = queue.size();
            int getVal = 0;
            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();
                if(node.left != null)  {queue.add(node.left);}
                if(node.right != null) {queue.add(node.right);}
                getVal = node.val;
            }
            rightSideView.add(getVal);
        }
        return rightSideView;
    }
}
