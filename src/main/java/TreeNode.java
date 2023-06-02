import java.util.ArrayList;
import java.util.List;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    /**
     * 前序遍历
     *
     * @param node
     * @return
     */
    public static List<Integer> preorderTraversal(TreeNode node) {
        List<Integer> list = new ArrayList<>();
        list.add(node.val);
        preorder(node, list);
        return list;
    }

    private static void preorder(TreeNode node, List<Integer> list) {
        if (node.left == null && node.right == null) {
            return;
        }

        if (node.left != null) {
            list.add(node.left.val);
            preorder(node.left, list);
        } else {
            list.add(null);
        }

        if (node.right != null) {
            list.add(node.right.val);
            preorder(node.right, list);
        } else {
            list.add(null);
        }
    }
    @Override
    public String toString() {
        return val + "";
    }
}
