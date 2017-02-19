/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<>();
        if (root == null) {
            return finalList;
        }
        List<Integer> levelList;
        Deque<TreeNode> queue = new ArrayDeque<>();
        Deque<List<Integer>> stack = new ArrayDeque<>();
        queue.add(root);
        int level;
        while (!queue.isEmpty()) {
            levelList = new ArrayList<>();
            level = queue.size();
            TreeNode node;
            for (int i = 0; i < level; i++) {
                node = queue.poll();
                if (node.left  != null) {queue.add(node.left);}
                if (node.right != null) {queue.add(node.right);}
                levelList.add(node.val);
            }
            stack.push(levelList);
        }
        while(!stack.isEmpty()) {
            finalList.add(stack.pop());
        }
        return finalList;
    }
}
