package solution;

import domain.ListNode;
import org.junit.jupiter.api.Test;
import util.ListNodeUtils;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    void mergeTwoLists() {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        ListNode l1 = ListNodeUtils.generateListNode(new int[]{1, 2, 4});
        ListNode l2 = ListNodeUtils.generateListNode(new int[]{1, 3, 4});
        ListNode result = ListNodeUtils.generateListNode(new int[]{1, 1, 2, 3, 4, 4});
        assertEquals(result, mergeTwoSortedLists.mergeTwoLists(l1, l2));
    }
}