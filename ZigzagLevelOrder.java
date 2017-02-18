/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> levelList;
        if (root == null) {
            return finalList;
        }
        Deque<TreeNode> stack1 = new ArrayDeque<>();
        Deque<TreeNode> stack2 = new ArrayDeque<>();
        stack1.push(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            TreeNode node;
            levelList = new ArrayList<>();
            while(!stack1.isEmpty()) {
                node = stack1.pop();
                if(node.left  != null) {stack2.push(node.left);}
                if(node.right != null) {stack2.push(node.right);}
                levelList.add(node.val);
            }
            if (!levelList.isEmpty()) {
                finalList.add(levelList);
            }
            levelList = new ArrayList<>();
            while(!stack2.isEmpty()) {
                node = stack2.pop();
                if (node.right != null) {stack1.push(node.right);}
                if (node.left  != null) {stack1.push(node.left) ;}
                levelList.add(node.val);
            }
            if (!levelList.isEmpty()) {
                finalList.add(levelList);
            }
            
        }
        return finalList;
    }
}
