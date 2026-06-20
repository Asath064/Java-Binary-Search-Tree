import java.util.Scanner;

public class BSTDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BinarySearchTree bst = new BinarySearchTree();

        int choice;

        do {

            System.out.println("\n===== BINARY SEARCH TREE =====");
            System.out.println("1. Insert Node");
            System.out.println("2. Search Node");
            System.out.println("3. Delete Node");
            System.out.println("4. Inorder Traversal");
            System.out.println("5. Preorder Traversal");
            System.out.println("6. Postorder Traversal");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Value: ");
                    int value = sc.nextInt();

                    bst.root = bst.insert(bst.root, value);

                    System.out.println("Node Inserted Successfully!");
                    break;

                case 2:

                    System.out.print("Enter Value to Search: ");
                    int searchValue = sc.nextInt();

                    if (bst.search(bst.root, searchValue)) {
                        System.out.println("Node Found!");
                    } else {
                        System.out.println("Node Not Found!");
                    }

                    break;

                case 3:

                    System.out.print("Enter Value to Delete: ");
                    int deleteValue = sc.nextInt();

                    bst.root = bst.delete(bst.root, deleteValue);

                    System.out.println("Node Deleted Successfully!");
                    break;

                case 4:

                    System.out.print("Inorder Traversal: ");
                    bst.inorder(bst.root);
                    System.out.println();

                    break;

                case 5:

                    System.out.print("Preorder Traversal: ");
                    bst.preorder(bst.root);
                    System.out.println();

                    break;

                case 6:

                    System.out.print("Postorder Traversal: ");
                    bst.postorder(bst.root);
                    System.out.println();

                    break;

                case 7:

                    System.out.println("Program Ended!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
