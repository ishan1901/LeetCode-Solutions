public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
       if(head == null || head.next == null) {
        return null;
      }
      ListNode current =  head;
      ListNode forward = head;
      boolean isCycle = false;
      while(forward.next != null && forward.next.next != null) {
        current = current.next;
        forward = forward.next.next;
        if(current == forward) {
            isCycle = true;
          break;
        }
      }
      current = head;
      while(isCycle) {
        if(current == forward) {
          return current;
        }
        current = current.next;
        forward = forward.next;
      }
      return null;
      }
}
