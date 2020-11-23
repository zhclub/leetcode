package solution;

import org.junit.jupiter.api.Test;
import solution.RemoveNthNodeFromEndOfList;
import util.ListNodeUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveNthNodeFromEndOfListTest {

    @Test
    void removeNthFromEnd() {

        RemoveNthNodeFromEndOfList list = new RemoveNthNodeFromEndOfList();

        assertEquals(ListNodeUtils.generateListNode(new int[]{2}), list.removeNthFromEnd(ListNodeUtils.generateListNode(new int[]{1, 2}), 2));
        assertEquals(ListNodeUtils.generateListNode(new int[]{1, 2, 3, 4}), list.removeNthFromEnd(ListNodeUtils.generateListNode(new int[]{1, 2, 3, 4, 5}), 1));
        assertEquals(ListNodeUtils.generateListNode(new int[]{1, 2, 3, 5}), list.removeNthFromEnd(ListNodeUtils.generateListNode(new int[]{1, 2, 3, 4, 5}), 2));
        assertEquals(ListNodeUtils.generateListNode(new int[]{1, 2, 4, 5}), list.removeNthFromEnd(ListNodeUtils.generateListNode(new int[]{1, 2, 3, 4, 5}), 3));
    }
}