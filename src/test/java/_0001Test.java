import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class _0001Test {

    @Test
    void test() {
        _0001 a0001 = new _0001();

        Assertions.assertEquals(
                "[0, 1]",
                Arrays.toString(a0001.twoSum(new int[]{2, 7, 11, 15}, 9))
        );
    }

}
