package util;

import domain.ListNode;

public class ListNodeUtils {

    public static ListNode generateListNode(int[] nums) {

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
