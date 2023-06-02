import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _0019Test {

    @Test
    void removeNthFromEnd() {

        _0019 list = new _0019();

        assertEquals(ListNode.generate(new int[]{2}), list.removeNthFromEnd(ListNode.generate(new int[]{1, 2}), 2));
        assertEquals(ListNode.generate(new int[]{1, 2, 3, 4}), list.removeNthFromEnd(ListNode.generate(new int[]{1, 2, 3, 4, 5}), 1));
        assertEquals(ListNode.generate(new int[]{1, 2, 3, 5}), list.removeNthFromEnd(ListNode.generate(new int[]{1, 2, 3, 4, 5}), 2));
        assertEquals(ListNode.generate(new int[]{1, 2, 4, 5}), list.removeNthFromEnd(ListNode.generate(new int[]{1, 2, 3, 4, 5}), 3));
    }
}