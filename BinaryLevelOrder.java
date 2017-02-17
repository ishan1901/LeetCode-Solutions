public class BinaryLevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finalResult = new ArrayList<>();
        if (root == null) {
            return finalResult;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            level = queue.size();
            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();
                if (node.left  != null) { queue.add(node.left); }
                if (node.right != null) { queue.add(node.right); }
                levelList.add(node.val);
            }
            finalResult.add(levelList);
        }
        return finalResult;
        
    }
}
