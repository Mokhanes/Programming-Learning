import java.util.Scanner;

public class BinaryTreeCreationByUser {

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

    public static void main(String[] args) {
        BinaryTreeCreationByUser tree = new BinaryTreeCreationByUser();
        tree.root = 1tree.CreateTree();
        System.out.println("Inorder Traversal of the binary tree:");
        tree.inorderTraversal(tree.root);
    }
}