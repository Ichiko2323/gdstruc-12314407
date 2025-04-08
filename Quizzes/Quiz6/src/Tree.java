public class Tree {
    private Node root;

    public void insert(int value) {
        // Tree is empty
        if (root == null) {
            root = new Node(value);
            return;
        }

        root.insert(value);
    }

    public void inOrderTraverse() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        root.inOrderTraverse();
    }

    public void inOrderTraverseDescending() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        root.inOrderTraverseDescending();
    }

    public Node get(int value) {
        // tree is empty
        if (root == null) {
            return null;
        }

        return root.get(value);
    }

    public Node getMin() {
        if (root == null) {
            return null;
        }

        // Traverses to the leftmost node
        Node current = root;
        while (current.getLeftChild() != null) {
            current = current.getLeftChild();
        }
        return current;
    }

    public Node getMax() {
        if (root == null) {
            return null;
        }

        // Traverses to the rightmost node
        Node current = root;
        while (current.getRightChild() != null) {
            current = current.getRightChild();
        }
        return current;
    }
}
