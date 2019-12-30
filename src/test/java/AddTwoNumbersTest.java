import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        AddTwoNumbers.ListNode l1 = generateListNode(9);
        AddTwoNumbers.ListNode l2 = generateListNode(9999999991L);
        assertEquals("10000000000", toString(new AddTwoNumbers().addTwoNumbers(l1, l2)));
    }

    private AddTwoNumbers.ListNode generateListNode(long num) {
        AddTwoNumbers.ListNode head = new AddTwoNumbers.ListNode((int) (num % 10));
        AddTwoNumbers.ListNode listNode = head;
        num /= 10;
        for (; num > 0; num /= 10) {
            AddTwoNumbers.ListNode node = new AddTwoNumbers.ListNode((int) (num % 10));
            listNode.next = node;
            listNode = node;
        }
        return head;
    }

    private String toString(AddTwoNumbers.ListNode node) {
        StringBuilder s = new StringBuilder();
        for (; node != null; node = node.next) {
            s.insert(0, node.val);
        }

        return s.toString();
    }
}