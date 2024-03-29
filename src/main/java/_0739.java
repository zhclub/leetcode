import java.util.Deque;
import java.util.LinkedList;

/**
 * 739. 每日温度
 * 请根据每日 气温 列表，重新生成一个列表。对应位置的输出为：要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用 0 来代替。
 * <p>
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 * <p>
 * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
 */
public class _0739 {

    public int[] dailyTemperatures(int[] T) {
        int[] r = new int[T.length];
        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < T.length; i++) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
                    Integer index = stack.pop();
                    r[index] = i - index;
                }
            }
            stack.push(i);
        }
        return r;
    }

    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();
        System.out.println(stack.isEmpty());
        System.out.println(stack.getFirst());
    }
}
