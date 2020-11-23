package solution;

import org.junit.jupiter.api.Test;
import solution.AddTwoNumbers;
import solution.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        ListNode l1 = generateListNode(9);
        ListNode l2 = generateListNode(9999999991L);
        assertEquals("10000000000", toString(new AddTwoNumbers().addTwoNumbers(l1, l2)));
    }

    private ListNode generateListNode(long num) {
        ListNode head = new ListNode((int) (num % 10));
        ListNode listNode = head;
        num /= 10;
        for (; num > 0; num /= 10) {
            ListNode node = new ListNode((int) (num % 10));
            listNode.next = node;
            listNode = node;
        }
        return head;
    }

    private String toString(ListNode node) {
        StringBuilder s = new StringBuilder();
        for (; node != null; node = node.next) {
            s.insert(0, node.val);
        }

        return s.toString();
    }
}