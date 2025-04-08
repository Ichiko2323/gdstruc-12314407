public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);

        System.out.println("\nAscending: ");
        tree.inOrderTraverse();

        System.out.println("\nDescending: ");
        tree.inOrderTraverseDescending();

        int searchValue = 25;

        System.out.println("\nNode for value " + searchValue + " = " + tree.get(searchValue));

        System.out.println("\nMinimum value: " + tree.getMin().getData());

        System.out.println("\nMaximum value: " + tree.getMax().getData());
    }
}