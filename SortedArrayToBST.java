/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = null;
        root = binary(0, nums.length -1, nums, root);
        return root;
    }
    
    private TreeNode binary(int start, int end, int[] nums, TreeNode root) {
        if (start > end) { return null; }
        int mid = start + (end-start)/2;
        root = new TreeNode(nums[mid]);
        root.left = binary(start, mid -1, nums, root);
        root.right = binary(mid+1, end, nums, root);
        return root;
    }
}
