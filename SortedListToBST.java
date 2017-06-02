/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        TreeNode node = null;
        if (head == null) {
            return node;
        }
        ListNode end = head, start = head;
        while (end != null) {
            end = end.next;
        }
        node = recursive(start, end, node);
        return node;
    }
    
    private TreeNode recursive(ListNode start, ListNode end, TreeNode node){
        if (start == end) {
            return node;
        }
        ListNode mid = start, forward = start;
        while (forward.next != end && forward.next.next != end) {
            forward = forward.next.next;
            mid = mid.next;
        }
        node = insert(mid.val, node);
        recursive(start, mid, node);
        recursive(mid.next, end, node);
        return node;
    }
        
    private TreeNode insert(int val, TreeNode node) {
        if (node == null) {
            node = new TreeNode(val);
            return node;
        }
        if (val <= node.val) {
            node.left = insert(val, node.left);
        } else {
            node.right = insert(val, node.right);
        }
        return node;
    }
}
