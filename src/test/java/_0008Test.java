import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0008Test {

    @Test
    void myAtoi() {
        _0008 atoi = new _0008();

        assertEquals(42, atoi.myAtoi("42"));
        assertEquals(-42, atoi.myAtoi("   -42"));
        assertEquals(4193, atoi.myAtoi("4193 with words"));
        assertEquals(0, atoi.myAtoi("words and 987"));
        assertEquals(-2147483648, atoi.myAtoi("-91283472332"));
    }
}