package solution;

import org.junit.jupiter.api.Test;
import solution.MedianOfTwoSortedArrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArraysTest {

    @Test
    void findMedianSortedArrays() {
        MedianOfTwoSortedArrays median = new MedianOfTwoSortedArrays();

        assertEquals(4, median.findMedianSortedArrays(new int[]{1, 5, 6}, new int[]{2, 3, 4, 7}));
        assertEquals(4, median.findMedianSortedArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6, 7}));

    }
}