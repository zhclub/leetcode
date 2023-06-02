/**
 * 19. 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 * <p>
 * 进阶：
 * <p>
 * 你能尝试使用一趟扫描实现吗？
 */
public class _0019 {

    /**
     * 使用快慢指针，快指针先走n个节点，然后两个指针同时遍历，当快指针指到空时，慢指针就是要删除的节点。
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode fast = head, slow = dummy;

        for (int i = 0; i < n; i++, fast = fast.next) ;

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    /**
     * 先计算长度，然后删除
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        int count = 0;
        for (ListNode node = head; node != null; count++, node = node.next) ;

        if (count == n) {
            return head.next;
        }

        int i = 0;
        for (ListNode node = head; node != null; i++, node = node.next) {
            if (i == count - n - 1) {
                node.next = node.next.next;
                return head;
            }
        }

        return null;
    }

}
