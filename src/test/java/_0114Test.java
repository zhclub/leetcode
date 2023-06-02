import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0114Test {

    @Test
    void flatten() {
        _0114 flatten = new _0114();

        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2, node3, node4);
        TreeNode node5 = new TreeNode(5, null, new TreeNode(6));
        TreeNode root = new TreeNode(1, node2, node5);

        flatten.flatten(root);

        assertEquals("[1, null, 2, null, 3, null, 4, null, 5, null, 6]", TreeNode.preorderTraversal(root).toString());
    }
}