package solution;

import org.junit.jupiter.api.Test;
import solution.ZigzagConversion;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagConversionTest {

    @Test
    void convert() {
        ZigzagConversion zigzagConversion = new ZigzagConversion();

        assertEquals("LCIRETOESIIGEDHN", zigzagConversion.convert("LEETCODEISHIRING", 3));
        assertEquals("LDREOEIIECIHNTSG", zigzagConversion.convert("LEETCODEISHIRING", 4));
        assertEquals("PAHNAPLSIIGYIR", zigzagConversion.convert("PAYPALISHIRING", 3));
    }
}