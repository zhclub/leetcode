package solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solution.TwoSum;

import java.util.Arrays;

class TwoSumTest {

    @Test
    void test() {
        TwoSum twoSum = new TwoSum();

        Assertions.assertEquals(
                "[0, 1]",
                Arrays.toString(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9))
        );
    }

}
