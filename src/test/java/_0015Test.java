import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _0015Test {

    @Test
    void threeSum() {
        _0015 a0015 = new _0015();

        List<List<Integer>> lists = a0015.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        assertEquals("[[-1,0,1],[-1,-1,2]]", JSON.toJSONString(lists));
    }
}