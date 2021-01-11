package solution;

import domain.ListNode;

/**
 * 206. 反转链表
 *
 *
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // 保存头节点
        ListNode node = reverseList(head.next);

        // 反转
        head.next.next = head;
        head.next = null;

        return node;
    }
}
