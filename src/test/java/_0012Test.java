import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0012Test {

    @Test
    void intToRoman() {
        _0012 a0012 = new _0012();

        assertEquals("III", a0012.intToRoman(3));
        assertEquals("IV", a0012.intToRoman(4));
        assertEquals("IX", a0012.intToRoman(9));
        assertEquals("LVIII", a0012.intToRoman(58));
        assertEquals("MCMXCIV", a0012.intToRoman(1994));

    }
}