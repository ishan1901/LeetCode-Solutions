/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oddNode = head;
        ListNode evenNode = head.next, saveEvenNode = head.next;
        while (oddNode.next != null && evenNode.next != null) {
            oddNode.next =  evenNode.next;
            oddNode = oddNode.next;
            if (oddNode.next != null) {
                evenNode.next = oddNode.next;
                evenNode = evenNode.next; 
            }
        }
        if (oddNode.next == null) {
            evenNode.next = null;
        }
        oddNode.next = saveEvenNode;
        return head;
    }
}
