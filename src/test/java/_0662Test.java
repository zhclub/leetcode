import org.junit.jupiter.api.Test;

class _0662Test {

    @Test
    void widthOfBinaryTree() {
        Integer[] nums = {1,3,2,5,null,null,9,6,null,7};

        TreeNode root = createTree(nums, 0);
        print(root);
//        System.out.println(new _0662().widthOfBinaryTree(root));
    }

    public static TreeNode createTree(Integer[] arr, int i){
        if(i >= arr.length){
            return null;
        }

        if (arr[i] == null) {
            return null;
        }

        TreeNode root = new TreeNode(arr[i]);
        root.left = createTree(arr, 2 * i + 1);
        root.right = createTree(arr, 2 * i + 2);
        return root;
    }

    private void print(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        print(node.left);
        print(node.right);
    }
}