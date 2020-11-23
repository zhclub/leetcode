package solution;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import solution.ThreeSum;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    void threeSum() {
        ThreeSum threeSum = new ThreeSum();

        List<List<Integer>> lists = threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        assertEquals("[[-1,0,1],[-1,-1,2]]", JSON.toJSONString(lists));
    }
}