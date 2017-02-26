/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        // initialize nodes for swapping
        ListNode current = head;
        ListNode forward = head.next;
        boolean run = true;
        while(run) {
            current.next = forward.next;
            forward.next = current;
            forward = current.next;
            if (forward == null || forward.next == null) {break;}
            current.next = forward.next;
            current = forward;
            forward = current.next;
        }
        
        return newHead;
    }
}
