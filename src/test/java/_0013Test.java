import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0013Test {

    @Test
    void romanToInt() {
        _0013 a0013 = new _0013();

        assertEquals(3, a0013.romanToInt("III"));
        assertEquals(4, a0013.romanToInt("IV"));
        assertEquals(9, a0013.romanToInt("IX"));
        assertEquals(58, a0013.romanToInt("LVIII"));
        assertEquals(1994, a0013.romanToInt("MCMXCIV"));
    }
}