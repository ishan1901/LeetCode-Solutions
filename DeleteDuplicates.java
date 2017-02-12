/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode previousNode = head;
        ListNode currentNode = head.next;
        while (currentNode != null) {
            if (previousNode.val == currentNode.val) {
                previousNode.next = currentNode.next;
            } else {
                previousNode = previousNode.next;
            }      
            currentNode = currentNode.next;
        }
        return head;
    }
}
