import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0007Test {

    @Test
    void reverse() {
        _0007 a0007 = new _0007();

        assertEquals(123, a0007.reverse(321));
        assertEquals(-123, a0007.reverse(-321));
        assertEquals(21, a0007.reverse(120));
    }
}