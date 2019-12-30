import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianofTwoSortedArraysTest {

    @Test
    void findMedianSortedArrays() {
        MedianofTwoSortedArrays median = new MedianofTwoSortedArrays();

        assertEquals(4, median.findMedianSortedArrays(new int[]{1, 5, 6}, new int[]{2, 3, 4, 7}));
        assertEquals(4, median.findMedianSortedArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6, 7}));

    }
}