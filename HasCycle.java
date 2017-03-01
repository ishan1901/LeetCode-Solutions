public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode current = head;
        ListNode forward = head;
        while(forward.next != null && forward.next.next != null) {
            current = current.next;
            forward = forward.next.next;
            if (current == forward) {
                return true;
            }
        } 
        return false;
    }
}
