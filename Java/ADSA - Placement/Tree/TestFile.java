public class TestFile {
    public static void main(String[] args) {
        // Example usage of TreeUtils to build and print a binary tree
        Integer[] arr = {1, 2, 3, null, 4, 5, 6};
        TreeNode root = TreeUtils.buildBT(arr);
        System.out.println("Binary Tree:");
        TreeUtils.printTree(root, 0);
    }
}
