package solution;

/**
 * 19. 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 *
 * 你能尝试使用一趟扫描实现吗？
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        for (ListNode node = head; node != null; count++, node = node.next);

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
