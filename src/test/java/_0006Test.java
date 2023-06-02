import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0006Test {

    @Test
    void convert() {
        _0006 a0006 = new _0006();

        assertEquals("LCIRETOESIIGEDHN", a0006.convert("LEETCODEISHIRING", 3));
        assertEquals("LDREOEIIECIHNTSG", a0006.convert("LEETCODEISHIRING", 4));
        assertEquals("PAHNAPLSIIGYIR", a0006.convert("PAYPALISHIRING", 3));
    }
}