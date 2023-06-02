/**
 * 114. 二叉树展开为链表
 * 给定一个二叉树，原地将它展开为一个单链表。
 * <p>
 * 例如，给定二叉树
 * <p>
 * 1
 * / \
 * 2   5
 * / \   \
 * 3   4   6
 * 将其展开为：
 * <p>
 * 1
 * \
 * 2
 * \
 * 3
 * \
 * 4
 * \
 * 5
 * \
 * 6
 */
public class _0114 {

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flattenLoop(root);
    }

    public TreeNode flattenLoop(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root;
        }

        if (root.left == null) {
            return flattenLoop(root.right);
        }

        TreeNode leftLast, rightLast = null;
        leftLast = flattenLoop(root.left);
        if (root.right != null) {
            rightLast = flattenLoop(root.right);
        }

        leftLast.right = root.right;
        root.right = root.left;
        root.left = null;
        return rightLast == null ? leftLast : rightLast;
    }
}
