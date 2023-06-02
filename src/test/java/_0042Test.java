import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _0042Test {

    @Test
    void trap() {
        _0042 a0042 = new _0042();
        assertEquals(6, a0042.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(9, a0042.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}