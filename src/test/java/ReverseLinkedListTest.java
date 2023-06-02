import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLinkedListTest {

    @Test
    void reverseList() {
        _0206 a0206 = new _0206();
        ListNode head = ListNode.generate(new int[]{1, 2, 3, 4, 5});
        ListNode result = ListNode.generate(new int[]{5, 4, 3, 2, 1});

        assertEquals(result, a0206.reverseList(head));
    }
}