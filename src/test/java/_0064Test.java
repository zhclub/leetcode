import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _0064Test {

    @Test
    void minPathSum() {
        _0064 a64 = new _0064();

        int[][] a = new int[][] {{1,3,1}, {1,5,1}, {4,2,1}};
        assertEquals(7, a64.minPathSum(a));
    }
}