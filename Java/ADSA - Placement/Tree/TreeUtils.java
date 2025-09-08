import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
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

public class TreeUtils {
    public static void printTree(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        printTree(root.right, level + 1);
        System.out.println("    ".repeat(level) + root.val);
        printTree(root.left, level + 1);
    }

    // Method to build a binary tree from an array representation
    public static TreeNode buildBT(Integer[] arr){
        if(arr.length == 0 || arr[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        int i = 1;
        while(!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            if(i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
            }
            i++;

            if(i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    public static TreeNode buildBST(Integer[] arr) {
        TreeNode root = null;

        for (Integer value : arr) {
            if (value != null) {
                root = insertBST(root, value);
            }
        }
        return root;
    }

    public static TreeNode insertBST(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.val) {
            node.left = insertBST(node.left, value);
        } else if (value > node.val) {
            node.right = insertBST(node.right, value);
        }
        return node;
    }

    public static List<Integer> treeToArray(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return result;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current != null) {
                result.add(current.val);
                queue.add(current.left);
                queue.add(current.right);
            } else {
                result.add(null);
            }
        }

        // Remove trailing nulls
        int i = result.size() - 1;
        while (i >= 0 && result.get(i) == null) {
            result.remove(i);
            i--;
        }
        
        return result;
    }
}
