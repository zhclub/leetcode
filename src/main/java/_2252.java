import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2252 {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<List<Integer>, Integer> columnMap = new HashMap<>();
        Map<List<Integer>, Integer> rowMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            List<Integer> column = new ArrayList<>();
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(grid[i][j]);
                column.add(grid[j][i]);
            }
            columnMap.put(column, columnMap.getOrDefault(column, 0) + 1);
            rowMap.put(row, rowMap.getOrDefault(row, 0) + 1);
        }

        int ret = 0;
        for (Map.Entry<List<Integer>, Integer> entry : rowMap.entrySet()) {
            Integer c = columnMap.getOrDefault(entry.getKey(), 0);
            ret += c * entry.getValue();
        }

        return ret;
    }
}
