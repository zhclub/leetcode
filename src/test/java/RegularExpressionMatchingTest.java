import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {

    @Test
    void isMatch() {
        RegularExpressionMatching expression = new RegularExpressionMatching();

        assertFalse(expression.isMatch("aa", "a"));
        assertTrue(expression.isMatch("aa", "a*"));
        assertTrue(expression.isMatch("ab", ".*"));
        assertTrue(expression.isMatch("aab", "c*a*b"));
        assertFalse(expression.isMatch("mississippi", "mis*is*p*."));
        assertTrue(expression.isMatch("mississippi", "mis*is*ip*."));

    }
}