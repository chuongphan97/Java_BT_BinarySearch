public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(6);
        binaryTree.add(4);
        binaryTree.add(8);
        binaryTree.add(3);
        binaryTree.add(5);
        binaryTree.add(7);
        binaryTree.add(9);

        binaryTree.preorder();

        binaryTree.inorder();
        binaryTree.postorder();
        System.out.println(binaryTree.containsNode(3));


    }
}
