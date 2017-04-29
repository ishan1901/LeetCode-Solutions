public class SumNumbers {
    int add = 0;
    public int sumNumbers(TreeNode root) {
        sumNumbers(root, 0);
        return add;
    }
    
    public void sumNumbers(TreeNode root, int sum) {
        if (root == null) {
            return;
        } 
        sum += root.val;
        if (root.left == null && root.right == null) {
            add += sum;
            return;
        }
        if (root.left != null) {
            sumNumbers(root.left, sum * 10);
        }
        if (root.right != null) {
            sumNumbers(root.right, sum *10);
        }
    }
}
