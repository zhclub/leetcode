import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _0011Test {

    @Test
    void maxArea() {
        _0011 containerWithMostWater = new _0011();

        int i = containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        assertEquals(i, 49);
    }
}