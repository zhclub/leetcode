import java.util.*;

public class _0084 {
    public int largestRectangleArea(int[] heights) {
        Deque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[]{-1, -1});
        int max = 0;

        for (int i = 0; i < heights.length; i++) {
            while (stack.peek()[0] > heights[i]) {
                max = pop(stack, max, i);
            }
            stack.push(new int[]{heights[i], i});
        }

        while (stack.size() > 1) {
            max = pop(stack, max, heights.length);
        }

        return max;
    }

    private int pop(Deque<int[]> stack, int max, int i) {
        int area = stack.pop()[0] * (i - stack.peek()[1] - 1);
        max = Math.max(max, area);
        return max;
    }

}
