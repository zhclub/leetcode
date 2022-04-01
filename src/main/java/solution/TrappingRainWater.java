package solution;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 42. 接雨水
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出：6
 * 解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
 * 示例 2：
 * <p>
 * 输入：height = [4,2,0,3,2,5]
 * 输出：9
 */
public class TrappingRainWater {

    public int trap(int[] height) {
        int size = 0;
        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < height.length; i++) {
            if (!stack.isEmpty()) {
                int temp = 0;
                while (!stack.isEmpty() && height[stack.peek()] < height[i]) {
                    int index = stack.pop();

                    size = Math.max(size, Math.min(height[i], height[index]) * i - index);
                }
            }
            stack.push(i);
        }

        return size;
    }

}
