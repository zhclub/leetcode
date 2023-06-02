/**
 * 64. 最小路径和
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * <p>
 * 说明：每次只能向下或者向右移动一步。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 */
public class _0064 {

    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] += getMinPath(grid, i, j);
            }
        }

        return grid[grid.length - 1][grid[0].length - 1];
    }

    private int getMinPath(int[][] grid, int i, int j) {
        if (i == 0 && j == 0) {
            return 0;
        }

        int a = i == 0 ? Integer.MAX_VALUE : grid[i - 1][j];
        int b = j == 0 ? Integer.MAX_VALUE : grid[i][j - 1];
        return Math.min(a, b);
    }

}
