public class BinaryTree {
    public Node root;
    public BinaryTree(){
        root = null;
    }

    class Node{
        int data;
        Node left;
        Node right;

        public Node(){

        }
        public Node(int data){
            this.data = data;
            right = null;
            left = null;
        }
    }

    public Node addRec(Node current, int e){
            if (current == null){
                return new Node(e);
            }
            if (e < current.data) {
                current.left = addRec(current.left,e);
            } else if (e > current.data){
                current.right = addRec(current.right,e);
            }       else return current;
            return current;
    }

    public void add(int value){
        root = addRec(root, value);
    }

    public void preorder(Node node){
        if (node != null){
            System.out.print(node.data+"\t");
            preorder(node.left);
            preorder(node.right);
        }

    }
    public void preorder(){
        preorder(root);
        System.out.println();
    }

    public void inorder(Node node){
        if (node != null){
            preorder(node.left);
            System.out.print(node.data +"\t");
            preorder(node.right);
        }
    }
    public void inorder(){
        inorder(root);
        System.out.println();
    }

    public void postorder(Node node){
        if (node != null){
            preorder(node.left);
            preorder(node.right);
            System.out.print(node.data+"\t");
        }
    }

    public void postorder(){
        postorder(root);
        System.out.println();
    }

    public boolean containsNode(Node current, int value){
        if (current == null){
            return false;
        }
        if (value == current.data){
            return true;
        }
        return (value < current.data)?containsNode(current.left,value):containsNode(current.right,value);
    }

    public boolean containsNode(int value){
        return containsNode(root,value);
    }
}
