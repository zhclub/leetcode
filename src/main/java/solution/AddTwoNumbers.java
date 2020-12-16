package solution;

import domain.ListNode;

public class AddTwoNumbers {

    private int carry = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ret = new ListNode(0);

        while (l1 == null && l2 == null) {

        }

        return addNext(l1, l2);
    }

    private ListNode addNext(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return carry == 1 ? new ListNode(1) : null;
        }

        int num = (l1 == null ? 0 : l1.val)
                + (l2 == null ? 0 : l2.val)
                + carry;

        carry = num >= 10 ? 1 : 0;
        ListNode node = new ListNode(num % 10);
        node.next = addNext(l1.next, l2.next);
        return node;
    }

}
