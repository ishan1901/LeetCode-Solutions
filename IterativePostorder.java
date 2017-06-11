/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class IterativePostorder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        Set<TreeNode> visited = new HashSet<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.peek();
            if (current.left != null && !visited.contains(current.left)) {
               stack.push(current.left); 
            } else if (current.right != null && !visited.contains(current.right)){
                stack.push(current.right);
            } else {
                TreeNode visitingNode = stack.pop();
                result.add(visitingNode.val);
                visited.add(visitingNode);
            }
        }
        return result;
    }
}
