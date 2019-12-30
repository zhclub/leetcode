/**
 * 1. 两数相加
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class AddTwoNumbers {

    private int carry = 0;

    private static final ListNode EMPTY_NODE = new ListNode(0);

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addNext(l1, l2);
    }

    private ListNode addNext(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return carry == 1 ? new ListNode(1) : null;
        }

        // prevent null pointer
        l1 = l1 == null ? EMPTY_NODE : l1;
        l2 = l2 == null ? EMPTY_NODE : l2;

        int num = l1.val + l2.val + carry;
        carry = num >= 10 ? 1 : 0;

        ListNode node = new ListNode(num % 10);
        node.next = addNext(l1.next, l2.next);
        return node;
    }

    static class ListNode {
        int val;

        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

}
