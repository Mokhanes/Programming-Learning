import java.util.Scanner;

public class FindMaximunDepth {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    public Node CreateTree() {
        int data;
        System.out.print("Enter node data (-1 for no node): ");
        Scanner ob = new Scanner(System.in);
        data = ob.nextInt();

        if (data == -1) {
            return null;
        }

        Node newNode = new Node(data);
        System.out.println("Creating left child of " + data);
        newNode.left = CreateTree();
        System.out.println("Creating right child of " + data);
        newNode.right = CreateTree();

        return newNode;
    }

    public void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    public void preorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public void postorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public int findMaxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftDepth = findMaxDepth(node.left);
            int rightDepth = findMaxDepth(node.right);
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
    
    public static void main(String[] args) {
        FindMaximunDepth tree = new FindMaximunDepth();
        tree.root = 1tree.CreateTree();
      
        System.out.println("Inorder Traversal of the binary tree:");
        tree.inorderTraversal(tree.root);
       
        System.out.println("\nPreorder Traversal of the binary tree:");
        tree.preorderTraversal(tree.root);
       
        System.out.println("\nPostorder Traversal of the binary tree:");
        tree.postorderTraversal(tree.root);
    }
}