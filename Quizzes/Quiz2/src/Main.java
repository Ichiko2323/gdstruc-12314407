import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        PlayerLinkedList playerLinkedList = new PlayerLinkedList();
        playerLinkedList.addToFront(new Player(1, "Saitama", 999));
        playerLinkedList.addToFront(new Player(2, "Deku", 100));
        playerLinkedList.addToFront(new Player(3, "Saiki K.", 500));

        // Original List
        System.out.print("\nOriginal List: \n");
        playerLinkedList.printLinkedList();
        System.out.print("\nList Size: \n" + playerLinkedList.getSize());

        // Removing First Element
        System.out.println("\nRemoving First Element: \n");
        playerLinkedList.removeFirstElement();
        playerLinkedList.printLinkedList();
        System.out.print("\nList Size: \n" + playerLinkedList.getSize());

        // Check If Player Exists - Found Element
        System.out.println("\n\nCheck if player exists");
        boolean found = playerLinkedList.contains(new Player(2, "Deku", 100));
        int foundIndex = playerLinkedList.indexOf(new Player(2, "Deku", 100));
        System.out.println("Found player? = " + found + " at index " + foundIndex);

        // Check If Player Exists - Not Found Element
        System.out.println("\nCheck if player exists");
        boolean notFound = playerLinkedList.contains(new Player(3, "Saiki K.", 500));
        int notFoundIndex = playerLinkedList.indexOf(new Player(3, "Saiki K.", 500));
        System.out.println("Found player? = " + notFound + " at index " + notFoundIndex);

    }
}