import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _0647Test {

    @Test
    void countSubstrings() {
        _0647 a0647 = new _0647();
        assertEquals(3, a0647.countSubstrings("abc"));
        assertEquals(6, a0647.countSubstrings("hello"));
        assertEquals(6, a0647.countSubstrings("aaa"));
    }
}