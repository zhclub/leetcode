package solution;

import java.util.Arrays;

/**
 * 4. 寻找两个有序数组的中位数
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        while (nums1.length > 2 && nums2.length > 2) {

            if (computeMedian(nums1) > computeMedian(nums2)) {
                int[] t = nums1;
                nums1 = nums2;
                nums2 = t;
            }

            int len1 = nums1.length;
            int len2 = nums2.length;

            int del1 = len1 - len1 / 2 - 1;
            int del2 = nums2.length % 2 == 0 ? len2 / 2 - 1: len2 / 2;
            int delLen = Math.min(del1, del2);

            if (delLen == 0) {
                break;
            }

            nums1 = delete(nums1, 0, delLen);
            nums2 = delete(nums2, len2 - delLen, len2);
        }

        return computeMedian(nums1, nums2);
    }

    private double computeMedian(int[] nums) {
        if (nums.length % 2 == 0) {
            return (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;
        }

        return nums[nums.length / 2];
    }

    private int[] delete(int[] nums, int begin, int end) {
        int[] num = Arrays.copyOf(nums, nums.length + begin - end);
        System.arraycopy(nums, end, num, begin, nums.length - end);
        return num;
    }

    private double computeMedian(int[] nums1, int[] nums2) {
        int[] nums = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.sort(nums);
        return computeMedian(nums);
    }
}
