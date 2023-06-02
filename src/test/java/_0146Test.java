import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

class _0146Test {

    @Test
    void test() {
        String param1 = "[\"_0146\",\"get\",\"get\",\"put\",\"get\",\"put\",\"put\",\"put\",\"put\",\"get\",\"put\"]";
        String param2 = "[[1],[6],[8],[12,1],[2],[15,11],[5,2],[1,15],[4,2],[5],[15,15]]";
        String[] action = JSON.parseObject(param1, String[].class);
        int[][] val = JSON.parseObject(param2, int[][].class);
        _0146 cache = null;
        for (int i = 0; i < action.length; i++) {
            System.out.printf("%5d:  ", i);
            switch (action[i]) {
                case "_0146":
                    cache = new _0146(val[i][0]);
//                    System.out.print("null, ");
                    break;
                case "put":
                    cache.put(val[i][0], val[i][1]);
//                    System.out.print("null, ");
                    break;
                case "get":
                    int v = cache.get(val[i][0]);
//                    System.out.print(v + ", ");
                    break;
            }
        }

        System.out.println();
    }
}