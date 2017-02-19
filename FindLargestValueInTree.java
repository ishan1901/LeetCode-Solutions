/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class FindLargestValueInTree {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> valueList = new ArrayList<>();
        if (root == null) {
            return valueList;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int level;
        int max;
        while (!queue.isEmpty()) {
            level = queue.size();
            max = Integer.MIN_VALUE;
            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();
                if (node.left != null)  {queue.add(node.left);}
                if (node.right != null) {queue.add(node.right);}
                if (max < node.val) {
                    max = node.val;
                }
            }
            valueList.add(max);
        }
        return valueList;
    }
}
