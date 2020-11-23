package solution;

import org.junit.jupiter.api.Test;
import solution.ContainerWithMostWater;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    void maxArea() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

        int i = containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        assertEquals(i, 49);
    }
}