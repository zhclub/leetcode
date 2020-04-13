import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumPathSumTest {

    @Test
    void minPathSum() {
        MinimumPathSum minimumPathSum = new MinimumPathSum();

        int[][] a = new int[][] {{1,3,1}, {1,5,1}, {4,2,1}};
        assertEquals(7, minimumPathSum.minPathSum(a));
    }
}