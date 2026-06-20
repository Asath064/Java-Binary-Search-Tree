public class BinarySearchTree {

    TreeNode root;

    // Insert Node
    public TreeNode insert(TreeNode root, int data) {

        if (root == null) {
            return new TreeNode(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        }
        else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Search Node
    public boolean search(TreeNode root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        }

        return search(root.right, key);
    }

    // Find Minimum Value Node
    private TreeNode findMin(TreeNode root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    // Delete Node
    public TreeNode delete(TreeNode root, int key) {

        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = delete(root.left, key);
        }
        else if (key > root.data) {
            root.right = delete(root.right, key);
        }
        else {

            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            TreeNode minNode = findMin(root.right);

            root.data = minNode.data;

            root.right = delete(root.right, minNode.data);
        }

        return root;
    }

    // Inorder Traversal
    public void inorder(TreeNode root) {

        if (root != null) {

            inorder(root.left);

            System.out.print(root.data + " ");

            inorder(root.right);
        }
    }

    // Preorder Traversal
    public void preorder(TreeNode root) {

        if (root != null) {

            System.out.print(root.data + " ");

            preorder(root.left);

            preorder(root.right);
        }
    }

    // Postorder Traversal
    public void postorder(TreeNode root) {

        if (root != null) {

            postorder(root.left);

            postorder(root.right);

            System.out.print(root.data + " ");
        }
    }
}
