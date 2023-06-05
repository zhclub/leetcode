import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2252Test {

    @Test
    void equalPairs() {
        String s = "[[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]";
        int[][] a = JSON.parseObject(s, new TypeReference<int[][]>() {
        }.getType());

        System.out.println(new _2252().equalPairs(a));
    }
}