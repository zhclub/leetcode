import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0010Test {

    @Test
    void isMatch() {
        _0010 expression = new _0010();

        assertFalse(expression.isMatch("aa", "a"));
        assertTrue(expression.isMatch("aa", "a*"));
        assertTrue(expression.isMatch("ab", ".*"));
        assertTrue(expression.isMatch("aab", "c*a*b"));
        assertFalse(expression.isMatch("mississippi", "mis*is*p*."));
        assertTrue(expression.isMatch("mississippi", "mis*is*ip*."));

    }
}