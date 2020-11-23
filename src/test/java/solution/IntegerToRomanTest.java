package solution;

import org.junit.jupiter.api.Test;
import solution.IntegerToRoman;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    @Test
    void intToRoman() {
        IntegerToRoman integerToRoman = new IntegerToRoman();

        assertEquals("III", integerToRoman.intToRoman(3));
        assertEquals("IV", integerToRoman.intToRoman(4));
        assertEquals("IX", integerToRoman.intToRoman(9));
        assertEquals("LVIII", integerToRoman.intToRoman(58));
        assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));

    }
}