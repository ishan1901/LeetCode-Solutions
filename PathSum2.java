/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        LinkedList<Integer> l = new LinkedList<>();
        pathSum(root, sum, result, l);
        return result;
    }
    
    private void pathSum(TreeNode root, int sum, List<List<Integer>> result, LinkedList<Integer> l) {
        if (root == null) {
            return;
        }
        l.add(root.val);
        if (root.left == null && root.right == null) {
            if (root.val == sum) {
                result.add(new LinkedList<Integer>(l));
            }
        }
        pathSum(root.left,sum - root.val, result, l);
        pathSum(root.right,sum - root.val, result, l);
        l.removeLast();
    }
}
