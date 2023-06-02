import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0009Test {

    @Test
    void isPalindrome() {
        _0009 a0009 = new _0009();

        assertTrue(a0009.isPalindrome(2));
        assertFalse(a0009.isPalindrome(-121));
        assertFalse(a0009.isPalindrome(10));
    }
}