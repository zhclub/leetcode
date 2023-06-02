import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0130Test {

    @Test
    void solve() {
        char[][] param = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};

        new _0130().solve(param);
        char[][] result = {{'X','X','X','X'},{'X','X','X','X'},{'X','X','X','X'},{'X','O','X','X'}};
        assertArrayEquals(param, result);
    }
}