package util;

import domain.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TreeUtils {

    private static List<Integer> list;

    /**
     * 前序遍历
     *
     * @param node
     * @return
     */
    public static List<Integer> preorderTraversal(TreeNode node) {
        list = new ArrayList<>();
        list.add(node.val);
        preorder(node);
        return list;
    }

    private static void preorder(TreeNode node) {
        if (node.left == null && node.right == null) {
            return;
        }

        if (node.left != null) {
            list.add(node.left.val);
            preorder(node.left);
        } else {
            list.add(null);
        }

        if (node.right != null) {
            list.add(node.right.val);
            preorder(node.right);
        } else {
            list.add(null);
        }
    }
}
