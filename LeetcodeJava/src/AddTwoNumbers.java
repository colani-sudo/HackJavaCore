import java.util.Arrays;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode current = head;
        int cOut = 0;

        while(l1 != null)
        {

            int sum = l1.val + l2.val + cOut;
            cOut = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        return head.next;

    }
}


