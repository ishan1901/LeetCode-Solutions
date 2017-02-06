/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0, carry = 0;
        ListNode result = new ListNode(0);
        boolean isStart = true;
        ListNode head = result;
        while (l1 != null || l2 != null || carry > 0) {
            int a = (l1 == null) ? 0 : l1.val;
            int b = (l2 == null) ? 0 : l2.val;
            sum = a + b + carry;
            if (sum > 9) {
                carry = sum / 10;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            
            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
            
            if (isStart) {
                result.val = sum;
                isStart = false;
                continue;
            }
            ListNode newNode = new ListNode(sum);
            result.next = newNode;
            result = result.next;

        }
        return head;
    }
}
