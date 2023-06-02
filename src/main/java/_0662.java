import java.util.HashMap;
import java.util.Map;

public class _0662 {

    Map<Integer, long[]> map = new HashMap<>();
    long max = 0;

    public int widthOfBinaryTree(TreeNode root) {
        traversal(root, 1, 0);
        return (int) max;
    }

    private void traversal(TreeNode node, int deep, long pos) {
        if (node == null) {
            return;
        }

        // 快溢出了取个模
        if (pos - 1 > 2147483647) {
            pos = pos % 2147483647;
        }

        long[] ints = map.computeIfAbsent(deep, e -> new long[]{Long.MAX_VALUE, 0});
        ints[0] = Math.min(ints[0], pos);
        ints[1] = Math.max(ints[1], pos);
        max = Math.max(max, ints[1] - ints[0] + 1);

        traversal(node.left, deep + 1, pos * 2);
        traversal(node.right, deep + 1, pos * 2 + 1);
    }

}
