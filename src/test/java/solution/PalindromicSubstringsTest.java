package solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromicSubstringsTest {

    @Test
    void countSubstrings() {
        PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();
        assertEquals(3, palindromicSubstrings.countSubstrings("abc"));
        assertEquals(6, palindromicSubstrings.countSubstrings("hello"));
        assertEquals(6, palindromicSubstrings.countSubstrings("aaa"));
    }
}