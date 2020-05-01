import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerAtoiTest {

    @Test
    void myAtoi() {
        StringToIntegerAtoi atoi = new StringToIntegerAtoi();

        assertEquals(42, atoi.myAtoi("42"));
        assertEquals(-42, atoi.myAtoi("   -42"));
        assertEquals(4193, atoi.myAtoi("4193 with words"));
        assertEquals(0, atoi.myAtoi("words and 987"));
        assertEquals(-2147483648, atoi.myAtoi("-91283472332"));
    }
}