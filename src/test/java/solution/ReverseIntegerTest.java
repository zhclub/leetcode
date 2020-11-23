package solution;

import org.junit.jupiter.api.Test;
import solution.ReverseInteger;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void reverse() {
        ReverseInteger reverseInteger = new ReverseInteger();

        assertEquals(123, reverseInteger.reverse(321));
        assertEquals(-123, reverseInteger.reverse(-321));
        assertEquals(21, reverseInteger.reverse(120));
    }
}