package solution;

import domain.ListNode;
import org.junit.jupiter.api.Test;
import util.ListNodeUtils;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void reverseList() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode head = ListNodeUtils.generateListNode(new int[]{1, 2, 3, 4, 5});
        ListNode result = ListNodeUtils.generateListNode(new int[]{5, 4, 3, 2, 1});

        assertEquals(result, reverseLinkedList.reverseList(head));
    }
}