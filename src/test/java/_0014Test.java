import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0014Test {

    @Test
    void longestCommonPrefix() {
        _0014 a0014 = new _0014();

        assertEquals("fl", a0014.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", a0014.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}