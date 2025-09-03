import java.util.*;

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}

public class TreeDemo {
    public static TreeNode buildBT(Integer arr[]){
        if(arr.length == 0 || arr[0] == null) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        int l = arr.length;

        while(i<l){
            TreeNode curr = q.poll();
            if(i<l && arr[i]!=null) 
                q.add(curr.left = new TreeNode(arr[i]));
            i++;
            if(i<l && arr[i]!=null)
                q.add(curr.right = new TreeNode(arr[i]));
            i++;
        }
        return root;
    }

    public static TreeNode insertBST(TreeNode root,int val){
        if(root == null) return new TreeNode(val);

        if(val<root.val)
            root.left = insertBST(root.left,val);
        else
            root.right = insertBST(root.right,val);

        return root;
    }

    public static TreeNode buildBST(Integer arr[]){
        if(arr.length==0 || arr[0]==null ) return null;
        TreeNode root = null;
        for(Integer val : arr)
            if(val != null)
                root = insertBST(root, val);
        return root;
    }

    public static List<Integer> levelOrder(TreeNode root){

        if(root == null) return null;

        List<Integer> li = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            li.add(curr.val);
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
        return li;
    }

    public static void preOrder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    public static void postOrder(TreeNode root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }

    public static boolean checkStrictBT(TreeNode root){
        if(root == null) 
            return true;

        if(root.right == null && root.left == null) 
            return true;
        
        if(root.left != null && root.right != null)
            return checkStrictBT(root.left) && checkStrictBT(root.right);

        return false;
    }



    public static void main(String[] args){
        List<Integer> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element until (-1)");
        while (true) { 
            int num = sc.nextInt();
            if(num == -1)
                break;
            li.add(num);

        }
        //Integer arr[] = {1,2,3,4,5,6,7,8,9,10};
        Integer arr[] = new Integer[li.size()];
        int i = 0;
        for(Integer n : li){
            arr[i++] = n;
        }
        TreeNode root = buildBT(arr);
        List<Integer> res = levelOrder(root);

        System.out.print("Level Order: ");
        for(Integer n : res) System.out.print(n+" ");
        System.out.println();

        System.out.print("Pre Order: ");
        preOrder(root);
        System.out.println();

        System.out.print("In Order: ");
        inOrder(root);
        System.out.println();

        System.out.print("Post Order: ");
        postOrder(root);
        System.out.println();

        System.out.println("BST Functions:");
        TreeNode rootBST = buildBST(arr);
        System.out.print("In Order: ");
        inOrder(rootBST);
        System.out.println();


    }
}



// public static TreeNode deleteBST(TreeNode root, int key)
//     {
//         if (root == null) return null;

//         if (key < root.val) {
//             root.left = deleteBST(root.left, key);
//         } else if (key > root.val) {
//             root.right = deleteBST(root.right, key);
//         } else {
//             // ✅ Found the node to delete
//             if (root.left == null && root.right == null) {
//                 return null; // Case 1: No child
//             } 
//             else if (root.left == null) {
//                 return root.right; // Case 2: One child (right)
//             } 
//             else if (root.right == null) {
//                 return root.left; // Case 2: One child (left)
//             } 
//             else {
//                 // Case 3: Two children → find inorder successor
//                 TreeNode successor = findMin(root.right);
//                 root.val = successor.val;
//                 root.right = deleteBST(root.right, successor.val);
//             }
//         }
//         return root;
//     }

//     // Helper: Find minimum value node
//     private static TreeNode findMin(TreeNode node) {
//         while (node.left != null) {
//             node = node.left;
//         }
//         return node;
//     }