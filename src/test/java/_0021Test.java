import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _0021Test {

    @Test
    void mergeTwoLists() {
        _0021 a0021 = new _0021();

        ListNode l1 = ListNode.generate(new int[]{1, 2, 4});
        ListNode l2 = ListNode.generate(new int[]{1, 3, 4});
        ListNode result = ListNode.generate(new int[]{1, 1, 2, 3, 4, 4});
        assertEquals(result, a0021.mergeTwoLists(l1, l2));
    }
}