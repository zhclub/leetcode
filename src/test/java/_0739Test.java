import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0739Test {

    @Test
    void dailyTemperatures() {
        _0739 dailyTemperatures = new _0739();
        //[73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。

        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] r = {1, 1, 4, 2, 1, 1, 0, 0};

        assertArrayEquals(r, dailyTemperatures.dailyTemperatures(T));

    }
}