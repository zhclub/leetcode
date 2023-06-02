import java.util.Objects;

/**
 * 通用链表结点
 */
public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    @Override
    public String toString() {
        ListNode node = this;
        StringBuilder s = new StringBuilder();
        for (; node != null; node = node.next) {
            s.append(node.val);
        }

        return s.toString();
    }

    public static ListNode generate(int[] nums) {
        ListNode head = new ListNode(nums[0]);
        ListNode current = head;

        for (int i = 1; i < nums.length; i++) {
            ListNode listNode = new ListNode(nums[i]);
            current.next = listNode;
            current = listNode;
        }

        return head;
    }
}
