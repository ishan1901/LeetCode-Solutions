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
        int previousValue, currentValue;
        ListNode previousNode = head;
        ListNode currentNode = head.next;
        while (currentNode != null) {
            previousValue = previousNode.val;
            currentValue = currentNode.val;
            if (previousValue == currentValue) {
                previousNode.next = currentNode.next;
            } else {
                previousNode = previousNode.next;
            }      
            currentNode = currentNode.next;
        }
        return head;
    }
}
