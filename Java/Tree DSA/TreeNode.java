public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() { }

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }

    TreeNode(int x, TreeNode left, TreeNode right) {
        val = x;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}
